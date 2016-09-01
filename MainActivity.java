package com.example.admin.contextmenuexp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private static final int Computer=0;
    private static final int Gamepad=1;
    private static final int Camera=2;
    private static final int Video=3;
    private static final int Email=4;
    private static final int Mobile=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem it1 = menu.add(Menu.NONE,Computer,Menu.NONE,"Computer");
        MenuItem it2 = menu.add(Menu.NONE,Gamepad,Menu.NONE,"Gamepad");
        MenuItem it3 = menu.add(Menu.NONE,Camera,Menu.NONE,"Camera");
        MenuItem it4 = menu.add(Menu.NONE,Video,Menu.NONE,"Video");
        MenuItem it5 = menu.add(Menu.NONE,Email,Menu.NONE,"Email");
        MenuItem it6=  menu.add(Menu.NONE,Mobile,Menu.NONE,"Mobile");
        it6.setIcon(R.drawable.ic_launcher_p);
        it6.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);


        return super.onCreateOptionsMenu(menu);
    }
}
