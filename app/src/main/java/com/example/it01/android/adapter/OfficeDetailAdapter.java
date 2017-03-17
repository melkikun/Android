package com.example.it01.android.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.it01.android.R;
import com.example.it01.android.entities.Office;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Mikie on 3/17/2017.
 */

public class OfficeDetailAdapter extends RecyclerView.Adapter<OfficeDetailAdapter.ViewHolder>{
    private Office office;

    public OfficeDetailAdapter(Office office) {
        this.office = office;
    }

    @Override
    public OfficeDetailAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.office_detail_by_id, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(OfficeDetailAdapter.ViewHolder viewHolder, int i) {
        viewHolder.id.setText(this.office.getCity().toString());
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.id)
        TextView id;
        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
