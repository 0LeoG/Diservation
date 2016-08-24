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

    }

    public void sendMessage(View view){
        Intent intent = new Intent(MainActivity.this, MagicKingdom.class);
        startActivity(intent);
    }
}
