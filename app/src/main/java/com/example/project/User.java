package com.example.project;

public class User {
    private  int id;
    private  String name;
    private  String password;
    private  String birthday;
    private  String gender;
    private  String phonenumber;
    public User(String name,String password,String birthday, String gender, String phonenumber){
        super();
        this.name = name;
        this.password = password;
        this.birthday = birthday;
        this.gender =gender;
        this.phonenumber=phonenumber;
    }
    public  int getId() {return  id;}
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getPhonenumber() {
        return phonenumber;
    }
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    @Override
    public String toString() {
        return "User{id ="+ id + ", name = "+ name +",password ="+password +",Birthday = "+ birthday+",Gender ="+gender+",Phonenumber ="+phonenumber+"}";
    }
}