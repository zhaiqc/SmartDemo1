package com.example.zqc.smartdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;


import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.zqc.smartdemo.ConvenienceInquiries.ConvenienceInquiriesActivity;
import com.example.zqc.smartdemo.Service.ServiceActivity;
import com.example.zqc.smartdemo.View.Textimg;

/**
 * Created by zqc on 2017/4/15.
 */

public class MainActivity extends AppCompatActivity {
    private Textimg textimg1, textimg2;
    private Intent inent;
    private Toolbar toolbar;
    private CollapsingToolbarLayout collapsingToolbarLayout;
    private View.OnClickListener listener1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.img1:
                    break;
                case R.id.img2:
                    inent = new Intent();
                    inent.setClass(MainActivity.this, ServiceActivity.class);
                    startActivity(inent);
                    break;
                case R.id.img3:
                    inent = new Intent();
                    inent.setClass(MainActivity.this, ConvenienceInquiriesActivity.class);
                    startActivity(inent);
                    break;


                case R.id.img4:

                    break;
            }
        }
    };
    private View.OnClickListener listener2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.img1:
                    Toast.makeText(getApplicationContext(), "111111", Toast.LENGTH_LONG).show();
                    break;
                case R.id.img2:
                    Toast.makeText(getApplicationContext(), "111111", Toast.LENGTH_LONG).show();
                    break;
                case R.id.img3:
                    Toast.makeText(getApplicationContext(), "111111", Toast.LENGTH_LONG).show();
                    break;
                case R.id.img4:
                    Toast.makeText(getApplicationContext(), "111111", Toast.LENGTH_LONG).show();
                    break;
            }
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        inntView();


    }

    private void inntView() {
        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        textimg1 = (com.example.zqc.smartdemo.View.Textimg) findViewById(R.id.textimg1);
        textimg2 = (com.example.zqc.smartdemo.View.Textimg) findViewById(R.id.textimg2);

        textimg1.getImg1().setImageResource(R.drawable.server_img);
        textimg1.getImg2().setImageResource(R.drawable.zhinan_img);
        textimg1.getImg3().setImageResource(R.drawable.find_img);
        textimg1.getImg4().setImageResource(R.drawable.hospital_img);
        textimg1.getTextView1().setText("物业服务");
        textimg1.getTextView2().setText("办事服务");
        textimg1.getTextView3().setText("便民查询");
        textimg1.getTextView4().setText("医疗保障");

        textimg2.getImg1().setImageResource(R.drawable.shop_img);
        textimg2.getImg2().setImageResource(R.drawable.notification_img);
        textimg2.getImg3().setImageResource(R.drawable.zixun_img);
        textimg2.getImg4().setImageResource(R.drawable.liuliang_img);
        textimg2.getTextView1().setText("便民购物");
        textimg2.getTextView2().setText("通知公告");
        textimg2.getTextView3().setText("民生咨询");
        textimg2.getTextView4().setText("流量充值");


        textimg1.getImg1().setOnClickListener(listener1);
        textimg1.getImg2().setOnClickListener(listener1);
        textimg1.getImg3().setOnClickListener(listener1);
        textimg1.getImg4().setOnClickListener(listener1);

        textimg2.getImg1().setOnClickListener(listener2);
        textimg2.getImg2().setOnClickListener(listener2);
        textimg2.getImg3().setOnClickListener(listener2);
        textimg2.getImg4().setOnClickListener(listener2);
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
