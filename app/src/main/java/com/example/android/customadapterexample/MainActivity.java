package com.example.android.customadapterexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] androidFlavours = new String[]{"Donut", "Eclair", "Froyo", "GingerBread", "HoneyComb", "Ice Cream Sandwich", "Jelly Bean"};

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, androidFlavours);
        ListView listView = (ListView) findViewById(R.id.activity_main);
        listView.setAdapter(itemsAdapter);

    }
}
