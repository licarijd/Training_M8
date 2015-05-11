package com.licarijd.jnj.trainingm8;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;


public class OneRepMaxResults extends OneRepMax {

    private EditText resultWin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one_rep_max_results);

        //The results window.
        resultWin = (EditText) findViewById((R.id.orm_results_window));

        resultWin.setText(calculate());

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

        //calculate(view);


    }


    public String calculate() {

        //Reps is assigned to a String and converted to an integer.
        String repsText = String.valueOf(repsInput.getText());
        int reps = Integer.parseInt(repsText);

        //Weight is assigned to a String and converted to an integer.
        String weightText = String.valueOf(weightInput.getText());
        int weight = Integer.parseInt(weightText);

        Boolean pounds = weightType.isChecked();

        int oneRepMax = weight*(1 + (reps/30));

        String oneRepMaxText = String.valueOf(oneRepMax);

        //return oneRepMaxText;

        return("hi");
    }

}