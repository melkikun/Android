package com.example.it01.android.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.it01.android.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailOffice extends AppCompatActivity {
    @BindView(R.id.textView2)
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_office);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        String id = intent.getStringExtra("id");
        textView.setText(id);
    }
}
