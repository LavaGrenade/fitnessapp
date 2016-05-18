package tylersand.fitnessappfinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Austin Emerick on 4/16/2016.
 */
public class Back extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.back);

    }
    public void goToWorkouts(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, Workouts.class);

        startActivity(intent);

    }
    public void goToJumpingJacks(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, JumpingJacks.class);

        startActivity(intent);

    }
    public void goToSealJacks(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, SealJacks.class);

        startActivity(intent);

    }
    public void goToScissorJacks(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, ScissorJacks.class);

        startActivity(intent);

    }
    public void goToRussia(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, RussianTwists.class);

        startActivity(intent);

    }
    public void goToSupermans(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, Supermans.class);

        startActivity(intent);

    }
    public void goToAdvancedReach(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, AdvancedReach.class);

        startActivity(intent);

    }
    public void goToHyperExtension(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, HyperExtension.class);

        startActivity(intent);

    }

}