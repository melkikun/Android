package com.example.it01.android.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.example.it01.android.R;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by IT01 on 3/20/2017.
 */

public class CustomExpandableListView  extends BaseExpandableListAdapter{
    private Context context;
    private List<String> title;
    private HashMap<String, List<String>> detail;

    public CustomExpandableListView(Context context, List<String> title, HashMap<String, List<String>> detail) {
        this.context = context;
        this.title = title;
        this.detail = detail;
    }

    @Override
    public int getGroupCount() {
        return this.title.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return this.detail.get(this.title.get(i)).size();
    }

    @Override
    public Object getGroup(int i) {
        return this.title.get(i);
    }

    @Override
    public Object getChild(int i, int i1) {
        return this.detail.get(this.title.get(i)).get(i1);
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        String groupText = (String) getGroup(i);
        if(view ==  null){
            LayoutInflater inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.list_group, null);
        }
        TextView group = (TextView) view.findViewById(R.id.list_group);
        group.setText(groupText);
        return view;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        String childText = (String) getChild(i, i1);
        if(view == null){
            LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.list_item, null);
        }
        TextView item = (TextView) view.findViewById(R.id.li);
        item.setTypeface(null, Typeface.BOLD);
        item.setText(childText);
        return view;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }
}
