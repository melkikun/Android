package com.example.it01.android.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.it01.android.R;
import com.example.it01.android.adapter.HomeAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by IT01 on 3/17/2017.
 */

public class HomeFragment extends Fragment{
    @BindView(R.id.grid)
    GridView gridView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this, view);
        List<Integer> image = new ArrayList<>();
        List<String> judul = new ArrayList<>();
        image.add(R.drawable.ic_office);
        image.add(R.drawable.ic_employee_add);
        image.add(R.drawable.ic_customer);
        image.add(R.drawable.ic_product);
        judul.add("Add Office");
        judul.add("Add Employee");
        judul.add("Add Customer");
        judul.add("Add Product");
        HomeAdapter adapter = new HomeAdapter(judul, image, view.getContext());
        gridView.setAdapter(adapter);
        return view;
    }
}
