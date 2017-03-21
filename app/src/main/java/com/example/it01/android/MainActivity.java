package com.example.it01.android;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.it01.android.activity.Login;
import com.example.it01.android.fragment.CustomerFragmentMenu;
import com.example.it01.android.fragment.EmployeeFragmentMenu;
import com.example.it01.android.fragment.HomeFragmentMenu;
import com.example.it01.android.fragment.OfficeFragmentMenu;
import com.example.it01.android.fragment.ProductFragmentMenu;
import com.example.it01.android.services.OfficeService;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private OfficeService officeService;
    private SharedPreferences sharedPreferences;

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.nav_view)
    NavigationView navigationView;
    @BindView(R.id.drawer_layout)
    DrawerLayout drawer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        //mendapatkan share preferences login
        sharedPreferences = getSharedPreferences("login", Context.MODE_PRIVATE);
        if(sharedPreferences.contains("un")){
            //ambil username dan password
            String un = sharedPreferences.getString("un", null);
            setSupportActionBar(toolbar);
            //set fragment home sebagai default
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            toolbar.setTitle("Main Menu");
            HomeFragmentMenu hf = new HomeFragmentMenu();
            ft.replace(R.id.frame, hf);
            ft.commit();

            //setting check untuk navigation view
            navigationView.getMenu().getItem(0).setChecked(true);

            //setting drawer layout
            ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                    this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
            drawer.setDrawerListener(toggle);
            toggle.syncState();

            //set nama pada navigation view sesuai dengan login
            navigationView.setNavigationItemSelectedListener(this);
            View headerView = navigationView.getHeaderView(0);
            TextView unx = (TextView) headerView.findViewById(R.id.username);
            unx.setText("Selamat Datang" + un); //inject textview di navigation view
        }else{
            startActivity(new Intent(getApplicationContext(), Login.class));
        }
    }

    //tombol back ditekan
    @Override
    public void onBackPressed() {
        if(navigationView.getMenu().getItem(0).isChecked() == true){
            super.onBackPressed();
            finish();
        }else{
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            toolbar.setTitle("Main Menu");
            HomeFragmentMenu hf = new HomeFragmentMenu();
            ft.replace(R.id.frame, hf);
            ft.commit();
            navigationView.getMenu().getItem(0).setChecked(true);
        }
    }

    //action pada bagian navigation menu
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        switch (item.getItemId()){
            case R.id.home:
                navigationView.getMenu().getItem(0).setChecked(true);
                HomeFragmentMenu homeFragmentMenu = new HomeFragmentMenu();
                ft.replace(R.id.frame, homeFragmentMenu);
                ft.addToBackStack("0");
                ft.commit();
                break;
            case R.id.office:
                navigationView.getMenu().getItem(1).setChecked(true);
                OfficeFragmentMenu officeFragmentMenu = new OfficeFragmentMenu();
                ft.replace(R.id.frame, officeFragmentMenu);
                ft.addToBackStack("1");
                ft.commit();
                break;
            case R.id.employee:
                navigationView.getMenu().getItem(2).setChecked(true);
                EmployeeFragmentMenu employeeFragmentMenu = new EmployeeFragmentMenu();
                ft.replace(R.id.frame, employeeFragmentMenu);
                ft.addToBackStack("2");
                ft.commit();
                break;
            case R.id.customer:
                navigationView.getMenu().getItem(3).setChecked(true);
                CustomerFragmentMenu customerFragmentMenu = new CustomerFragmentMenu();
                ft.replace(R.id.frame, customerFragmentMenu);
                ft.addToBackStack("3");
                ft.commit();
                break;
            case R.id.product:
                navigationView.getMenu().getItem(4).setChecked(true);
                ProductFragmentMenu productFragmentMenu = new ProductFragmentMenu();
                ft.replace(R.id.frame, productFragmentMenu);
                ft.addToBackStack("4");
                ft.commit();
                break;
            case R.id.logout:
                sharedPreferences = getSharedPreferences("login", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.commit();
                startActivity(new Intent(getApplicationContext(), Login.class));
                break;
            default:
                break;
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
