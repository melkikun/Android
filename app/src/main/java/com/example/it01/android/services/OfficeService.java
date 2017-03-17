package com.example.it01.android.services;

import com.example.it01.android.entities.Office;

/**
 * Created by IT01 on 3/14/2017.
 */

public interface OfficeService {
    public void add(Office office);
    public void edit();
    public void delete();
    public void list();
    public void findById(int id);
}
