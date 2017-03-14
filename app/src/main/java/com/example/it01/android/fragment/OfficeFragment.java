package com.example.it01.android.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.it01.android.R;
import com.example.it01.android.adapter.OfficeAdapter;
import com.example.it01.android.entities.Office;
import com.example.it01.android.presenter.EmployeePresenter;
import com.example.it01.android.services.OfficeService;
import com.example.it01.android.services.impl.OfficeServiceImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IT01 on 3/14/2017.
 */

public class OfficeFragment extends Fragment implements EmployeePresenter{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_office, container, false);
        OfficeService officeService = new OfficeServiceImpl(this);
        officeService.list();
        return view;
    }

    @Override
    public void listOffice(List<Office> office) {
        List<String> nama = new ArrayList<>();
        nama.add("1");
        nama.add("2");
        nama.add("3");
        nama.add("4");
        OfficeAdapter oa = new OfficeAdapter(nama, getActivity());
        ListView listView = (ListView) getActivity().findViewById(R.id.list_office);
        listView.setAdapter(oa);
    }
}
