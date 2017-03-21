package com.example.it01.android.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.it01.android.R;
import com.example.it01.android.entities.Employee;

import org.w3c.dom.Text;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by IT01 on 3/21/2017.
 */

public class ListEmployeeAdapter extends RecyclerView.Adapter<ListEmployeeAdapter.ViewHolder>{
    private List<Employee> employeeList;

    public ListEmployeeAdapter(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public ListEmployeeAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_list_employee, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListEmployeeAdapter.ViewHolder holder, int position) {
//        Log.d("email", employeeList.get(position).getEmail());
        holder.nama.setText(employeeList.get(position).getFirstName());
    }

    @Override
    public int getItemCount() {
        return employeeList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.nama)
        TextView nama;
        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
