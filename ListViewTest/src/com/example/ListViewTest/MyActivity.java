package com.example.ListViewTest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    private List<Fruit> fruitList = new ArrayList<Fruit>();
    //private String[] data ={"apple", "banana", "orange","watermelon","pear", "grape"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        initFruits();
        FruitAdapter adapter = new FruitAdapter(MyActivity.this, R.layout.fruit_item, fruitList);


//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
//                MyActivity.this,android.R.layout.simple_list_item_1,data);

        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit = fruitList.get(position);
                Toast.makeText(MyActivity.this,fruit.getName(),Toast.LENGTH_SHORT).show();
            }
        });
    }


    private void initFruits() {
        Fruit apple = new Fruit("Orange", R.drawable.orange_pic);
        fruitList.add(apple);

        Fruit banana = new Fruit("Banana", R.drawable.banana_pic);
        fruitList.add(banana);
    }
}
