package com.example.tiarh.jointparty;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    ////////////////////////// MENU LATERALE //////////////////////////
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    private NavigationView navigationView;

    ////////////////////////// FRAGMENT //////////////////////////
    private PageAdapter mPageAdapter;
    private ViewPager mViewPager;

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
                setViewPager(0);
                break;
            case R.id.nav_coltivazione:
                setViewPager(1);
                break;
            case R.id.nav_leggi:
                setViewPager(2);
                break;
            case R.id.nav_fatti_segreti:
                setViewPager(3);
                break;
            case R.id.nav_impostazioni:
                setViewPager(4);
                break;
        }
        mDrawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    ////////////////////////// FRAGMENT //////////////////////////

    private void setupViewPager(ViewPager viewPager){
        PageAdapter adapter = new PageAdapter(getSupportFragmentManager());
        adapter.addFragment(new HomeFragment(), "HomeFragment");
        adapter.addFragment(new TecnicheFragment(), "TecnicheFragment");
        adapter.addFragment(new LeggiFragment(), "LeggiFragment");
        adapter.addFragment(new FattiSegretiFragment(), "FattiSegretiFragment");
        adapter.addFragment(new ImpostazioniFragment(), "ImpostazioniFragment");
        viewPager.setAdapter(adapter);
    }

    private void setViewPager(int fragmentNumber) {
        mViewPager.setCurrentItem(fragmentNumber);
    }
}
