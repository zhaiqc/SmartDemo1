package com.example.zqc.smartdemo.Service.SocialSecurity;

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

public class SocialSecurityActivity extends AppCompatActivity {
    private Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13;
    private Intent intent;
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn1:
                    intent =new Intent();
                    intent.setClass(SocialSecurityActivity.this,UrbanEnterprisesActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn2:
                    intent =new Intent();
                    intent.setClass(SocialSecurityActivity.this,MaternityInsuranceActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn3:
                    intent =new Intent();
                    intent.setClass(SocialSecurityActivity.this,IndustrialAndCommercialInsuranceActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn4:
                    intent =new Intent();
                    intent.setClass(SocialSecurityActivity.this,ChronicActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn5:
                    intent =new Intent();
                    intent.setClass(SocialSecurityActivity.this,MedicalExpenses.class);
                    startActivity(intent);
                    break;
                case R.id.btn6:
                    intent =new Intent();
                    intent.setClass(SocialSecurityActivity.this,HospitalizedActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn7:
                    intent =new Intent();
                    intent.setClass(SocialSecurityActivity.this,SubsidyActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn8:
                    intent =new Intent();
                    intent.setClass(SocialSecurityActivity.this,AllowancesActvity.class);
                    startActivity(intent);
                    break;
                case R.id.btn9:
                    intent =new Intent();
                    intent.setClass(SocialSecurityActivity.this,PaymentActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn10:
                    intent =new Intent();
                    intent.setClass(SocialSecurityActivity.this,MedicalInsurancePaymentActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn11:
                    intent =new Intent();
                    intent.setClass(SocialSecurityActivity.this,ReSubmitActvity.class);
                    startActivity(intent);
                    break;
                case R.id.btn12:
                    intent =new Intent();
                    intent.setClass(SocialSecurityActivity.this,InquireActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn13:
                    intent =new Intent();
                    intent.setClass(SocialSecurityActivity.this,NewCardActivity.class);
                    startActivity(intent);
                    break;
            }
        }
    };
    private Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.social_security_layout);

        inntview();
    }

    private void inntview() {
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button3 = (Button) findViewById(R.id.btn3);
        button4 = (Button) findViewById(R.id.btn4);
        button5 = (Button) findViewById(R.id.btn5);
        button6 = (Button) findViewById(R.id.btn6);
        button7 = (Button) findViewById(R.id.btn7);
        button8 = (Button) findViewById(R.id.btn8);
        button9 = (Button) findViewById(R.id.btn9);
        button10 = (Button) findViewById(R.id.btn10);
        button11 = (Button) findViewById(R.id.btn11);
        button12 = (Button) findViewById(R.id.btn12);
        button13 = (Button) findViewById(R.id.btn13);


        button1.setOnClickListener(listener);
        button2.setOnClickListener(listener);
        button3.setOnClickListener(listener);
        button4.setOnClickListener(listener);
        button5.setOnClickListener(listener);
        button6.setOnClickListener(listener);
        button7.setOnClickListener(listener);
        button8.setOnClickListener(listener);
        button9.setOnClickListener(listener);
        button10.setOnClickListener(listener);
        button11.setOnClickListener(listener);
        button12.setOnClickListener(listener);
        button13.setOnClickListener(listener);
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
