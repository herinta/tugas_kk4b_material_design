package com.java.drawernav;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {

    WebView web;
    ProgressDialog progres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        progres =  new ProgressDialog(WebActivity.this);
        progres.setMessage("Loading...");
        progres.show();

        web = findViewById(R.id.webView);

        web.loadUrl("http://idn.id");

        web.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                progres.dismiss();
                getSupportActionBar().setTitle(web.getTitle());
            }
        });

    }

    @Override
    public void onBackPressed() {
        if ( web.canGoBack()) {
            web.goBack();
        } else
            super.onBackPressed();
    }
}
