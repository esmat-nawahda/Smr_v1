package com.example.geniucodepointer.smr_v1.MainMenu;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.geniucodepointer.smr_v1.Actions.Actions;
import com.example.geniucodepointer.smr_v1.Actions.DoActions;
import com.example.geniucodepointer.smr_v1.Actions.Settings;
import com.example.geniucodepointer.smr_v1.R;


public class MainActivity extends ActionBarActivity {


    public  Actions actions = new DoActions();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        initlized();
        return true;
    }

    public void initlized(){
        Button edit_Button = (Button) findViewById(R.id.edit_button);
        Button setting_Button = (Button) findViewById(R.id.setting_button);
        Button friends_Button = (Button) findViewById(R.id.friends_button);



        edit_Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                actions.editImage();
                Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
            }

        });

        setting_Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Settings setting = new Settings();
                actions.settings(getFragmentManager(),setting);
                Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
            }

        });
        friends_Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                actions.getFriends();
                Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
            }

        });
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






}
