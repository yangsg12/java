package com.example.myapp;

import android.app.Activity;
import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * Created by Yang on 2015/5/20.
 */
public class MainActivity extends Activity implements View.OnClickListener {
    private Button button;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.news_articles);
//        if (findViewById(R.layout.fragment_container) != null) {
//            if (savedInstanceState != null) {
//                return;
//            }
//        }

        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        editText = (EditText) findViewById(R.id.edit_text);
    }

    @Override
    public void onClick(View v) {
//        switch (v.getId()) {
//            case R.id.button;
//                break;
//            default:
//                break;
//        }

        String inputText = editText.getText().toString();
        Toast.makeText(MainActivity.this,inputText,Toast.LENGTH_SHORT).show();

    }
}
