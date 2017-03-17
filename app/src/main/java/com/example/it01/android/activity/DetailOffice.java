package com.example.it01.android.activity;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.it01.android.R;
import com.example.it01.android.adapter.OfficeDetailAdapter;
import com.example.it01.android.entities.Office;
import com.example.it01.android.presenter.DetailEmployeePresenter;
import com.example.it01.android.services.OfficeService;
import com.example.it01.android.services.impl.OfficeServiceImpl;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailOffice extends AppCompatActivity implements DetailEmployeePresenter {
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.textView2)
    TextView textView;
    @BindView(R.id.rv)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_office);
        ButterKnife.bind(this);



        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDefaultDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        Bundle bundle = getIntent().getExtras();
        int id = (int) bundle.get("id");
        Toast.makeText(getApplicationContext(), "xxxx", Toast.LENGTH_LONG).show();
        textView.setText(id+"");
        OfficeService os = new OfficeServiceImpl(this);
        os.findById(id);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public void success(Office office) {
            Toast.makeText(getApplicationContext(), office.getCity(), Toast.LENGTH_LONG).show();
        OfficeDetailAdapter adapter = new OfficeDetailAdapter(office);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void fail(Throwable e) {

    }

    @Override
    public void complete() {

    }
}
