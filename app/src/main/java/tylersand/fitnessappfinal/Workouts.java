package com.example.austinemerick.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Workouts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.workouts);

    }
    public void goToMain(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);

    }
    public void goToAbdominals(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, Abdominals.class);

        startActivity(intent);

    }

    public void goToTriceps(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, Triceps.class);

        startActivity(intent);

    }

    public void goToBiceps(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, Biceps.class);

        startActivity(intent);

    }

    public void goToButts(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, Gluteusmuscles.class);

        startActivity(intent);

    }

    public void goToQuadriceps(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, Quadriceps.class);

        startActivity(intent);

    }

    public void goToShoulders(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, Shoulders.class);

        startActivity(intent);

    }

    public void goToPectorals(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, Pectorals.class);

        startActivity(intent);

    }

    public void goToCalves(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, Calves.class);

        startActivity(intent);

    }

    public void goToBack(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, Back.class);

        startActivity(intent);

    }

}