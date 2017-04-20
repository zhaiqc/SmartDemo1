package com.example.zqc.smartdemo.Service.MarriageRegistration;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.zqc.smartdemo.R;


/**
 * Created by zqc on 2017/4/14.
 */

public class DivorceActivity extends AppCompatActivity {
    private View include;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.divorce_layout);
        include =findViewById(R.id.include);
    }
}
