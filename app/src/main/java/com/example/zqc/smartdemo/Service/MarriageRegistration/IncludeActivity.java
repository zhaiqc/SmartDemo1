package com.example.zqc.smartdemo.Service.MarriageRegistration;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.zqc.smartdemo.R;


/**
 * Created by zqc on 2017/4/14.
 */

public class IncludeActivity extends AppCompatActivity {
    private TextView tvPhone;
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
//            Toast.makeText(getApplicationContext(), "111111", Toast.LENGTH_LONG).show();
            ActivityCompat.requestPermissions(IncludeActivity.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
            Intent intent = new Intent(Intent.ACTION_CALL);
            Uri data = Uri.parse("tel:" + "0533-3989222");
            intent.setData(data);
            if (ActivityCompat.checkSelfPermission(IncludeActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                return;
            }
            startActivity(intent);

        }


    };


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.include_layout);
        getSupportActionBar().hide();//隐藏掉整个ActionBar，包括下面的Tabs
        inntview();
    }

    private void inntview() {
        tvPhone = (TextView) findViewById(R.id.tv_phone);
        tvPhone.setOnClickListener(listener);

    }
}
