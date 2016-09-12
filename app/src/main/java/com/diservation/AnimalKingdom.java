package com.diservation;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class AnimalKingdom extends AppCompatActivity {
    ListView listview;
    Context context;
    private String[] attractionNames;
    private ArrayList<String> parkNames;
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_kingdom);
        setTitle("Animal Kingdom");

        context = this;
        listview = (ListView)findViewById(R.id.listView1);

        attractionNames = new String[] {"It's tough to be a bug ", "Kilimanjaro Safari", "Forest Exploration Trail",
                            "Wild Africa Trek", "Festival of the Lion King", "Wildlife Express Train",
                            "Maharaja Jungle Trek", "Flights of Wonder", "Dinosaur", "Finding Nemo, the Musical",
                            "Primeval Whirl", "TriceraTop Spin", };

        adapter = new ArrayAdapter<>(this, R.layout.list_item, attractionNames);
        listview.setAdapter(adapter);
        listview.setItemsCanFocus(false);
        listview.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

        listview.setOnItemClickListener(new CheckBoxClick());
        parkNames = new ArrayList<>();

    }

    /**
     * Class CheckBoxClick listens for each time a checkbox is ticked
     * or unticked. It will add/remove that item from a String array
     * that hold the names of the chosen parks.
     */

    public class CheckBoxClick implements AdapterView.OnItemClickListener {

        @Override
        public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {

            //Check box that is currently chosen.
            CheckedTextView ctv = (CheckedTextView)arg1;

            //Add name of checkbox to String Array else remove it.
            if(ctv.isChecked()){
                parkNames.add((String) ctv.getText());
                Toast.makeText(AnimalKingdom.this,  ""+parkNames, Toast.LENGTH_SHORT).show();
            }else{
                parkNames.remove(parkNames.indexOf(ctv.getText()));
                Toast.makeText(AnimalKingdom.this, ""+parkNames, Toast.LENGTH_SHORT).show();
            }
        }
    }





}
