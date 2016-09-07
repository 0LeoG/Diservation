package com.diservation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class HollywoodStudios extends AppCompatActivity implements Park {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hollywood_studios);
        setTitle("Hollywood Studios");
    }


}
