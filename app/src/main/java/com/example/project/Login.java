package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.project.util.ToastUtil;

import java.util.ArrayList;

public class Login extends AppCompatActivity {
    private Button mBtnLogin;
    private Button mBtnRegister;
    private EditText mTUserName;
    private EditText mTPassword;
    private SQlite mSQlite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        }
        Intent intent =getIntent();
        String birthday =intent.getStringExtra("birthday");
        String gender =intent.getStringExtra("gender");
        String phonenumber=intent.getStringExtra("phonenumber");
        mBtnLogin = findViewById(R.id.btn_login);
        mBtnRegister = findViewById(R.id.btn_register);
        mTUserName = findViewById(R.id.et_1);
        mTPassword = findViewById(R.id.et_2);
        mBtnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                intent = new Intent(Login.this, Register.class);
                startActivity(intent);
            }
        });

        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = mTUserName.getText().toString();
                String password = mTPassword.getText().toString();

                if (!TextUtils.isEmpty(name) && !TextUtils.isEmpty(password)) {
                    ArrayList<User> data = mSQlite.getAllDATA();
                    boolean userdata = false;
                    for (int i = 0; i < data.size(); i++) {
                        User user = data.get(i);   //可存储账号数量
                        if (name.equals(user.getName()) && password.equals(user.getPassword())) {
                            APP.user =  user;
                            userdata = true;
                            break;
                        } else {
                            userdata = false;
                        }
                    }
                    if (userdata) {
                        Toast.makeText(Login.this, "Login successful!", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Login.this, SlideActivity.class);
                        startActivity(intent);
                        finish();
                    } else {
                        Toast.makeText(Login.this, "User name/password is not correct!", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(Login.this, "User name/password can not be empty", Toast.LENGTH_SHORT).show();
                }
            }
        });
        mSQlite = new SQlite(Login.this);
    }

}