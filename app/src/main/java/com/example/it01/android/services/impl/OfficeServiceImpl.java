package com.example.it01.android.services.impl;

import android.util.Log;

import com.example.it01.android.api.Api;
import com.example.it01.android.api.OfficeApi;
import com.example.it01.android.entities.Office;
import com.example.it01.android.presenter.EmployeePresenter;
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
    private OfficeApi officeApi;
    private EmployeePresenter employeePresenter;

    public OfficeServiceImpl(EmployeePresenter employeePresenter) {
        this.employeePresenter = employeePresenter;
        this.officeApi = Api.retrofit().create(OfficeApi.class);
    }

    @Override
    public void add() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void list() {
        officeApi = Api.retrofit().create(OfficeApi.class);
        Observable <List<Office>> observable = officeApi.getOffice();
        observable.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<List<Office>>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
//                        Log.d("error", e.getMessage().toString());
                    }

                    @Override
                    public void onNext(List<Office> offices) {
                        employeePresenter.listOffice(offices);
//                        Log.d("berhasil", "yeah");
                    }
                });

    }
}
