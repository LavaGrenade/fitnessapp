package com.example.austinemerick.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Austin Emerick on 4/20/2016.
 */
public class Planks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.planks);
    }
    public void goToAbs(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, Abdominals.class);

        startActivity(intent);

    }
    public void goToForearm(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, ForearmPlanks.class);

        startActivity(intent);

    }
    public void goToSide(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, SidePlanks.class);

        startActivity(intent);

    }
    public void goToHand(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, HandPlanks.class);

        startActivity(intent);

    }
    
}