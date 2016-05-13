package com.example.austinemerick.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Austin Emerick on 4/20/2016.
 */
public class Squats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.squats);
    }

    public void goToButts(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, Gluteusmuscles.class);

        startActivity(intent);

    }
    public void goToPrisonSquats(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, PrisonSquats.class);

        startActivity(intent);

    }
    public void goToXSquats(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, XSquats.class);

        startActivity(intent);

    }
    public void goToOneLeggedSquats(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, OneLeggedSquats.class);

        startActivity(intent);

    }
    public void goToWideLeggedSquats(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, WideLeggedSquats.class);

        startActivity(intent);

    }
    public void goToJumpSquats(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, JumpSquats.class);

        startActivity(intent);

    }
}