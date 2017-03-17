package com.example.it01.android.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.example.it01.android.R;
import com.example.it01.android.entities.Office;
import com.example.it01.android.presenter.SubmitOffice;
import com.example.it01.android.services.OfficeService;
import com.example.it01.android.services.impl.OfficeServiceImpl;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Mikie on 3/17/2017.
 */

public class InputOfficeFragment extends Fragment implements SubmitOffice{
    @BindView(R.id.city)
    EditText city;
    @BindView(R.id.phone)
    EditText phone;
    @BindView(R.id.address1)
    EditText address1;
    @BindView(R.id.address2)
    EditText address2;
    @BindView(R.id.state)
    EditText state;
    @BindView(R.id.country)
    EditText country;
    @BindView(R.id.postal_code)
    EditText postal_code;
    @BindView(R.id.territory)
    EditText territory;

    private OfficeService os;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_input_office, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick(R.id.submit)
    public void submitOffice(View view){
        String _city = city.getText().toString();
        String _phone = phone.getText().toString();
        String _address1 = address1.getText().toString();
        String _address2 = address2.getText().toString();
        String _state = state.getText().toString();
        String _country = country.getText().toString();
        String _postal_code = postal_code.getText().toString();
        String _territory = territory.getText().toString();
        Office office = new Office();
        office.setCity(_city);
        office.setPhone(_phone);
        office.setAddressLine1(_address1);
        office.setAddressLine2(_address2);
        office.setState(_state);
        office.setCountry(_country);
        office.setPostalCode(_postal_code);
        office.setTerritory(_territory);
        os = new OfficeServiceImpl(this);
        os.add(office);
    }

    @Override
    public void success(String message) {
        Toast.makeText(getContext().getApplicationContext(), message, Toast.LENGTH_LONG).show();
        Fragment homeFragment = new InputOfficeFragment();
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame, homeFragment);
        fragmentTransaction.commit();
    }

    @Override
    public void fail(String message) {
        Toast.makeText(getContext().getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }

    @Override
    public void complete() {

    }
}
