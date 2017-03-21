package com.example.it01.android.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.example.it01.android.MainActivity;
import com.example.it01.android.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Login extends AppCompatActivity {
    @BindView(R.id.username)
    EditText un;
    @BindView(R.id.password)
    EditText pwd;
    @BindView(R.id.layou_login)
    LinearLayout linearLayout;
    private SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        sp = getSharedPreferences("login", Context.MODE_PRIVATE);
        if (sp.contains("un")) {
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
        }
    }

    @OnClick(R.id.login)
    public void Login(View view) {
        Log.d("login click", "1");
        String username = this.un.getText().toString();
        String password = this.pwd.getText().toString();
        sp = getSharedPreferences("login", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("un", username);
        editor.putString("pwd", password);
        //fungsi cek username dan password
        if (username.equals("miko") && password.equals("miko")) {
            editor.commit();
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
        }else{
           AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("salah username atau password");
            builder.setTitle("MESSAGE");
            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });
            builder.show();
        }
    }

    @Override
    public void onBackPressed() {
        if (sp.contains("un")) {
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
        }
    }
}
