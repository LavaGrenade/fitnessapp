package tylersand.fitnessappfinal;

/**
 * Created by Austin Emerick on 4/16/2016.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
public class Abdominals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abdominals);
    }

    public void goToMain(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);

    }

    public void goToPushUps(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, PushUps.class);

        startActivity(intent);

    }

    public void goToPlanks(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, Planks.class);

        startActivity(intent);

    }

    public void goToCrunches(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, Crunches.class);

        startActivity(intent);

    }

    public void goToSitUps(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, SitUps.class);

        startActivity(intent);

    }

    public void goToLazyBoy(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, LaZBoy.class);

        startActivity(intent);

    }

    public void goToSupermans(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, Supermans.class);

        startActivity(intent);

    }

    public void goToRussia(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, RussianTwists.class);

        startActivity(intent);

    }

    public void goToBicycle(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, Bicycles.class);

        startActivity(intent);

    }

    public void goToFlutterKicks(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, FlutterKicks.class);

        startActivity(intent);

    }
}