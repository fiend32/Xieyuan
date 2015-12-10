package com.example.administrator.xieyuan;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;


public class MainActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        Uri uri=Uri.parse("http://7rflo2.com2.z 0.glb.qiniucdn.com/5631944aa04fa.mp4");
//        Intent intent=new Intent(Intent.ACTION_VIEW);
//        intent.setDataAndType(uri,"video/mp4");
//        startActivity(intent);
        webView=new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://www.baidu.com");
        setContentView(webView);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if((keyCode==KeyEvent.KEYCODE_BACK)&&webView.canGoBack()){
            return true;
        }
        return false;
    }
}
