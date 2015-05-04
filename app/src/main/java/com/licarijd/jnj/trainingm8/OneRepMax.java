package com.licarijd.jnj.trainingm8;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;
import android.widget.ImageButton;


public class OneRepMax extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_rep_max);
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

    // Called when the user clicks the Send button. This is for the first page.
    public void open_one_rep_max_results(View view) {

        // Do something in response to button
        Intent nextScreen = new Intent(getApplicationContext(), OneRepMaxResults.class);

        startActivity(nextScreen);

    }

}
