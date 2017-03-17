package com.example.it01.android;

import android.content.Intent;
import android.os.Bundle;
import android.provider.SyncStateContract;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.it01.android.entities.Office;
import com.example.it01.android.fragment.HomeFragment;
import com.example.it01.android.fragment.InputOfficeFragment;
import com.example.it01.android.fragment.OfficeFragment;
import com.example.it01.android.presenter.EmployeePresenter;
import com.example.it01.android.services.OfficeService;
import com.example.it01.android.services.impl.OfficeServiceImpl;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private OfficeService officeService;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.nav_view)
    NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        toolbar.setTitle("Main Menu");
        HomeFragment hf = new HomeFragment();
        ft.replace(R.id.frame, hf);
        ft.commit();
        navigationView.getMenu().getItem(0).setChecked(true);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        if(navigationView.getMenu().getItem(0).isChecked() == true){
            super.onBackPressed();
        }else{
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            toolbar.setTitle("Main Menu");
            HomeFragment hf = new HomeFragment();
            ft.replace(R.id.frame, hf);
            ft.commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        int id = item.getItemId();
        if(id == R.id.home){
            toolbar.setTitle("Main Menu");
            HomeFragment hf = new HomeFragment();
            ft.replace(R.id.frame, hf);
            ft.addToBackStack("satu");
            ft.commit();
            navigationView.getMenu().getItem(0).setChecked(true);
            navigationView.setCheckedItem(id);
        }
        if (id == R.id.l_office) {
            toolbar.setTitle("Detail Office");
            OfficeFragment of = new OfficeFragment();
            ft.replace(R.id.frame, of);
            ft.addToBackStack("dua");
            ft.commit();
            navigationView.getMenu().getItem(1).setChecked(true);
            navigationView.setCheckedItem(id);
        } else if (id == R.id.l_employee) {

        } else if (id == R.id.l_customer) {

        } else if (id == R.id.l_product) {

        }else if(id == R.id.i_office){
            toolbar.setTitle("Input Office Baru");
            InputOfficeFragment iof = new InputOfficeFragment();
            ft.replace(R.id.frame, iof);
            ft.addToBackStack("input office");
            ft.commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
