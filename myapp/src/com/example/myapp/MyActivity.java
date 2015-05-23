package com.example.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.d("MyActivity","onCreate execute");
    }

   /* public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R, menu);
        return true;*/
    //}
}
