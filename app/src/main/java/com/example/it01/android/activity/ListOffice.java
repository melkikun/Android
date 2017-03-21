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
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.it01.android.R;
import com.example.it01.android.adapter.ListOfficeAdapter;
import com.example.it01.android.entities.Office;
import com.example.it01.android.listener.RecyclerTouchListener;
import com.example.it01.android.presenter.ListOfficePresenter;
import com.example.it01.android.services.OfficeService;
import com.example.it01.android.services.impl.OfficeServiceImpl;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ListOffice extends AppCompatActivity implements ListOfficePresenter{
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.rv)
    RecyclerView recyclerView;
    @BindView(R.id.search)
    EditText search;
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

        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
            }
        });

        search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                charSequence = charSequence.toString().toLowerCase();
                List<Office> filter = new ArrayList<Office>();
                for (int j = 0; j < office.size(); j++){
                    String country = office.get(j).getCountry().toLowerCase().toString();
                    if(country.contains(charSequence)){
                        Office office1 = new Office();
                        office1.setCity(office.get(j).getCity().toString());
                        office1.setAddressLine1(office.get(j).getAddressLine1());
                        office1.setCity(office.get(j).getCountry());
                        office1.setOfficeCode(office.get(j).getOfficeCode());
                        office1.setAddressLine2(office.get(j).getAddressLine2());
                        office1.setPhone(office.get(j).getPhone());
                        office1.setState(office.get(j).getState());
                        office1.setTerritory(office.get(j).getTerritory());
                        office1.setPostalCode(office.get(j).getPostalCode());
                        filter.add(office1);
                    }
                }

                RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(getApplicationContext());
                recyclerView.setLayoutManager(layoutManager1);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                ListOfficeAdapter adapter1 = new ListOfficeAdapter(filter);
                recyclerView.setAdapter(adapter1);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    @Override
    public void fail(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
