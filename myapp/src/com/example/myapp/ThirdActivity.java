package com.example.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by Yang on 2015/4/7.
 */
public class ThirdActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.third_layout);
    }
}
