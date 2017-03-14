package com.example.it01.android.api;

import com.example.it01.android.entities.Office;

import java.util.List;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by IT01 on 3/14/2017.
 */

public interface OfficeApi {
    @GET("office")
    Observable<List<Office>> getOffice();
}
