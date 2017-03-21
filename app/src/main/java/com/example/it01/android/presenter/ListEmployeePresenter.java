package com.example.it01.android.presenter;

import com.example.it01.android.entities.Employee;

import java.util.List;

/**
 * Created by IT01 on 3/21/2017.
 */

public interface ListEmployeePresenter {
    void success(List<Employee> employeeList);
    void fail(String message);
    void complete();
}
