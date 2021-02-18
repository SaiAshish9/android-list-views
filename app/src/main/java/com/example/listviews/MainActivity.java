package com.example.listviews;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] arr= {"a","b","c"};

//        ListAdapter myAdapter=
//                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,arr);

        ListAdapter myAdapter= new CustomAdapter(this,arr);

        ListView myListView = (ListView) findViewById(R.id.myListView);
        myListView.setAdapter(myAdapter);

        myListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                         String x = String.valueOf(parent.getItemAtPosition(position));
                         Toast.makeText(MainActivity.this,x,Toast.LENGTH_SHORT).show();
                    }
                }
        );


    }

}