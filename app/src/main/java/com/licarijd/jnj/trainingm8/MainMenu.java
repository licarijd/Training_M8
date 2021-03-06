package com.licarijd.jnj.trainingm8;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;
import android.widget.ImageButton;


public class MainMenu extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void open_one_rep_max(View view) {

        // Do something in response to button
        Intent nextScreen = new Intent(getApplicationContext(), OneRepMax.class);

        startActivity(nextScreen);

    }

    public void open_percent_fat(View view) {

        // Do something in response to button
        Intent nextScreen = new Intent(getApplicationContext(), PercentBodyFat.class);

        startActivity(nextScreen);

    }

    public void open_max_heart_rate(View view) {

        // Do something in response to button
        Intent nextScreen = new Intent(getApplicationContext(), MaxHeartRate.class);

        startActivity(nextScreen);

    }

    public void open_muscle_composition(View view) {

        // Do something in response to button
        Intent nextScreen = new Intent(getApplicationContext(), MuscleComposition.class);

        startActivity(nextScreen);

    }

    public void open_bmi(View view) {

        // Do something in response to button
        Intent nextScreen = new Intent(getApplicationContext(), BMI.class);

        startActivity(nextScreen);

    }

    public void open_vo2max(View view) {

        // Do something in response to button
        Intent nextScreen = new Intent(getApplicationContext(), VO2Max.class);

        startActivity(nextScreen);

    }



}
