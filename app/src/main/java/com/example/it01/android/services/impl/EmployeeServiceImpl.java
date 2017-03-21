package com.example.it01.android.services.impl;

import com.example.it01.android.api.Api;
import com.example.it01.android.api.EmployeeApi;
import com.example.it01.android.api.OfficeApi;
import com.example.it01.android.entities.Employee;
import com.example.it01.android.presenter.ListEmployeePresenter;
import com.example.it01.android.services.EmployeeService;

import java.util.List;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by IT01 on 3/21/2017.
 */

public class EmployeeServiceImpl implements EmployeeService{
    ListEmployeePresenter listEmployeePresenter;
    private EmployeeApi api = Api.retrofit().create(EmployeeApi.class);

    public EmployeeServiceImpl(ListEmployeePresenter listEmployeePresenter) {
        this.listEmployeePresenter = listEmployeePresenter;
    }

    @Override
    public void add() {

    }

    @Override
    public void edit(int id) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void list() {
        Observable<List<Employee>> listObservable = api.listEmployee();
        listObservable.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<List<Employee>>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        listEmployeePresenter.fail(e.getMessage());
                    }

                    @Override
                    public void onNext(List<Employee> employees) {
                        listEmployeePresenter.success(employees);
                    }
                });
    }

    @Override
    public void findById(int id) {

    }
}
