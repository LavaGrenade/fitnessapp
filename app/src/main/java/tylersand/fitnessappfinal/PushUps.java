package com.example.austinemerick.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Austin Emerick on 4/20/2016.
 */
public class PushUps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pushups);
    }
    public void goToAbs(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, Abdominals.class);

        startActivity(intent);

    }
}