package com.example.listviews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomAdapter extends ArrayAdapter<String> {

    public CustomAdapter(@NonNull Context context, String[] arr) {
        super(context, R.layout.custom_row, arr);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater myInflater= LayoutInflater.from(getContext());
        View customView  = myInflater.inflate(R.layout.custom_row,parent,false);
        String x = getItem(position);
        TextView myText=(TextView) customView.findViewById(R.id.myText);
        ImageView myImg=(ImageView) customView.findViewById(R.id.imageView);
        myText.setText(x);
        myImg.setImageResource(R.drawable.img);
        return customView;
    }

}
