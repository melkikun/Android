package com.example.it01.android.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.it01.android.R;
import com.example.it01.android.entities.Office;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Mikie on 3/18/2017.
 */

public class ListOfficeAdapter extends RecyclerView.Adapter<ListOfficeAdapter.ViewHolder>{
    private List<Office> list;
//    private List<Integer> icon = new ArrayList<>();

    public ListOfficeAdapter(List<Office> list) {
        this.list = list;
//        this.icon = icon;
    }

    @Override
    public ListOfficeAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.detail_list_office, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListOfficeAdapter.ViewHolder viewHolder, int i) {
        viewHolder.city.setText(list.get(i).getCity().toString());
        viewHolder.phone.setText(list.get(i).getPhone().toString());
        viewHolder.address1.setText(list.get(i).getAddressLine1().toString());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.city)
        public TextView city;
        @BindView(R.id.phone)
        public TextView phone;
        @BindView(R.id.address1)
        public TextView address1;
        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
