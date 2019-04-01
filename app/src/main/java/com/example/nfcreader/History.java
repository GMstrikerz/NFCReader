package com.example.nfcreader;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class History extends AppCompatActivity {
    private static final String TAG = "History";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        
        ListView list=(ListView) findViewById(R.id.theList);
        Log.d(TAG,"onCreate: Started.");

        ArrayList<String>ID=new ArrayList<>();


        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,MainActivity.ID);
        list.setAdapter(adapter);

    }
}
