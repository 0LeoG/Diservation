package com.diservation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MagicKingdomTimes extends AppCompatActivity {

    ListView timeView;
    ArrayAdapter<String> adapter;
    ArrayList<String> parkNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magic_kingdom_times);
        Bundle extras = getIntent().getExtras();
        setTitle("Magic Kingdom Times");

        parkNames = (ArrayList)extras.get("Park Names");
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, parkNames);

        timeView = (ListView)findViewById(R.id.listView2);
        timeView.setAdapter(adapter);



    }


}
