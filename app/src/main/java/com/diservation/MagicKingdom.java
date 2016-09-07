package com.diservation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;

import java.util.ArrayList;
import java.util.List;

public class MagicKingdom extends AppCompatActivity implements Park {

    private List<String> parkNames;
    private CheckBox mainStreetVehicles;
    private CheckBox jungleCruise;
    private CheckBox carpetsAladdin;
    private CheckBox piratesCaribbean;
    private CheckBox swissFamily;
    private CheckBox enchantedTikiRoom;
    private CheckBox bigThunder;
    private CheckBox countryBear;
    private CheckBox splashMountain;
    private CheckBox tomSawyer;
    private CheckBox railroad;
    private CheckBox hallofPresidents;
    private CheckBox hauntedMansion;
    private CheckBox libertyBelle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magic_kingdom);
        setTitle("Magic Kingdom");
        instantiateCheckBoxes();

    }

    public void sendMessage(View view){

        MagicKingdomTimes mkt = new MagicKingdomTimes(parkNames);
        Intent intent = new Intent(MagicKingdom.this,mkt.getClass());
        startActivity(intent);

    }

    public List<String> isChecked(){


        parkNames = new ArrayList<>();

        if(mainStreetVehicles.isChecked()){
            parkNames.add("Main Street Vehicles");
        }
        if(jungleCruise.isChecked()){
            parkNames.add("Jungle Cruise");
        }
        if(carpetsAladdin.isChecked()){
            parkNames.add("Magic Carpets of Aladdin")
        }



        return parkNames;
    }

    public void instantiateCheckBoxes(){

        mainStreetVehicles = (CheckBox)findViewById(R.id.msv);
        jungleCruise = (CheckBox)findViewById(R.id.jc);
        carpetsAladdin = (CheckBox)findViewById(R.id.tmc);
        piratesCaribbean = (CheckBox)findViewById(R.id.potc);
        swissFamily = (CheckBox)findViewById(R.id.sft);
        enchantedTikiRoom = (CheckBox)findViewById(R.id.wdetr);
        bigThunder = (CheckBox)findViewById(R.id.btmr);
        countryBear = (CheckBox)findViewById(R.id.cbj);
        splashMountain = (CheckBox)findViewById(R.id.sm);
        tomSawyer = (CheckBox)findViewById(R.id.ts);
        railroad = (CheckBox)findViewById(R.id.wdwr);
        hallofPresidents = (CheckBox)findViewById(R.id.thop);
        hauntedMansion = (CheckBox)findViewById(R.id.thm);
        libertyBelle = (CheckBox)findViewById(R.id.lbr);



    }



}
