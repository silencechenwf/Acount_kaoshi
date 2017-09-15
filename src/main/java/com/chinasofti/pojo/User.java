package com.chinasofti.pojo;

/**
 * Created by Administrator on 2017/7/21.
 */
public class User {
   private String userName;
    private String passWord;
    private String sex;
    public User() {
    }

    public User(String userName, String passWord, String sex) {
        this.userName = userName;
        this.passWord = passWord;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
