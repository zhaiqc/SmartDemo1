package com.example.zqc.smartdemo.Service.FertilityAdoption;

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
 * Created by zqc on 2017/4/14.
 */

public class FertilityAdoptionActivity extends AppCompatActivity {
    private Button btnInsured;
    private Intent intent;
    private View.OnClickListener listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            intent =new Intent();
            intent.setClass(FertilityAdoptionActivity.this,InsuredActivity.class);
            startActivity(intent);
        }
    };
    private Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.birth_layout);
        inntView();

    }
    private void inntView(){
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        btnInsured= (Button) findViewById(R.id.btn_insured);
        btnInsured.setOnClickListener(listener);
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
