package com.example.zqc.smartdemo.ConvenienceInquiries.HousingFund;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.zqc.smartdemo.R;

/**
 * Created by zqc on 2017/4/18.
 */

public class HousingFundActivity extends AppCompatActivity {
    private Button button1, button2, button3;
    private Intent intent;
    private Toast toast;
    private Toolbar toolbar;
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn1:
                    intent = new Intent();
                    intent.setClass(HousingFundActivity.this, IntroductionActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn2:
                    intent = new Intent();
                    intent.setClass(HousingFundActivity.this, InquireActivity.class);
                    startActivity(intent);

                    break;
                case R.id.btn3:
                    intent = new Intent();
                    intent.setClass(HousingFundActivity.this,
                            NewsActivity.class);
                    startActivity(intent);
                    break;


            }
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.housing_fund_layout);
        inntview();


    }

    private void inntview() {
        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button3 = (Button) findViewById(R.id.btn3);
        button1.setOnClickListener(listener);
        button2.setOnClickListener(listener);
        button3.setOnClickListener(listener);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
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
