package com.example.it01.android.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.example.it01.android.R;
import com.example.it01.android.adapter.ListEmployeeAdapter;
import com.example.it01.android.entities.Employee;
import com.example.it01.android.presenter.ListEmployeePresenter;
import com.example.it01.android.services.EmployeeService;
import com.example.it01.android.services.impl.EmployeeServiceImpl;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ListEmployee extends AppCompatActivity implements ListEmployeePresenter{
    @BindView(R.id.rv)
    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_employee);
        ButterKnife.bind(this);

        EmployeeService employeeService = new EmployeeServiceImpl(this);
        employeeService.list();
    }

    @Override
    public void success(List<Employee> employeeList) {
        Toast.makeText(getApplicationContext(), employeeList.get(0).getFirstName(), Toast.LENGTH_SHORT).show();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(layoutManager);
        rv.setItemAnimator(new DefaultItemAnimator());
        ListEmployeeAdapter adapter = new ListEmployeeAdapter(employeeList);
        rv.setAdapter(adapter);
        rv.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                Toast.makeText(getApplicationContext(), ":2", Toast.LENGTH_SHORT).show();
                super.onScrolled(recyclerView, dx, dy);
            }
        });
    }

    @Override
    public void fail(String message) {
        Log.d("error", message);
    }

    @Override
    public void complete() {

    }
}
