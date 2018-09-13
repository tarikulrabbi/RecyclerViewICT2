package com.rabbi.tarikul.recyclerviewict;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import java.util.zip.Inflater;

public class webViewDetails extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_details);

        webView = findViewById(R.id.webViewId);

        Intent intent = getIntent();
        Bundle bundle = getIntent().getExtras();
        String data = bundle.getString("a");
        webView.loadUrl(data);
    }
}
