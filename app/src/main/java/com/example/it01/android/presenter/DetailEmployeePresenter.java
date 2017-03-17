package com.example.it01.android.presenter;

import com.example.it01.android.entities.Office;

/**
 * Created by Mikie on 3/17/2017.
 */

public interface DetailEmployeePresenter {
    public void success(Office office);
    public void fail(Throwable e);
    public void complete();
}
