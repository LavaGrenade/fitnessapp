package com.example.austinemerick.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Austin Emerick on 4/16/2016.
 */
public class Quadriceps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quadriceps);
    }
    public void goToWorkouts(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, Workouts.class);

        startActivity(intent);

    }
    public void goToWallSits(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, WallSits.class);

        startActivity(intent);

    }
    public void goToStepUps(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, StepUps.class);

        startActivity(intent);

    }
    public void goToJumpingJacks(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, JumpingJacks.class);

        startActivity(intent);

    }
    public void goToBurpees(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, Burpees.class);

        startActivity(intent);

    }
    public void goToLunges(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, Lunges.class);

        startActivity(intent);

    }
}