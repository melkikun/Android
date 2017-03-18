package com.example.it01.android.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.it01.android.R;
import com.example.it01.android.adapter.MenuAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Mikie on 3/18/2017.
 */

public class EmployeeFragmentMenu extends Fragment {
    @BindView(R.id.grid)
    GridView gridView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.employee_fragment_menu, container, false);
        ButterKnife.bind(this, view);
        List<String> text = new ArrayList<>();
        List<Integer> img = new ArrayList<>();
        text.add("Add");
        text.add("Edit");
        text.add("Delete");
        text.add("List");
        img.add(R.drawable.ic_customer);
        img.add(R.drawable.ic_customer);
        img.add(R.drawable.ic_customer);
        img.add(R.drawable.ic_customer);
        MenuAdapter adapter = new MenuAdapter(text, img, getContext().getApplicationContext());
        gridView.setAdapter(adapter);
        return view;
    }
}