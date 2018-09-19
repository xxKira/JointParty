package com.example.tiarh.jointparty;


import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    ////////////////////////// MENU LATERALE //////////////////////////
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    private NavigationView navigationView;

    ////////////////////////// FRAGMENT //////////////////////////
    private PageAdapter mPageAdapter;
    private static ViewPager mViewPager;
    NonSwipeableViewPager nonSwipeableViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ////////////////////////// MENU LATERALE //////////////////////////
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.apri, R.string.chiudi);
        navigationView = (NavigationView) findViewById(R.id.nav_menu);

        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ////////////////////////// FRAGMENT //////////////////////////
        mPageAdapter = new PageAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.view_pager);
        setupViewPager(mViewPager);


    }

    ////////////////////////// MENU LATERALE //////////////////////////

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        if (mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
            mDrawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_home:
                setViewPager(0);
                setTitle("Home");
                break;
            case R.id.nav_coltivazione:
                setViewPager(1);
                setTitle("Metodi di coltivazione");
                break;
            case R.id.nav_leggi:
                setViewPager(2);
                setTitle(" "); //Lo Stato della Cannabis
                break;
            case R.id.nav_fatti_segreti:
                setViewPager(3);
                setTitle("Fatti Segreti");
                break;
            case R.id.nav_impostazioni:
                setViewPager(4);
                setTitle("Impostazioni");
                break;
        }
        mDrawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    ////////////////////////// FRAGMENT //////////////////////////

    private void setupViewPager(ViewPager viewPager) {
        PageAdapter adapter = new PageAdapter(getSupportFragmentManager());
        adapter.addFragment(new HomeFragment(), "HomeFragment");
        adapter.addFragment(new TecnicheFragment(), "TecnicheFragment");
        adapter.addFragment(new LeggiFragment(), "LeggiFragment");
        adapter.addFragment(new FattiSegretiFragment(), "FattiSegretiFragment");
        adapter.addFragment(new ImpostazioniFragment(), "ImpostazioniFragment");
        adapter.addFragment(new Metodo1Fragment(), "Metodo1Fragment");
        viewPager.setAdapter(adapter);
    }

    public static void setViewPager(int fragmentNumber) {
        mViewPager.setCurrentItem(fragmentNumber);
    }

    ////////////////////////// GESTIONE PULSANTI //////////////////////////

    public void metodo1(View v){
        MainActivity.setViewPager(5);
    }
}

