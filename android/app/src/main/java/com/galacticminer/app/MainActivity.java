package com.galacticminer.app;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.webkit.WebChromeClient;
public class MainActivity extends Activity {
    public void onCreate(Bundle s) {
        super.onCreate(s);
        WebView w = new WebView(this);
        WebSettings ws = w.getSettings();
        ws.setJavaScriptEnabled(true);
        ws.setDomStorageEnabled(true);
        ws.setAllowFileAccess(true);
        w.setWebChromeClient(new WebChromeClient());
        w.loadUrl("file:///android_asset/index.html");
        setContentView(w);
    }
}
