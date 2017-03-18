package com.example.it01.android;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.it01.android.fragment.CustomerFragmentMenu;
import com.example.it01.android.fragment.EmployeeFragmentMenu;
import com.example.it01.android.fragment.HomeFragmentMenu;
import com.example.it01.android.fragment.OfficeFragmentMenu;
import com.example.it01.android.fragment.ProductFragmentMenu;
import com.example.it01.android.services.OfficeService;

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
        HomeFragmentMenu hf = new HomeFragmentMenu();
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
            HomeFragmentMenu hf = new HomeFragmentMenu();
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
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        switch (item.getItemId()){
            case R.id.home:
                HomeFragmentMenu homeFragmentMenu = new HomeFragmentMenu();
                ft.replace(R.id.frame, homeFragmentMenu);
                ft.addToBackStack("0");
                ft.commit();
                break;
            case R.id.office:
                OfficeFragmentMenu officeFragmentMenu = new OfficeFragmentMenu();
                ft.replace(R.id.frame, officeFragmentMenu);
                ft.addToBackStack("1");
                ft.commit();
                break;
            case R.id.employee:
                EmployeeFragmentMenu employeeFragmentMenu = new EmployeeFragmentMenu();
                ft.replace(R.id.frame, employeeFragmentMenu);
                ft.addToBackStack("2");
                ft.commit();
                break;
            case R.id.customer:
                CustomerFragmentMenu customerFragmentMenu = new CustomerFragmentMenu();
                ft.replace(R.id.frame, customerFragmentMenu);
                ft.addToBackStack("3");
                ft.commit();
                break;
            case R.id.product:
                ProductFragmentMenu productFragmentMenu = new ProductFragmentMenu();
                ft.replace(R.id.frame, productFragmentMenu);
                ft.addToBackStack("4");
                ft.commit();
                break;
            default:
                break;
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
