package com.example.gaoxinqu;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Created by zqc on 2017/4/19.
 */

public class RegisteredActivity extends AppCompatActivity {
    private Button button1, button2, button3;
    private Intent intent;
    private Toolbar toolbar;
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn1:
                    intent=new Intent();
                    intent.setClass(RegisteredActivity.this,CentralHospitalActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn2:
                    intent=new Intent();
                    intent.setClass(RegisteredActivity.this,Maternal.class);
                    startActivity(intent);
                    break;
                case R.id.btn3:
                    intent=new Intent();
                    intent.setClass(RegisteredActivity.this,PeopleHospitalActivity.class);
                    startActivity(intent);
                    break;
            }
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registered_layout);
        inntview();
    }

    private void inntview() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button3 = (Button) findViewById(R.id.btn3);

        button1.setOnClickListener(listener);
        button2.setOnClickListener(listener);
        button3.setOnClickListener(listener);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();

        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);


    }
}
