package com.diservation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private RadioGroup parkGroup;
    private RadioButton MKButton;
    private RadioButton EButton;
    private RadioButton AKButton;
    private RadioButton HSButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        parkGroup = (RadioGroup)findViewById(R.id.radioGroup);

        // Instantiating RadioButtons
        MKButton = (RadioButton)findViewById(R.id.MK_rb);
        EButton = (RadioButton)findViewById(R.id.E_rb);
        AKButton = (RadioButton)findViewById(R.id.AK_rb);
        HSButton = (RadioButton)findViewById(R.id.HS_rb);


    }

    public void sendMessage(View view){

        if(MKButton.isChecked()){
            Intent intent = new Intent(MainActivity.this, MagicKingdom.class);
            startActivity(intent);
        }else if(EButton.isChecked()){
            Intent intent = new Intent(MainActivity.this, Epcot.class);
            startActivity(intent);
        }else if(AKButton.isChecked()){
            Intent intent = new Intent(MainActivity.this, AnimalKingdom.class);
            startActivity(intent);
        }else if(HSButton.isChecked()){
            Intent intent = new Intent(MainActivity.this, HollywoodStudios.class);
            startActivity(intent);
        }


    }
}
