package com.example.zqc.smartdemo.Service.Utilities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.zqc.smartdemo.R;

/**
 * Created by zqc on 2017/4/17.
 */

public class UtilitiesActivity extends AppCompatActivity {
    private Intent intent;
    private Button button1, button2;
    private Toolbar toolbar;
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn1:
                    intent = new Intent();
                    intent.setClass(UtilitiesActivity.this, IntoActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn2:
                    intent = new Intent();
                    intent.setClass(UtilitiesActivity.this, TurnOutActivity.class);
                    startActivity(intent);
                    break;
            }
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.utilities_layout);
        inntview();

    }

    private void inntview() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button1.setOnClickListener(listener);
        button2.setOnClickListener(listener);
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
