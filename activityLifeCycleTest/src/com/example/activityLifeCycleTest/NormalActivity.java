package com.example.activityLifeCycleTest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by Yang on 2015/5/23.
 */
public class NormalActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.normal_layout);

    }
}
