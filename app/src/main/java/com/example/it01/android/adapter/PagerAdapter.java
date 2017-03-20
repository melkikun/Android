package com.example.it01.android.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.it01.android.fragment.TabFragmentCustomer;
import com.example.it01.android.fragment.TabFragmentEmployee;
import com.example.it01.android.fragment.TabFragmentOffice;
import com.example.it01.android.fragment.TabFragmentProduct;

/**
 * Created by IT01 on 3/20/2017.
 */

public class PagerAdapter extends FragmentStatePagerAdapter{
    int tabCount;
    public PagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                TabFragmentOffice office =new TabFragmentOffice();
                return office;
            case 1:
                TabFragmentEmployee employee = new TabFragmentEmployee();
                return employee;
            case 2:
                TabFragmentCustomer customer = new TabFragmentCustomer();
                return customer;
            case 3:
                TabFragmentProduct product = new TabFragmentProduct();
                return product;
            default:
            return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
