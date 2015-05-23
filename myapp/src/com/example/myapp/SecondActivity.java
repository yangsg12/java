package com.example.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;

/**
 * Created by Yang on 2015/4/7.
 */
public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.second_layout);

        Intent intent = getIntent();
        String data = intent.getStringExtra("extra_data");
        Log.d("secondActivity", data);
    }
}
