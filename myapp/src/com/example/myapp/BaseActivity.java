package com.example.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Yang on 2015/5/24.
 */
public class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("BaseActivity", getClass().getSimpleName());
    }
}
