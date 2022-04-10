package com.trackme.helpersaroundyou.Mainfearures;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.trackme.helpersaroundyou.R;

public class Mainactivity extends AppCompatActivity {
    public DrawerLayout drawerLayout;
    public ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView nview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Nav
        nview=findViewById(R.id.sidebar);
        drawerLayout = findViewById(R.id.side_drawer);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        nview.setNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.lgout:
                    signout();
                    return true;
                case R.id.help:
                    open_help();
                    return true;
                case R.id.your_profile:
                    yourprofile();
                    return true;
            }
            return false;
        });
        //
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    private void signout() {
        Toast.makeText(getApplicationContext(),"Sign Out",Toast.LENGTH_LONG).show();
        drawerLayout.closeDrawer(GravityCompat.START);//close drawer when option clicked.
    }
    private void open_help() {
    }
    private void yourprofile() {
    }
}