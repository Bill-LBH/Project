package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class PersonActivity extends AppCompatActivity {

    private ImageView mIVBack;
    private TextView tv_into_person_2;
    private TextView tv_into_person_4;
    private TextView tv_into_person_6;
    private TextView tv_into_person_8;
    private TextView tv_into_person_10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);
        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //点击返回按钮，便结束这个画面
        mIVBack = findViewById(R.id.iv_person_back);
        tv_into_person_2 = findViewById(R.id.tv_into_person_2);
        tv_into_person_4 = findViewById(R.id.tv_into_person_4);
        tv_into_person_6 = findViewById(R.id.tv_into_person_6);
        tv_into_person_8 = findViewById(R.id.tv_into_person_8);
        tv_into_person_10 = findViewById(R.id.tv_into_person_10);


        mIVBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        tv_into_person_2.setText(APP.user.getName());
        tv_into_person_4.setText(APP.user.getPassword());
        tv_into_person_6.setText(APP.user.getBirthday());
        tv_into_person_8.setText(APP.user.getGender());
        tv_into_person_10.setText(APP.user.getPhonenumber());
    }
}