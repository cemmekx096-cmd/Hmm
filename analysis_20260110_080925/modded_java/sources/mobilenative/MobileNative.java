package mobilenative;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Log;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.safedk.android.utils.Logger;
import com.unity3d.player.UnityPlayer;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class MobileNative {
    private static final String TAG = "Unity";
    private static ProgressDialog loading;

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    public static String getAppID() {
        return UnityPlayer.currentActivity.getPackageName();
    }

    public static String getAppName() {
        Activity activity = UnityPlayer.currentActivity;
        return activity.getString(activity.getApplicationInfo().labelRes);
    }

    public static String getAppVersion() {
        Activity activity = UnityPlayer.currentActivity;
        try {
            return activity.getPackageManager().getPackageInfo(activity.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w(TAG, "Application version not available!\n" + e);
            return null;
        }
    }

    public static int getAppBuild() {
        Activity activity = UnityPlayer.currentActivity;
        try {
            return activity.getPackageManager().getPackageInfo(activity.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w(TAG, "Application build not available!\n" + e);
            return 0;
        }
    }

    public static String getMetaData(String str) {
        Activity activity = UnityPlayer.currentActivity;
        try {
            return activity.getPackageManager().getApplicationInfo(activity.getPackageName(), RendererCapabilities.DECODER_SUPPORT_PRIMARY).metaData.getString(str);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w(TAG, "Application meta data \"" + str + "\" not available!\n" + e);
            return null;
        }
    }

    public static void alert(final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7) {
        Log.d(TAG, "alert: " + str + ", " + str2);
        UnityPlayer.currentActivity.runOnUiThread(new Runnable() { // from class: mobilenative.MobileNative.1
            @Override // java.lang.Runnable
            public void run() {
                AlertDialog.Builder builder = new AlertDialog.Builder(UnityPlayer.currentActivity);
                builder.setTitle(str).setMessage(str2);
                builder.setPositiveButton(str3, new DialogInterface.OnClickListener() { // from class: mobilenative.MobileNative.1.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        UnityPlayer.UnitySendMessage(str6, str7, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                    }
                });
                String str8 = str4;
                if (str8 != null) {
                    builder.setNegativeButton(str8, new DialogInterface.OnClickListener() { // from class: mobilenative.MobileNative.1.2
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            UnityPlayer.UnitySendMessage(str6, str7, "2");
                        }
                    });
                }
                String str9 = str5;
                if (str9 != null) {
                    builder.setNeutralButton(str9, new DialogInterface.OnClickListener() { // from class: mobilenative.MobileNative.1.3
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            UnityPlayer.UnitySendMessage(str6, str7, "3");
                        }
                    });
                }
                builder.create().show();
            }
        });
    }

    public static void shareText(String str, String str2) {
        Log.d(TAG, "shareText: " + str + ", " + str2);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str2);
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(UnityPlayer.currentActivity, Intent.createChooser(intent, str));
    }

    public static void shareImage(byte[] bArr, String str, String str2, boolean z) throws IOException {
        Log.d(TAG, "shareImage: " + str + ", " + str2);
        Activity activity = UnityPlayer.currentActivity;
        String str3 = getAppName() + (z ? ".gif" : ".png");
        FileOutputStream fileOutputStreamOpenFileOutput = null;
        try {
            fileOutputStreamOpenFileOutput = activity.openFileOutput(str3, 1);
            fileOutputStreamOpenFileOutput.write(bArr);
            fileOutputStreamOpenFileOutput.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (fileOutputStreamOpenFileOutput != null) {
            Uri uriFromFile = Uri.fromFile(activity.getFileStreamPath(str3));
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.STREAM", uriFromFile);
            intent.putExtra("android.intent.extra.TEXT", str2);
            intent.putExtra("sms_body", str2);
            intent.addFlags(402653185);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(activity, Intent.createChooser(intent, str));
        }
    }

    public static void showApp(String str) {
        Log.d(TAG, "showApp: " + str);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(UnityPlayer.currentActivity, intent);
    }

    public static void showLoading() {
        Log.d(TAG, "showLoading");
        UnityPlayer.currentActivity.runOnUiThread(new Runnable() { // from class: mobilenative.MobileNative.2
            @Override // java.lang.Runnable
            public void run() {
                ProgressDialog unused = MobileNative.loading = ProgressDialog.show(UnityPlayer.currentActivity, null, null, true, false);
            }
        });
    }

    public static void hideLoading() {
        Log.d(TAG, "hideLoading");
        ProgressDialog progressDialog = loading;
        if (progressDialog != null) {
            progressDialog.dismiss();
            loading = null;
        }
    }
}
