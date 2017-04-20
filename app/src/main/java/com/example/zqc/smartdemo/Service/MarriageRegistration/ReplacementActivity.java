package com.example.zqc.smartdemo.Service.MarriageRegistration;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.example.zqc.smartdemo.R;


/**
 * Created by zqc on 2017/4/14.
 */

public class ReplacementActivity extends AppCompatActivity {
    private ImageView imgMarry1, imgMarry2, imgMarry3, imgMarry4;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.replacement_layout);
        inntview();
    }
    private void inntview() {
        imgMarry1 = (ImageView) findViewById(R.id.img_marry1);
        imgMarry2= (ImageView) findViewById(R.id.img_marry2);
        imgMarry3= (ImageView) findViewById(R.id.img_marry3);
        imgMarry4= (ImageView) findViewById(R.id.img_marry4);
        imgMarry1.setImageResource(R.drawable.replacement1);
        imgMarry2.setImageResource(R.drawable.replacement2);
        imgMarry3.setImageResource(R.drawable.replacement3);
        imgMarry4.setImageResource(R.drawable.replacement4);

    }
}
