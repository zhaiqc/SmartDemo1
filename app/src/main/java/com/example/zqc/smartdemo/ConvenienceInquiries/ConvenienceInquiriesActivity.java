package com.example.zqc.smartdemo.ConvenienceInquiries;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.zqc.smartdemo.ConvenienceInquiries.Bill.BillActivity;
import com.example.zqc.smartdemo.ConvenienceInquiries.Bus.BusActivity;
import com.example.zqc.smartdemo.ConvenienceInquiries.Driver.DriverActivity;
import com.example.zqc.smartdemo.ConvenienceInquiries.HousingFund.HousingFundActivity;
import com.example.zqc.smartdemo.ConvenienceInquiries.IDCard.IDCardActivity;
import com.example.zqc.smartdemo.ConvenienceInquiries.Illegal.IllegalActvity;
import com.example.zqc.smartdemo.ConvenienceInquiries.Name.NameActvity;
import com.example.zqc.smartdemo.ConvenienceInquiries.SocialSecurity.SocialSecurityActivity;
import com.example.zqc.smartdemo.ConvenienceInquiries.Taxation.TaxationActvity;
import com.example.zqc.smartdemo.ConvenienceInquiries.VehicleInformation.VehicleInformationActivity;
import com.example.zqc.smartdemo.ConvenienceInquiries.library.libraryActivity;
import com.example.zqc.smartdemo.R;
import com.example.zqc.smartdemo.View.Textimg;

/**
 * Created by zqc on 2017/4/18.
 */

public class ConvenienceInquiriesActivity extends AppCompatActivity {
    private Textimg textimg1, textimg2, textimg3, textimg4;
    private Intent intent;
    private Toast toast;
    private View.OnClickListener listener1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.img1:
                    intent = new Intent();
                    intent.setClass(ConvenienceInquiriesActivity.this, SocialSecurityActivity.class);
                    startActivity(intent);
                    break;
                case R.id.img2:
                    intent = new Intent();
                    intent.setClass(ConvenienceInquiriesActivity.this, HousingFundActivity.class);
                    startActivity(intent);
                    break;
                case R.id.img3:
                    intent = new Intent();
                    intent.setClass(ConvenienceInquiriesActivity.this,
                            TaxationActvity.class);
                    startActivity(intent);
                    break;
                case R.id.img4:
                    intent = new Intent();
                    intent.setClass(ConvenienceInquiriesActivity.this,
                            IllegalActvity.class);
                    startActivity(intent);
                    break;
            }
        }
    };
    private View.OnClickListener listener2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.img1:
                    intent = new Intent();
                    intent.setClass(ConvenienceInquiriesActivity.this, VehicleInformationActivity.class);
                    startActivity(intent);
                    break;
                case R.id.img2:
                    intent = new Intent();
                    intent.setClass(ConvenienceInquiriesActivity.this, IDCardActivity.class);
                    startActivity(intent);
                    break;
                case R.id.img3:
                    intent = new Intent();
                    intent.setClass(ConvenienceInquiriesActivity.this,
                            DriverActivity.class);
                    startActivity(intent);
                    break;
                case R.id.img4:
                    intent = new Intent();
                    intent.setClass(ConvenienceInquiriesActivity.this,
                            NameActvity.class);
                    startActivity(intent);
                    break;
            }

        }
    };
    private View.OnClickListener listener3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.img1:
                    intent = new Intent();
                    intent.setClass(ConvenienceInquiriesActivity.this, BusActivity.class);
                    startActivity(intent);
                    break;
                case R.id.img2:
                    intent = new Intent();
                    intent.setClass(ConvenienceInquiriesActivity.this,libraryActivity.class);
                    startActivity(intent);
                    break;
                case R.id.img3:
                    Toast.makeText(getApplicationContext(), "该功能暂未开放",
                            Toast.LENGTH_SHORT).show();
//                    toast.makeText()
//                    intent = new Intent();
//                    intent.setClass(ConvenienceInquiriesActivity.this,
//                            BillActivity.class);
//                    startActivity(intent);
                    break;
                case R.id.img4:
                    Toast.makeText(getApplicationContext(), "该功能暂未开放",
                            Toast.LENGTH_SHORT).show();
                    break;
            }

        }
    };
    private View.OnClickListener listener4 =new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(), "该功能暂未开放",
                    Toast.LENGTH_SHORT).show();
        }
    };


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.convenience_inquiries_layout);
        inntview();
    }

    private void inntview() {
        textimg1 = (Textimg) findViewById(R.id.textimg1);
        textimg2 = (Textimg) findViewById(R.id.textimg2);
        textimg3 = (Textimg) findViewById(R.id.textimg3);
        textimg4 = (Textimg) findViewById(R.id.textimg4);

        textimg1.getImg1().setImageResource(R.drawable.shebaochaxun);
        textimg1.getTextView1().setText("社保查询");
        textimg1.getImg2().setImageResource(R.drawable.gongjijin);
        textimg1.getTextView2().setText("住房公积金查询");
        textimg1.getImg3().setImageResource(R.drawable.sheshuichaxun);
        textimg1.getTextView3().setText("涉税查询");
        textimg1.getImg4().setImageResource(R.drawable.jiaotongchaxun);
        textimg1.getTextView4().setText("交通违法查询");


        textimg2.getImg1().setImageResource(R.drawable.find_gongjiao);
        textimg2.getImg2().setImageResource(R.drawable.shenfenzhengchaxun);
        textimg2.getImg3().setImageResource(R.drawable.jiashirenchaxun);
        textimg2.getImg4().setImageResource(R.drawable.chongmingchaxun);

        textimg2.getTextView1().setText("车辆讯息查询");
        textimg2.getTextView2().setText("身份证查询");
        textimg2.getTextView3().setText("驾驶人信息查询");
        textimg2.getTextView4().setText("公民姓名重名查询");


        textimg3.getImg1().setImageResource(R.drawable.find_gongjiao);
        textimg3.getImg2().setImageResource(R.drawable.tushuguan);
        textimg3.getImg3().setImageResource(R.drawable.huafeichongzhi);
        textimg3.getImg4().setImageResource(R.drawable.yidongyewu);

        textimg3.getTextView1().setText("公交查询");
        textimg3.getTextView2().setText("图书馆查询");
        textimg3.getTextView3().setText("移动话费充值");
        textimg3.getTextView4().setText("移动业务办理");

        textimg4.getImg1().setImageResource(R.drawable.kuandaibanli);
        textimg4.getTextView1().setText("移动宽带办理");


        textimg1.getImg1().setOnClickListener(listener1);
        textimg1.getImg2().setOnClickListener(listener1);
        textimg1.getImg3().setOnClickListener(listener1);
        textimg1.getImg4().setOnClickListener(listener1);

        textimg2.getImg1().setOnClickListener(listener2);
        textimg2.getImg2().setOnClickListener(listener2);
        textimg2.getImg3().setOnClickListener(listener2);
        textimg2.getImg4().setOnClickListener(listener2);
        textimg3.getImg1().setOnClickListener(listener3);
        textimg3.getImg2().setOnClickListener(listener3);
        textimg3.getImg3().setOnClickListener(listener3);
        textimg3.getImg4().setOnClickListener(listener3);
        textimg4.getImg1().setOnClickListener(listener4);

    }
}
