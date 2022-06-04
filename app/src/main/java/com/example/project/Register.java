package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.project.util.ToastUtil;

public class Register extends AppCompatActivity {
    private SQlite mSQlite;
    private Button mBtnRegister;
    private Button mBtnLogin;
    private EditText mTUserName;
    private EditText mTPassword;
    private EditText mTBirthday;
    private EditText mTGender;
    private EditText mTPhonenumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().hide();
        mBtnRegister = findViewById(R.id.btn_register1);
        mTUserName = findViewById(R.id.et_3);
        mTPassword = findViewById(R.id.et_4);
        mTBirthday = findViewById(R.id.et_5);
        mTGender = findViewById(R.id.et_6);
        mTPhonenumber =findViewById(R.id.et_7);
        mBtnLogin = findViewById(R.id.btn_login1);
        mBtnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mTUserName.getText().toString().trim();
                String password = mTPassword.getText().toString().trim();
                String birthday = mTBirthday.getText().toString().trim();
                String gender = mTGender.getText().toString().trim();
                String phonenumber = mTPhonenumber.getText().toString().trim();
                if(!TextUtils.isEmpty(name)&&!TextUtils.isEmpty(password)&&!TextUtils.isEmpty(birthday)&&!TextUtils.isEmpty(gender)&&!TextUtils.isEmpty(phonenumber)){
                    mSQlite.add(name,password,birthday,gender,phonenumber);
                    ToastUtil.showMsg(Register.this, "Register successful！");
                }
                else{
                    ToastUtil.showMsg(Register.this, "Register failed！");
                }
            }
        });
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                    intent = new Intent(Register.this, Login.class);
                intent.putExtra("username",mTUserName.getText().toString().trim());
                intent.putExtra("password",mTPassword.getText().toString().trim());
                intent.putExtra("birthday",mTBirthday.getText().toString().trim());
                intent.putExtra("gender",mTGender.getText().toString().trim());
                intent.putExtra("phonenumber",mTPhonenumber.getText().toString().trim());
                    startActivity(intent);
                }
        });
        mSQlite = new SQlite(Register.this);

    }
}