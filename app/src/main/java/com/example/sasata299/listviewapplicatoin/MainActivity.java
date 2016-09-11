package com.example.sasata299.listviewapplicatoin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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

        // ArrayAdapterオブジェクトの作成
        // simple_list_item_1はもともと用意されているレイアウトファイルのID
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, foods);

        // Adapterの指定
        listView.setAdapter(arrayAdapter);
    }
}
