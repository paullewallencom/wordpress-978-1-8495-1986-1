package com.example.helloworld;

import android.os.Bundle;
import android.view.Menu;
import org.apache.cordova.*;

public class HelloWorldMainActivity extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/chapter6_phonegap.html");
    }  
}
