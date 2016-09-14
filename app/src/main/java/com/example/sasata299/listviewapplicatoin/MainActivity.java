package com.example.sasata299.listviewapplicatoin;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    private static final String[] foods = {
            "りんご", "ばなな", "パイナップル", "いちご", "梨", "キウイ", "みかん", "スイカ", "ぶどう"
    };
    private static final int[] prices = {
            100, 200, 300, 400, 500, 600, 700, 800, 900
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        ArrayList<Food> list = new ArrayList<>();
        MyAdapter myAdapter = new MyAdapter(this);

        for (int i = 0; i < foods.length; i++) {
            Food food = new Food();
            food.setName(foods[i]);
            food.setPrice(prices[i]);
            food.setIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));
            list.add(food);
        }

        //myAdapter.notifyDataSetChanged();

        myAdapter.setFoodList(list);

        // Adapterの指定
        listView.setEmptyView(findViewById(R.id.emptyView));
        listView.setAdapter(myAdapter);
    }
}
