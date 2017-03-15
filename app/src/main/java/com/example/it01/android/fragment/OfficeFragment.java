package com.example.it01.android.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import com.example.it01.android.R;
import com.example.it01.android.activity.DetailOffice;
import com.example.it01.android.adapter.OfficeAdapter;
import com.example.it01.android.entities.Office;
import com.example.it01.android.listener.RvClickListerner;
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
    public void listOffice(final List<Office> office) {
        RecyclerView recyclerView = (RecyclerView) getView().findViewById(R.id.list_office);
        OfficeAdapter officeAdapter = new OfficeAdapter(office);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(officeAdapter);
        recyclerView.addOnItemTouchListener(new RvClickListerner(getContext(), recyclerView, new RvClickListerner.ClickListerner() {
            @Override
            public void onClick(View view, int position) {
//                Toast.makeText(getActivity().getApplicationContext(), office.get(position).getOfficeCode().toString(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(view.getContext(), DetailOffice.class);
                intent.putExtra("id", office.get(position).getOfficeCode());
                startActivity(intent);
            }
        }));
    }
}
