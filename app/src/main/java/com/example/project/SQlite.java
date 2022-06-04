package com.example.project;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class SQlite extends SQLiteOpenHelper {
    private SQLiteDatabase db;

    public SQlite(Context context){
        super(context,"db_test",null,1);
        db = getReadableDatabase();
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS user(" +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "name TEXT," +
                "password TEXT," +
                "birthday TEXT," +
                "gender TEXT," +
                "phonenumber TEXT)");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS user");
        onCreate(db);
    }
    public void add(String name,String password,String birthday,String gender,String phonenumber ){
        db.execSQL("INSERT INTO user(name,password,birthday,gender,phonenumber)VALUES(?,?,?,?,?)",new Object[]{name,password,birthday,gender,phonenumber});
    }
    public ArrayList<User> getAllDATA(){
        ArrayList<User> list = new ArrayList<User>();
        Cursor cursor = db.query("user",null,null,null,null,null,"name DESC");
        while(cursor.moveToNext()){
            @SuppressLint("Range") String name = cursor.getString(cursor.getColumnIndex("name"));
            @SuppressLint("Range") String password = cursor.getString(cursor.getColumnIndex("password"));
            @SuppressLint("Range") String birthday = cursor.getString(cursor.getColumnIndex("birthday"));
            @SuppressLint("Range") String gender = cursor.getString(cursor.getColumnIndex("gender"));
            @SuppressLint("Range") String phonenumber = cursor.getString(cursor.getColumnIndex("phonenumber"));
            list.add(new User(name,password,birthday,gender,phonenumber));
        }
        return list;
    }
}
