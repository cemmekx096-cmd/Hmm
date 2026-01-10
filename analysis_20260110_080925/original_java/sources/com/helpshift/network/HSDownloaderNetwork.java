package com.helpshift.network;

import com.crashlytics.android.BuildConfig;
import com.helpshift.log.HSLogger;
import com.helpshift.util.Utils;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class HSDownloaderNetwork {
    private static final String TAG = "dwnldrNet";
    private final URLConnectionProvider urlConnectionProvider;

    private boolean isSuccessful(int i) {
        return i >= 200 && i <= 300;
    }

    public HSDownloaderNetwork(URLConnectionProvider uRLConnectionProvider) {
        this.urlConnectionProvider = uRLConnectionProvider;
    }

    public HSDownloaderResponse downloadResource(String str, Map<String, String> map, File file) throws Throwable {
        InputStream inputStreamCreateInputStream;
        String str2;
        String str3;
        String str4;
        boolean z;
        int i;
        String str5;
        FileOutputStream fileOutputStream;
        String strExtractETag = BuildConfig.FLAVOR;
        String contentEncoding = "utf-8";
        JSONObject jSONObject = new JSONObject();
        FileOutputStream fileOutputStream2 = null;
        boolean z2 = false;
        int responseCode = 404;
        try {
            try {
                try {
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) this.urlConnectionProvider.getURL(str).openConnection();
                    map.put(HttpRequest.HEADER_ACCEPT_ENCODING, HttpRequest.ENCODING_GZIP);
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        httpsURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                    responseCode = httpsURLConnection.getResponseCode();
                    contentEncoding = httpsURLConnection.getContentEncoding();
                    String contentType = httpsURLConnection.getContentType();
                    try {
                        Map<String, List<String>> headerFields = httpsURLConnection.getHeaderFields();
                        processResponseHeaders(headerFields, jSONObject);
                        strExtractETag = extractETag(headerFields);
                        if (isSuccessful(responseCode)) {
                            inputStreamCreateInputStream = createInputStream(httpsURLConnection, contentEncoding);
                            try {
                                fileOutputStream = new FileOutputStream(file);
                            } catch (UnknownHostException e) {
                                e = e;
                                str2 = strExtractETag;
                                strExtractETag = contentType;
                                HSLogger.e(TAG, "Error downloading resource: " + str + " \n " + e.getMessage());
                                Utils.closeQuietly(fileOutputStream2);
                                Utils.closeQuietly(inputStreamCreateInputStream);
                                str3 = strExtractETag;
                                str4 = contentEncoding;
                                z = false;
                                i = responseCode;
                                str5 = str2;
                                return new HSDownloaderResponse(i, jSONObject, str5, str3, str4, z);
                            } catch (Exception e2) {
                                e = e2;
                                str2 = strExtractETag;
                                strExtractETag = contentType;
                                HSLogger.e(TAG, "Error downloading resource: " + str, e);
                                Utils.closeQuietly(fileOutputStream2);
                                Utils.closeQuietly(inputStreamCreateInputStream);
                                str3 = strExtractETag;
                                str4 = contentEncoding;
                                z = false;
                                i = responseCode;
                                str5 = str2;
                                return new HSDownloaderResponse(i, jSONObject, str5, str3, str4, z);
                            }
                            try {
                                saveResourceToFile(inputStreamCreateInputStream, fileOutputStream);
                                fileOutputStream2 = fileOutputStream;
                            } catch (UnknownHostException e3) {
                                e = e3;
                                str2 = strExtractETag;
                                strExtractETag = contentType;
                                fileOutputStream2 = fileOutputStream;
                                HSLogger.e(TAG, "Error downloading resource: " + str + " \n " + e.getMessage());
                                Utils.closeQuietly(fileOutputStream2);
                                Utils.closeQuietly(inputStreamCreateInputStream);
                                str3 = strExtractETag;
                                str4 = contentEncoding;
                                z = false;
                                i = responseCode;
                                str5 = str2;
                                return new HSDownloaderResponse(i, jSONObject, str5, str3, str4, z);
                            } catch (Exception e4) {
                                e = e4;
                                str2 = strExtractETag;
                                strExtractETag = contentType;
                                fileOutputStream2 = fileOutputStream;
                                HSLogger.e(TAG, "Error downloading resource: " + str, e);
                                Utils.closeQuietly(fileOutputStream2);
                                Utils.closeQuietly(inputStreamCreateInputStream);
                                str3 = strExtractETag;
                                str4 = contentEncoding;
                                z = false;
                                i = responseCode;
                                str5 = str2;
                                return new HSDownloaderResponse(i, jSONObject, str5, str3, str4, z);
                            } catch (Throwable th) {
                                th = th;
                                fileOutputStream2 = fileOutputStream;
                                Utils.closeQuietly(fileOutputStream2);
                                Utils.closeQuietly(inputStreamCreateInputStream);
                                throw th;
                            }
                        } else {
                            inputStreamCreateInputStream = null;
                        }
                        if (isSuccessful(responseCode) || responseCode == 304) {
                            HSLogger.d(TAG, "Successfully downloaded the resource with Url: " + str + " headers: " + map);
                            z2 = true;
                        }
                        Utils.closeQuietly(fileOutputStream2);
                        Utils.closeQuietly(inputStreamCreateInputStream);
                        z = z2;
                        i = responseCode;
                        str3 = contentType;
                        str5 = strExtractETag;
                        str4 = contentEncoding;
                    } catch (UnknownHostException e5) {
                        e = e5;
                        str2 = strExtractETag;
                        inputStreamCreateInputStream = null;
                    } catch (Exception e6) {
                        e = e6;
                        str2 = strExtractETag;
                        inputStreamCreateInputStream = null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStreamCreateInputStream = null;
                }
            } catch (UnknownHostException e7) {
                e = e7;
                str2 = BuildConfig.FLAVOR;
                inputStreamCreateInputStream = null;
            } catch (Exception e8) {
                e = e8;
                str2 = BuildConfig.FLAVOR;
                inputStreamCreateInputStream = null;
            }
            return new HSDownloaderResponse(i, jSONObject, str5, str3, str4, z);
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private void processResponseHeaders(Map<String, List<String>> map, JSONObject jSONObject) throws JSONException {
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null || entry.getValue() != null) {
                String key = entry.getKey() == null ? BuildConfig.FLAVOR : entry.getKey();
                jSONObject.put(key, generateHeaderValue(entry.getValue()));
                if ("Access-Control-Allow-Origin".equalsIgnoreCase(key)) {
                    jSONObject.put(key, Marker.ANY_MARKER);
                }
            }
        }
    }

    private String extractETag(Map<String, List<String>> map) {
        List<String> list = map.get("etag");
        return Utils.isNotEmpty(list) ? list.get(0) : BuildConfig.FLAVOR;
    }

    private InputStream createInputStream(HttpsURLConnection httpsURLConnection, String str) throws IOException {
        InputStream inputStream = httpsURLConnection.getInputStream();
        return (inputStream != null && Utils.isNotEmpty(str) && str.contains(HttpRequest.ENCODING_GZIP)) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private void saveResourceToFile(InputStream inputStream, FileOutputStream fileOutputStream) throws IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            try {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    return;
                } else {
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (IOException e) {
                HSLogger.e(TAG, "Error saving resource to file: ", e);
                return;
            }
        }
    }

    private static String generateHeaderValue(List<String> list) {
        if (Utils.isEmpty(list)) {
            return BuildConfig.FLAVOR;
        }
        StringBuilder sb = new StringBuilder(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            sb.append(";").append(list.get(i));
        }
        return sb.toString();
    }
}
