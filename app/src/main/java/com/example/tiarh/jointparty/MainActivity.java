package com.example.tiarh.jointparty;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    private NavigationView navigationView;

    public static TextView home_txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        home_txt = findViewById(R.id.home_txt);


        ////////////////////////// MENU LATERALE //////////////////////////

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.apri, R.string.chiudi);
        navigationView = (NavigationView) findViewById(R.id.nav_menu);

        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }



    ////////////////////////// MENU LATERALE //////////////////////////

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        if(mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
            mDrawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.nav_home:
                Toast.makeText(getApplicationContext(), "HOME", Toast.LENGTH_LONG).show();
                home_txt.setText("HOME");
                break;
            case R.id.nav_coltivazione:
                Toast.makeText(getApplicationContext(), "TECNICHE DI COLTIVAZIONE", Toast.LENGTH_LONG).show();
                home_txt.setText("TECNICHE DI COLTIVAZIONE");
                break;
            case R.id.nav_leggi:
                Toast.makeText(getApplicationContext(), "LO STATO DELLA CANNABIS", Toast.LENGTH_LONG).show();
                home_txt.setText("LO STATO DELLA CANNABIS");
                break;
            case R.id.nav_fatti_segreti:
                Toast.makeText(getApplicationContext(), "FATTI SEGRETI", Toast.LENGTH_LONG).show();
                home_txt.setText("FATTI SEGRETI");
                break;
        }
        mDrawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}
