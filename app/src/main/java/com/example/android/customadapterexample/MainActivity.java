package com.example.android.customadapterexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] androidFlavours = new String[]{"Donut", "Eclair", "Froyo", "GingerBread", "HoneyComb", "Ice Cream Sandwich", "Jelly Bean"};
        String[] api_numbers = new String[]{"1.6", "2.0-2.1", "2.2-2.2.3", "2.3-2.3.7", "3.0-3.2.6", "4.0-4.0.4", "4.1-4.3.1"};
        int[] imageFlavours_resources = new int[]{R.drawable.donut, R.drawable.eclair, R.drawable.froyo, R.drawable.gingerbread,
                                        R.drawable.honeycomb, R.drawable.icecream, R.drawable.jellybean};

        ArrayList<AndroidFlavours> androidFlavoursesList  = new ArrayList<AndroidFlavours>();

        for(int i=0; i<androidFlavours.length; i++) {
            androidFlavoursesList.add(new AndroidFlavours(androidFlavours[i], api_numbers[i], imageFlavours_resources[i]));
        }

        ArrayAdapter itemsAdapter = new FlavourAdapter(this, androidFlavoursesList);
        ListView listView = (ListView) findViewById(R.id.activity_main);
        listView.setAdapter(itemsAdapter);

    }
}
