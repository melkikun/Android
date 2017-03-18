package com.example.it01.android.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.it01.android.R;
import com.example.it01.android.activity.AddOffice;
import com.example.it01.android.activity.DeleteOffice;
import com.example.it01.android.activity.EditOffice;
import com.example.it01.android.activity.ListOffice;
import com.example.it01.android.adapter.MenuAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.http.DELETE;

/**
 * Created by Mikie on 3/18/2017.
 */

public class OfficeFragmentMenu extends Fragment{
    @BindView(R.id.grid)
    GridView gridView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.office_fragment_menu, container, false);
        ButterKnife.bind(this, view);
        List<String> text = new ArrayList<>();
        List<Integer> img = new ArrayList<>();
        text.add("Add");
        text.add("Edit");
        text.add("Delete");
        text.add("List");
        img.add(R.drawable.ic_customer);
        img.add(R.drawable.ic_customer);
        img.add(R.drawable.ic_customer);
        img.add(R.drawable.ic_customer);
        MenuAdapter adapter = new MenuAdapter(text, img, getContext().getApplicationContext());
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent intent = new Intent(view.getContext().getApplicationContext(), AddOffice.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(view.getContext().getApplicationContext(), EditOffice.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(view.getContext().getApplicationContext(), DeleteOffice.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(view.getContext().getApplicationContext(), ListOffice.class);
                        startActivity(intent3);
                        break;
                    default:
                        break;
                }
            }
        });
        return view;
    }
}
