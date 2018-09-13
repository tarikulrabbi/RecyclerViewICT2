package com.rabbi.tarikul.recyclerviewict;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class NewsDeatailsActivity extends AppCompatActivity {

    private WebView mWebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_deatails);
        mWebview= findViewById(R.id.webviewNewsdeatails);

        Intent  intent = getIntent();
        String url = intent.getStringExtra("web_url");
        mWebview.loadUrl(url);
    }
}
