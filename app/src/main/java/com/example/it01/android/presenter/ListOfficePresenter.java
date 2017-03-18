package com.example.it01.android.presenter;

import com.example.it01.android.entities.Office;

import java.util.List;

/**
 * Created by IT01 on 3/14/2017.
 */

public interface ListOfficePresenter {
    void success(List<Office> office);
    void fail(String message);
}
