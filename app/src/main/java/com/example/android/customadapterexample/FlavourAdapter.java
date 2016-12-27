package com.example.android.customadapterexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Francislainy on 27/12/2016.
 */

public class FlavourAdapter extends ArrayAdapter<AndroidFlavours> {

    public FlavourAdapter(Context context, ArrayList<AndroidFlavours> androidFlavourses) {
        super(context, 0, androidFlavourses);
    }

    @Override
    public View getView (int position, View convertView, ViewGroup parent) {

        AndroidFlavours androidFlavours = getItem(position);

        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.custom_layout_list, parent, false);
        }

        TextView title_textView = (TextView) convertView.findViewById(R.id.title_text_view);
        TextView apiNumber_textView = (TextView) convertView.findViewById(R.id.api_number_text_view);
        ImageView flavour_imageView = (ImageView) convertView.findViewById(R.id.image_flavour);

        title_textView.setText(androidFlavours.getTitle());
        apiNumber_textView.setText(androidFlavours.getApi_number());
        flavour_imageView.setImageResource(androidFlavours.getImageFlavour());

        return convertView;
    }
}
