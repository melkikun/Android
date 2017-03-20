package com.example.it01.android.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.it01.android.R;
import com.example.it01.android.entities.Office;
import com.example.it01.android.presenter.DetailEmployeePresenter;
import com.example.it01.android.services.OfficeService;
import com.example.it01.android.services.impl.OfficeServiceImpl;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailListOffice extends AppCompatActivity implements DetailEmployeePresenter{
    @BindView(R.id.id)
    TextView id;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.city)
    TextView city;
    @BindView(R.id.phone)
    TextView phone;
    @BindView(R.id.address1)
    TextView address1;
    @BindView(R.id.address2)
    TextView address2;
    @BindView(R.id.state)
    TextView state;
    @BindView(R.id.country)
    TextView country;
    @BindView(R.id.postal_code)
    TextView postal_code;
    @BindView(R.id.territory)
    TextView territory;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list_office);
        ButterKnife.bind(this);
        //untuk toolbar
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //ambil id
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String _id = (String) bundle.get("id");
        id.setText("id anda adalah : " + _id);
        OfficeService os = new OfficeServiceImpl(this);
        os.findById(Integer.parseInt(_id));

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
    public void success(Office office) {
        city.setText(office.getCity().toString());
        phone.setText(office.getPhone().toString());
        address1.setText(office.getAddressLine1().toString());
        address2.setText(office.getAddressLine2().toString());
        state.setText(office.getState().toString());
        country.setText(office.getCountry().toString());
        postal_code.setText(office.getPostalCode().toString());
        territory.setText(office.getTerritory().toString());
    }

    @Override
    public void fail(Throwable e) {

    }

    @Override
    public void complete() {

    }
}
