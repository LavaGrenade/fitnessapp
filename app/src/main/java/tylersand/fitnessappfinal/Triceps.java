package com.example.austinemerick.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Austin Emerick on 4/16/2016.
 */
public class Triceps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.triceps);
    }
    public void goToWorkouts(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, Workouts.class);

        startActivity(intent);

    }
    public void goToTricepDips(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, TricepDips.class);

        startActivity(intent);

    }
    public void goToBurpees(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, Burpees.class);

        startActivity(intent);

    }
    public void goToPushUps(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, PushUps.class);

        startActivity(intent);

    }
}

