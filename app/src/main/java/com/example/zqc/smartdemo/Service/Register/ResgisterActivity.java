package com.example.zqc.smartdemo.Service.Register;

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

public class ResgisterActivity extends AppCompatActivity {
    private Button button1, button2, button3, button4, button5, button6, button7;
    private Intent intent;
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn1:
                    intent = new Intent();
                    intent.setClass(ResgisterActivity.this,ImmigrationActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn2:
                    intent = new Intent();
                    intent.setClass(ResgisterActivity.this,CheckInActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn3:
                    intent = new Intent();
                    intent.setClass(ResgisterActivity.this,ResidencePermit.class);
                    startActivity(intent);
                    break;
                case R.id.btn4:
                    intent = new Intent();
                    intent.setClass(ResgisterActivity.this,DeathAcyivity.class);
                    startActivity(intent);

                    break;
                case R.id.btn5:
                    intent = new Intent();
                    intent.setClass(ResgisterActivity.this,HouseholdRegister.class);
                    startActivity(intent);
                    break;
                case R.id.btn6:
                    intent = new Intent();
                    intent.setClass(ResgisterActivity.this,IdentityCardActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn7:
                    intent = new Intent();
                    intent.setClass(ResgisterActivity.this,EmigrationActivity.class);
                    startActivity(intent);
                    break;
            }


        }
    };
    private Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_layout);
        inntView();
    }

    private void inntView() {
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button3 = (Button) findViewById(R.id.btn3);
        button4 = (Button) findViewById(R.id.btn4);
        button5 = (Button) findViewById(R.id.btn5);
        button6 = (Button) findViewById(R.id.btn6);
        button7 = (Button) findViewById(R.id.btn7);


        button1.setOnClickListener(listener);
        button2.setOnClickListener(listener);
        button3.setOnClickListener(listener);
        button4.setOnClickListener(listener);
        button5.setOnClickListener(listener);
        button6.setOnClickListener(listener);
        button7.setOnClickListener(listener);
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
