package com.diservation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.List;

public class MagicKingdomTimes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magic_kingdom_times);
    }

    public MagicKingdomTimes(List<String> selectedAttractions){

    }
}
