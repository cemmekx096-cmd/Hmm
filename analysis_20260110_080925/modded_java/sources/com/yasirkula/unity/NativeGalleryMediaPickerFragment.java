package com.yasirkula.unity;

import android.app.Fragment;
import android.content.ContentUris;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.util.Log;
import androidx.media3.common.MimeTypes;
import com.crashlytics.android.BuildConfig;
import com.safedk.android.utils.Logger;
import java.io.File;
import java.util.ArrayList;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class NativeGalleryMediaPickerFragment extends Fragment {
    private static final int MEDIA_REQUEST_CODE = 987455;
    public static final String MEDIA_TYPE_ID = "NGMP_MEDIA_TYPE";
    public static final String MIME_ID = "NGMP_MIME";
    public static final String SAVE_PATH_ID = "NGMP_SAVE_PATH";
    public static final String SELECT_MULTIPLE_ID = "NGMP_MULTIPLE";
    public static final String TITLE_ID = "NGMP_TITLE";
    public static boolean preferGetContent;
    private static String secondaryStoragePath;
    public static boolean tryPreserveFilenames;
    private final NativeGalleryMediaReceiver mediaReceiver;
    private String savePathDirectory;
    private String savePathFilename;
    private ArrayList<String> savedFiles;
    private boolean selectMultiple;

    public static void safedk_NativeGalleryMediaPickerFragment_startActivityForResult_6e052b439f98b3def75d166d82e3ff04(NativeGalleryMediaPickerFragment p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Lcom/yasirkula/unity/NativeGalleryMediaPickerFragment;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        p0.startActivityForResult(p1, p2);
    }

    public NativeGalleryMediaPickerFragment() {
        this.mediaReceiver = null;
    }

    public NativeGalleryMediaPickerFragment(NativeGalleryMediaReceiver nativeGalleryMediaReceiver) {
        this.mediaReceiver = nativeGalleryMediaReceiver;
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        Intent intent;
        super.onCreate(bundle);
        if (this.mediaReceiver == null) {
            getFragmentManager().beginTransaction().remove(this).commit();
            return;
        }
        int i = getArguments().getInt(MEDIA_TYPE_ID);
        String string = getArguments().getString(MIME_ID);
        String string2 = getArguments().getString(TITLE_ID);
        this.selectMultiple = getArguments().getBoolean(SELECT_MULTIPLE_ID);
        String string3 = getArguments().getString(SAVE_PATH_ID);
        int iLastIndexOf = string3.lastIndexOf(47);
        this.savePathFilename = iLastIndexOf >= 0 ? string3.substring(iLastIndexOf + 1) : string3;
        this.savePathDirectory = iLastIndexOf > 0 ? string3.substring(0, iLastIndexOf) : getActivity().getCacheDir().getAbsolutePath();
        if (!preferGetContent && !this.selectMultiple) {
            intent = i == 0 ? new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI) : i == 1 ? new Intent("android.intent.action.PICK", MediaStore.Video.Media.EXTERNAL_CONTENT_URI) : new Intent("android.intent.action.PICK", MediaStore.Audio.Media.EXTERNAL_CONTENT_URI);
        } else {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            if (this.selectMultiple) {
                allowMultipleMedia(intent);
            }
        }
        intent.setType(string);
        if (string2 != null && string2.length() > 0) {
            intent.putExtra("android.intent.extra.TITLE", string2);
        }
        safedk_NativeGalleryMediaPickerFragment_startActivityForResult_6e052b439f98b3def75d166d82e3ff04(this, Intent.createChooser(intent, string2), MEDIA_REQUEST_CODE);
    }

    private void allowMultipleMedia(Intent intent) {
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
    }

    private void fetchPathsOfMultipleMedia(ArrayList<String> arrayList, Intent intent) {
        if (intent.getClipData() != null) {
            int itemCount = intent.getClipData().getItemCount();
            for (int i = 0; i < itemCount; i++) {
                arrayList.add(getPathFromURI(intent.getClipData().getItemAt(i).getUri()));
            }
            return;
        }
        if (intent.getData() != null) {
            arrayList.add(getPathFromURI(intent.getData()));
        }
    }

    private String getPathFromURI(Uri uri) throws Throwable {
        String str;
        String[] strArr;
        Cursor cursorQuery;
        String string;
        if (uri == null) {
            return null;
        }
        Log.d("Unity", "Selected media uri: " + uri.toString());
        if (Build.VERSION.SDK_INT >= 29 && !Environment.isExternalStorageLegacy()) {
            return copyToTempFile(uri);
        }
        try {
            if (Build.VERSION.SDK_INT < 19 || !DocumentsContract.isDocumentUri(getActivity().getApplicationContext(), uri)) {
                str = null;
                strArr = null;
            } else {
                if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
                    String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(":");
                    if ("primary".equalsIgnoreCase(strArrSplit[0])) {
                        return Environment.getExternalStorageDirectory() + File.separator + strArrSplit[1];
                    }
                    if ("raw".equalsIgnoreCase(strArrSplit[0])) {
                        return strArrSplit[1];
                    }
                    return getSecondaryStoragePathFor(strArrSplit[1]);
                }
                if ("com.android.providers.downloads.documents".equals(uri.getAuthority())) {
                    String documentId = DocumentsContract.getDocumentId(uri);
                    if (documentId.startsWith("raw:")) {
                        return documentId.substring(4);
                    }
                    uri = ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue());
                } else if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
                    String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(":");
                    String str2 = strArrSplit2[0];
                    if (MimeTypes.BASE_TYPE_IMAGE.equals(str2)) {
                        uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else if (MimeTypes.BASE_TYPE_VIDEO.equals(str2)) {
                        uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    } else if (MimeTypes.BASE_TYPE_AUDIO.equals(str2)) {
                        uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    } else if ("raw".equals(str2)) {
                        return strArrSplit2[1];
                    }
                    str = "_id=?";
                    strArr = new String[]{strArrSplit2[1]};
                }
                str = null;
                strArr = null;
            }
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                try {
                    cursorQuery = getActivity().getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
                    if (cursorQuery != null) {
                        try {
                            int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_data");
                            if (cursorQuery.moveToFirst() && (string = cursorQuery.getString(columnIndexOrThrow)) != null) {
                                if (string.length() > 0) {
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    return string;
                                }
                            }
                        } catch (Exception unused) {
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return copyToTempFile(uri);
                        } catch (Throwable th) {
                            th = th;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            throw th;
                        }
                    }
                } catch (Exception unused2) {
                    cursorQuery = null;
                } catch (Throwable th2) {
                    th = th2;
                    cursorQuery = null;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } else if ("file".equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
            return copyToTempFile(uri);
        } catch (Exception e) {
            Log.e("Unity", "Exception:", e);
            return null;
        }
    }

    private String getSecondaryStoragePathFor(String str) {
        String str2 = secondaryStoragePath;
        if (str2 == null) {
            String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
            String str3 = System.getenv("SECONDARY_STORAGE");
            if (str3 == null || str3.length() == 0) {
                str3 = System.getenv("EXTERNAL_SDCARD_STORAGE");
            }
            if (str3 != null && str3.length() > 0) {
                if (!str3.contains(":")) {
                    str3 = str3 + ":";
                }
                for (String str4 : str3.split(":")) {
                    if (str4 != null && str4.length() > 0) {
                        File file = new File(str4);
                        if (file.exists() && file.isDirectory() && file.canRead() && !file.getAbsolutePath().equalsIgnoreCase(absolutePath)) {
                            String str5 = file.getAbsolutePath() + File.separator + str;
                            if (new File(str5).exists()) {
                                secondaryStoragePath = file.getAbsolutePath();
                                return str5;
                            }
                        }
                    }
                }
            }
            String[] strArr = {"/storage", "/mnt", "/storage/removable", "/removable", "/data", "/mnt/media_rw", "/mnt/sdcard0"};
            for (int i = 0; i < 7; i++) {
                try {
                    for (File file2 : new File(strArr[i]).listFiles()) {
                        if (file2.exists() && file2.isDirectory() && file2.canRead() && !file2.getAbsolutePath().equalsIgnoreCase(absolutePath)) {
                            String str6 = file2.getAbsolutePath() + File.separator + str;
                            if (new File(str6).exists()) {
                                secondaryStoragePath = file2.getAbsolutePath();
                                return str6;
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
            secondaryStoragePath = "_NulL_";
            return null;
        }
        if (str2.equals("_NulL_")) {
            return null;
        }
        return secondaryStoragePath + File.separator + str;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f A[Catch: Exception -> 0x0125, TryCatch #6 {Exception -> 0x0125, blocks: (B:35:0x0088, B:38:0x008f, B:42:0x00a8, B:45:0x00af, B:47:0x00b7, B:49:0x00c5, B:50:0x00dd, B:51:0x00df, B:65:0x0111, B:72:0x011e, B:73:0x0121, B:74:0x0124, B:41:0x0095), top: B:88:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String copyToTempFile(android.net.Uri r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yasirkula.unity.NativeGalleryMediaPickerFragment.copyToTempFile(android.net.Uri):java.lang.String");
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        String pathFromURI;
        if (i != MEDIA_REQUEST_CODE) {
            return;
        }
        boolean z = this.selectMultiple;
        String str2 = BuildConfig.FLAVOR;
        if (!z) {
            if (i2 != -1 || (pathFromURI = getPathFromURI(intent.getData())) == null) {
                pathFromURI = BuildConfig.FLAVOR;
            }
            if (pathFromURI.length() <= 0 || new File(pathFromURI).exists()) {
                str2 = pathFromURI;
            }
            NativeGalleryMediaReceiver nativeGalleryMediaReceiver = this.mediaReceiver;
            if (nativeGalleryMediaReceiver != null) {
                nativeGalleryMediaReceiver.OnMediaReceived(str2);
            }
        } else {
            ArrayList<String> arrayList = new ArrayList<>();
            if (i2 == -1) {
                fetchPathsOfMultipleMedia(arrayList, intent);
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (arrayList.get(size) == null || arrayList.get(size).length() == 0 || !new File(arrayList.get(size)).exists()) {
                    arrayList.remove(size);
                }
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (i3 == 0) {
                    str = str2 + arrayList.get(i3);
                } else {
                    str = str2 + ">" + arrayList.get(i3);
                }
                str2 = str;
            }
            NativeGalleryMediaReceiver nativeGalleryMediaReceiver2 = this.mediaReceiver;
            if (nativeGalleryMediaReceiver2 != null) {
                nativeGalleryMediaReceiver2.OnMultipleMediaReceived(str2);
            }
        }
        getFragmentManager().beginTransaction().remove(this).commit();
    }
}
