package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.app.Activity;
import android.os.Bundle;

import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;


import com.google.android.material.snackbar.Snackbar;

public class feedback extends AppCompatActivity {
    Button b1;
    EditText ed1;
    private WebView wv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        b1=(Button)findViewById(R.id.button);
        ed1=(EditText)findViewById(R.id.editText);
        wv1=(WebView)findViewById(R.id.webView);
        wv1.setWebViewClient(new MyBrowser());
    }
    public void onClickSubmit(View v)
    {
        CharSequence smg="You have submitted the Feedback";
        int duration = Snackbar.LENGTH_SHORT;
        Snackbar sn1=Snackbar.make(findViewById(R.id.submitbtn),smg,duration);
        sn1.setAction("Undo", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(feedback.this, "Undone!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        sn1.show();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(feedback.this, "Opening Broser!", Toast.LENGTH_SHORT);
                toast.show();
                String url = ed1.getText().toString();
                wv1.getSettings().setLoadsImagesAutomatically(true);
                wv1.getSettings().setJavaScriptEnabled(true);
                wv1.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv1.loadUrl(url);
            }
        });
    }
    public void borwsee(View v)
    {
        Toast toast = Toast.makeText(feedback.this, "Opening Broser!", Toast.LENGTH_SHORT);
        toast.show();
        String url = ed1.getText().toString();
        wv1.getSettings().setLoadsImagesAutomatically(true);
        wv1.getSettings().setJavaScriptEnabled(true);
        wv1.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv1.loadUrl(url);

    }
    //webview function
    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}