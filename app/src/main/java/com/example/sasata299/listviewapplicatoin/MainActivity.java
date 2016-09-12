package com.example.sasata299.listviewapplicatoin;

import android.graphics.BitmapFactory;
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

        Food food1 = new Food();
        food1.setName("りんご");
        food1.setPrice(100);
        food1.setIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));
        list.add(food1);
        Food food2 = new Food();
        food2.setName("パイナップル");
        food2.setPrice(400);
        food2.setIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));
        list.add(food2);
        //myAdapter.notifyDataSetChanged();

        myAdapter.setFoodList(list);

        // Adapterの指定
        listView.setEmptyView(findViewById(R.id.emptyView));
        listView.setAdapter(myAdapter);
    }
}
