package com.example.zqc.smartdemo.Service.MarriageRegistration;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.zqc.smartdemo.R;


/**
 * Created by zqc on 2017/4/14.
 */

public class MarriageRegistrationActivity extends AppCompatActivity {
    private Button btnReplacement,btnDivorce,btnMarry;
    private TextView tvPhone;
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_replacement:
                    Intent intent1 = new Intent();
                    intent1.setClass(MarriageRegistrationActivity.this,ReplacementActivity.class);
                    startActivity(intent1);
                    break;
                case R.id.btn_divorce:
                    Intent intent2 =new Intent();
                    intent2.setClass(MarriageRegistrationActivity.this,DivorceActivity.class);
                    startActivity(intent2);
                    break;
                case R.id.btn_marry:
                    Intent intent3=new Intent();
                    intent3.setClass(MarriageRegistrationActivity.this,MarryActivity.class);
                    Toast.makeText(getApplicationContext(),"111111",Toast.LENGTH_LONG).show();
                    startActivity(intent3);

                    break;
                case R.id.tv_phone:
             break;

            }

        }
    };
    private Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.marriage_registration_layout);
        inntview();
    }
    private void  inntview (){
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        btnReplacement = (Button) findViewById(R.id.btn_replacement);
        btnDivorce = (Button) findViewById(R.id.btn_divorce);
        btnMarry= (Button) findViewById(R.id.btn_marry);
        View include = (View) findViewById(R.id.include);
        tvPhone = (TextView) include.findViewById(R.id.tv_phone);
        tvPhone.setClickable(true);
        tvPhone.setOnClickListener(listener);
        btnReplacement.setOnClickListener(listener);
        btnDivorce.setOnClickListener(listener);
        btnMarry.setOnClickListener(listener);
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
