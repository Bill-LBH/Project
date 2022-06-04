package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.project.TextImageView.TextImageView;

public class SlideActivity extends AppCompatActivity {
    private SlideMenu slideMenu;
    private CardView cv_back;
    private CardView bmi;
    private CardView workout;
    private CardView meals;
    private CardView video;
    //侧滑界面的跳转
    private TextImageView mTIVPerson;
    private TextImageView username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide);
        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);//隐藏状态栏
        cv_back = (CardView) findViewById(R.id.cv_user_head_1);
        meals = (CardView) findViewById(R.id.meals);
        bmi = (CardView) findViewById(R.id.bmi);
        workout = (CardView) findViewById(R.id.workout);
        slideMenu = (SlideMenu)findViewById(R.id.slideMenu);
        video = (CardView) findViewById(R.id.videos);
        username=findViewById((R.id.nickname));
        //点击返回键打开或关闭Menu
        cv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slideMenu.switchMenu();
            }
        });
        mTIVPerson = findViewById(R.id.slide_person);
        username.setText(APP.user.getName());
        //设置监听事件
        setListener();
    }
    private void setListener(){
        OnClick onClick = new OnClick();
        bmi.setOnClickListener(onClick);
        workout.setOnClickListener(onClick);
        meals.setOnClickListener(onClick);
        video.setOnClickListener(onClick);
        mTIVPerson.setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()) {
                case R.id.bmi:
                    intent = new Intent(SlideActivity.this, com.example.project.bmi.class);
                    break;
                case R.id.workout:
                    intent = new Intent(SlideActivity.this, Workout.class);
                    break;
                case R.id.meals:
                    intent = new Intent(SlideActivity.this, DailyMeals.class);
                    break;
                case R.id.videos:
                    intent = new Intent(SlideActivity.this, Report.class);
                    break;
                case R.id.slide_person:
                    intent = new Intent(SlideActivity.this,PersonActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }

}
