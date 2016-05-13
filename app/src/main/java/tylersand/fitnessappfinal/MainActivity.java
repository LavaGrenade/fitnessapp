package com.example.austinemerick.fitnessapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.austinemerick.fitnessapp.R;
import com.example.austinemerick.fitnessapp.Times;
import com.example.austinemerick.fitnessapp.Workouts;

;

//Worksouts class needs onclick implementations for subclasses
//abdominals done, some subclasses of abs need to be implemented
//squats subclasses need to be implemented


public class MainActivity extends AppCompatActivity {

    @Override
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //YOU CAN'T TRUST THE SYSTEM MAAAANNNN!!! I'M AN ADUUULLLLT!  YOU CAN'T BUY ME HOTDOG MAN
    //
    public void openWorkoutsActivity(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, Workouts.class);

        startActivity(intent);

    }
    public void openTimesActivity(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, Times.class);

        startActivity(intent);

    }

}

