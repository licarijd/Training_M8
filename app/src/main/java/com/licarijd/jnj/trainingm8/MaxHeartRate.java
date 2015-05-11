package com.licarijd.jnj.trainingm8;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;


public class MaxHeartRate extends ActionBarActivity {

    private ImageButton calculateMaxHeartRate;
    private EditText ageInput, resultWin;
    private RadioButton male, female;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maxheartrate);

        //The text field where the user enters age.
        ageInput = (EditText) findViewById((R.id.input_age));

        //The calculate button.
        calculateMaxHeartRate = (ImageButton) findViewById(R.id.calculate_max_heart_rate);

        //The gender selection.
        male = (RadioButton) findViewById(R.id.male);
        female = (RadioButton) findViewById(R.id.male);

        //The results window.
        resultWin = (EditText) findViewById((R.id.mhr_results_window));

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

    public void open_main_menu(View view) {

        // Do something in response to button
        Intent nextScreen = new Intent(getApplicationContext(), MainMenu.class);

        startActivity(nextScreen);

    }


    public void calculate(View view) {

        //Age is assigned to a String and converted to an integer.
        String usersAgeText = String.valueOf(ageInput.getText());
        int usersAge = Integer.parseInt(usersAgeText);

        Boolean isMale = male.isChecked();

        Boolean isFemale = male.isChecked();

        int max = 0;

       if (isMale){
           max = 220;
       }


        int maxHeartRate = max - usersAge;


        resultWin.setText("Your Maximum heart rate is " + maxHeartRate);
    }

}




