package com.example.zqc.smartdemo.Service;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.example.zqc.smartdemo.Service.ConsumerRights.ConsumerRightsActivity;
import com.example.zqc.smartdemo.Service.FertilityAdoption.FertilityAdoptionActivity;
import com.example.zqc.smartdemo.Service.HousingManagement.HousingManagementActivity;
import com.example.zqc.smartdemo.Service.Hygiene.HygieneActivity;
import com.example.zqc.smartdemo.Service.IntegratedOther.IntegratedOtherActivity;
import com.example.zqc.smartdemo.Service.LaborEmployment.LaborEmploymentActivity;
import com.example.zqc.smartdemo.Service.MarriageRegistration.MarriageRegistrationActivity;
import com.example.zqc.smartdemo.Service.OldMan.OldManActivity;
import com.example.zqc.smartdemo.R;
import com.example.zqc.smartdemo.Service.Register.ResgisterActivity;
import com.example.zqc.smartdemo.Service.SocialSecurity.SocialSecurityActivity;
import com.example.zqc.smartdemo.Service.TaxPaid.TaxPaidActivity;
import com.example.zqc.smartdemo.Service.Utilities.UtilitiesActivity;
import com.example.zqc.smartdemo.View.Textimg;
import com.example.zqc.smartdemo.Service.science.ScienceActivity;

/**
 * Created by zqc on 2017/4/15.
 */

public class ServiceActivity extends AppCompatActivity {
    private Textimg textimg1, textimg2, textimg3, textimg4;

    private Intent intent;
    private View.OnClickListener listener1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.img1:
                    intent = new Intent();
                    intent.setClass(ServiceActivity.this, MarriageRegistrationActivity.class);
                    startActivity(intent);
                    break;
                case R.id.img2:
                    intent = new Intent();
                    intent.setClass(ServiceActivity.this, FertilityAdoptionActivity.class);
                    startActivity(intent);
                    break;
                case R.id.img3:
                    intent = new Intent();
                    intent.setClass(ServiceActivity.this, ResgisterActivity.class);
                    startActivity(intent);
                    break;
                case R.id.img4:
                    intent = new Intent();
                    intent.setClass(ServiceActivity.this, ScienceActivity.class);
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
                    intent.setClass(ServiceActivity.this, HygieneActivity.class);
                    startActivity(intent);
                    break;
                case R.id.img2:
                    intent = new Intent();
                    intent.setClass(ServiceActivity.this, UtilitiesActivity.class);
                    startActivity(intent);
                    break;
                case R.id.img3:
                    intent = new Intent();
                    intent.setClass(ServiceActivity.this, HousingManagementActivity.class);
                    startActivity(intent);
                    break;
                case R.id.img4:
                    intent = new Intent();
                    intent.setClass(ServiceActivity.this, LaborEmploymentActivity.class);
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
                    intent.setClass(ServiceActivity.this, SocialSecurityActivity.class);
                    startActivity(intent);
                    break;
                case R.id.img2:
                    intent = new Intent();
                    intent.setClass(ServiceActivity.this, TaxPaidActivity.class);
                    startActivity(intent);
                    break;
                case R.id.img3:
                    intent = new Intent();
                    intent.setClass(ServiceActivity.this, ConsumerRightsActivity.class);
                    startActivity(intent);
                    break;
                case R.id.img4:
                    intent = new Intent();
                    intent.setClass(ServiceActivity.this, OldManActivity.class);
                    startActivity(intent);
                    break;
            }

        }
    };
    private View.OnClickListener listener4 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            intent = new Intent();
            intent.setClass(ServiceActivity.this, IntegratedOtherActivity.class);
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.service_layout);
        inntView();
    }

    private void inntView() {

        textimg1 = (Textimg) findViewById(R.id.textimg1);
        textimg2 = (Textimg) findViewById(R.id.textimg2);
        textimg3 = (Textimg) findViewById(R.id.textimg3);
        textimg4 = (Textimg) findViewById(R.id.textimg4);

        textimg1.getImg1().setImageResource(R.drawable.hunyindengji);
        textimg1.getImg2().setImageResource(R.drawable.shengyushouyang);
        textimg1.getImg3().setImageResource(R.drawable.hujiguanli);
        textimg1.getImg4().setImageResource(R.drawable.kejijiaoyu);

        textimg1.getTextView1().setText("婚姻登记");
        textimg1.getTextView2().setText("生育收养");
        textimg1.getTextView3().setText("户籍管理");
        textimg1.getTextView4().setText("科技教育");

        textimg2.getImg1().setImageResource(R.drawable.weishengbaojian);
        textimg2.getImg2().setImageResource(R.drawable.gonggongshiye);
        textimg2.getImg3().setImageResource(R.drawable.zhufangguanli);
        textimg2.getImg4().setImageResource(R.drawable.laodongjiuye);

        textimg2.getTextView1().setText("卫生保健");
        textimg2.getTextView2().setText("公共事业");
        textimg2.getTextView3().setText("住房管理");
        textimg2.getTextView4().setText("劳动就业");


        textimg3.getImg1().setImageResource(R.drawable.shehuibaozhang);
        textimg3.getImg2().setImageResource(R.drawable.shuifeijiaona);
        textimg3.getImg3().setImageResource(R.drawable.weishengbaojian);
        textimg3.getImg4().setImageResource(R.drawable.jinglaoyanglao);

        textimg3.getTextView1().setText("社会保障");
        textimg3.getTextView2().setText("税务缴纳");
        textimg3.getTextView3().setText("消费维权");
        textimg3.getTextView4().setText("敬老养老");


        textimg4.getImg1().setImageResource(R.drawable.qitashixiang);
        textimg4.getTextView1().setText("其他事项");

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
