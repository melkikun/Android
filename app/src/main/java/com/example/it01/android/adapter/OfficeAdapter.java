package com.example.it01.android.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.it01.android.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IT01 on 3/14/2017.
 */

public class OfficeAdapter extends BaseAdapter{
    private List<String> list = new ArrayList<>();
    private Context context;
    private LayoutInflater layoutInflater;

    public OfficeAdapter(List<String> list, Context context) {
        this.list = list;
        this.context = context;

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = layoutInflater.inflate(R.layout.detail_list_office, null);
        TextView textView = (TextView) view.findViewById(R.id.textView);
        textView.setText(list.get(i));
        return view;
    }
}
