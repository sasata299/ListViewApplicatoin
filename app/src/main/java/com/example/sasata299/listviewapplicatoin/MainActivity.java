package com.example.sasata299.listviewapplicatoin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    private static final String[] foods = {
            "りんご", "ばなな", "パイナップル", "いちご"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        ArrayList<Food> list = new ArrayList<>();
        MyAdapter myAdapter = new MyAdapter(this);

        Food food = new Food();
        food.setName("りんご");
        food.setPrice(100);
        list.add(food);
        myAdapter.notifyDataSetChanged();

        myAdapter.setFoodList(list);

        // Adapterの指定
        listView.setAdapter(myAdapter);
    }
}
