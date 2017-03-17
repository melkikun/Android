package com.example.it01.android.services.impl;

import android.util.Log;

import com.example.it01.android.activity.DetailOffice;
import com.example.it01.android.api.Api;
import com.example.it01.android.api.OfficeApi;
import com.example.it01.android.entities.Office;
import com.example.it01.android.presenter.DetailEmployeePresenter;
import com.example.it01.android.presenter.EmployeePresenter;
import com.example.it01.android.presenter.SubmitOffice;
import com.example.it01.android.services.OfficeService;

import java.util.List;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by IT01 on 3/14/2017.
 */

public class OfficeServiceImpl implements OfficeService{
    private OfficeApi officeApi = Api.retrofit().create(OfficeApi.class);;
    private EmployeePresenter employeePresenter;
    private DetailEmployeePresenter dep;
    private SubmitOffice submitOffice;

    public OfficeServiceImpl(EmployeePresenter employeePresenter) {
        this.employeePresenter = employeePresenter;
    }

    public OfficeServiceImpl(DetailEmployeePresenter dep) {
        this.dep = dep;
    }

    public OfficeServiceImpl(SubmitOffice submitOffice) {
        this.submitOffice = submitOffice;
    }

    @Override
    public void add(Office office) {
        Observable<String> submit = officeApi.submitOffice(office);
        submit.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<String>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        submitOffice.fail(e.getMessage().toString());
                    }

                    @Override
                    public void onNext(String s) {
                       submitOffice.success(s);
                    }
                });
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void list() {
        Observable <List<Office>> observable = officeApi.getOffice();
        observable.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<List<Office>>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                    }

                    @Override
                    public void onNext(List<Office> offices) {
                        employeePresenter.listOffice(offices);
                    }
                });

    }

    @Override
    public void findById(int id) {
        Observable <Office> observable = officeApi.detailOfficeById(id);
        observable.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Office>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        dep.fail(e);
                    }

                    @Override
                    public void onNext(Office office) {
                        dep.success(office);
                    }
                });
    }
}
