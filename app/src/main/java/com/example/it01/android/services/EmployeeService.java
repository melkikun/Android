package com.example.it01.android.services;

/**
 * Created by IT01 on 3/21/2017.
 */

public interface EmployeeService {
    void add();
    void edit(int id);
    void delete(int id);
    void list();
    void findById(int id);
}
