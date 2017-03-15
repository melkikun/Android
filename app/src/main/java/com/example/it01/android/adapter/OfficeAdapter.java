package com.example.it01.android.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.it01.android.R;
import com.example.it01.android.entities.Office;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by IT01 on 3/14/2017.
 */

public class OfficeAdapter extends RecyclerView.Adapter<OfficeAdapter.ViewHolder>{
    private List<Office> offices = new ArrayList<>();

    public OfficeAdapter(List<Office> offices) {
        this.offices = offices;
    }

    @Override
    public OfficeAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.detail_list_office, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(OfficeAdapter.ViewHolder holder, int position) {
        holder.city.setText(offices.get(position).getCity());
        holder.phone.setText(offices.get(position).getPhone());
        holder.address1.setText(offices.get(position).getAddressLine1());
    }

    @Override
    public int getItemCount() {
        return offices.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.city)
        public TextView city;
        @BindView(R.id.phone)
        public TextView phone;
        @BindView(R.id.address1)
        TextView address1;
        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
