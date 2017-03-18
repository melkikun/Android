package com.example.it01.android.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.it01.android.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by IT01 on 3/17/2017.
 */

public class MenuAdapter extends BaseAdapter{
    private List<Integer> integers = new ArrayList<>();
    private List<String> judul = new ArrayList<>();
    private Context context;
    private LayoutInflater layoutInflater;

    public MenuAdapter(List<String> judul, List<Integer> integers, Context context) {
        this.integers = integers;
        this.context = context;
        this.judul = judul;
        layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return integers.size();
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
    public View getView(final int i, View view, ViewGroup viewGroup) {
        view = layoutInflater.inflate(R.layout.list_home_adapter, null);
        Holder holder = new Holder(view);
        for(int j = 0; j < integers.size(); j++){
            Random rnd = new Random();
            int currentStrokeColor = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
            holder.linearLayout.setBackgroundColor(currentStrokeColor);

        }
        holder.title.setText(judul.get(i).toString());
        holder.image.setImageResource(integers.get(i));
        return view;
    }

    public static class Holder{
        @BindView(R.id.image)
        ImageView image;
        @BindView(R.id.parent_layout)
        LinearLayout linearLayout;
        @BindView(R.id.title)
        TextView title;

        public Holder(View view) {
            ButterKnife.bind(this, view);
        }
    }

}
