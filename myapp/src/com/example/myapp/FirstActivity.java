package com.example.myapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Yang on 2015/4/7.
 */



public class FirstActivity extends Activity {

    public final static String EXTRA_MESSAGE = "com.myFirstApp";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.first_layout);
        //setContentView(R.menu.main);
       //
        Button button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
        /*    public void onClick(View view) {
                Toast.makeText(FirstActivity.this, "点击了 button 1", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                startActivity(intent);
//                Intent intent1 = new Intent("com.example.myapp.ACTION_START");
//
//                intent1.addCategory("com.example.myapp.MY_CATEGORY");
//                startActivity(intent1);
                //finish();
            }*/
            public void onClick(View view) {
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                intent.setData(Uri.parse("http://www.baidu.com"));
//                startActivity(intent);

//                Intent intent = new Intent(Intent.ACTION_DIAL);
//                intent.setData(Uri.parse("tel:10086"));
//                startActivity(intent);


                String data = "hello second activity";
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("extra_data", data);
                startActivity(intent);
            }
        });

    }

    public boolean onCreateOptionMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        /*switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this, "You clicked add", Toast.LENGTH_SHORT);
                break;
            case R.id.remove_item:
                Toast.makeText(this, "you clicked remove", Toast.LENGTH_SHORT);
                break;
            default:
        }*/

        return true;
    }


//    是Public函数
//    没有返回值
//    有唯一的参数(View类型,代表被点击的视图）
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        //EditText editText = (EditText)findViewById(R.id.edit_message);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message); // key - value 参数
        startActivity(intent);
    }



}