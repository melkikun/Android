package com.example.it01.android.activity;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.it01.android.R;
import com.example.it01.android.adapter.ListOfficeAdapter;
import com.example.it01.android.entities.Office;
import com.example.it01.android.listener.RecyclerTouchListener;
import com.example.it01.android.presenter.ListOfficePresenter;
import com.example.it01.android.services.OfficeService;
import com.example.it01.android.services.impl.OfficeServiceImpl;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ListOffice extends AppCompatActivity implements ListOfficePresenter{
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.rv)
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_office);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDefaultDisplayHomeAsUpEnabled(true);
        OfficeService os = new OfficeServiceImpl(this);
        os.list();

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                break;
        }
        return true;
    }

    @Override
    public void success(final List<Office> office) {
        RecyclerView.LayoutManager  layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        ListOfficeAdapter adapter  = new ListOfficeAdapter(office);
        recyclerView.setAdapter(adapter);
        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new RecyclerTouchListener.ClickListerner() {
            @Override
            public void onClick(View view, int position) {
                Intent intent = new Intent(view.getContext().getApplicationContext(), DetailListOffice.class);
                intent.putExtra("id", office.get(position).getOfficeCode().toString());
                startActivity(intent);
            }
        }));
    }

    @Override
    public void fail(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
