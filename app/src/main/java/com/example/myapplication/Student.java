package com.example.myapplication;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Student {
//Serializable: quá trình chuyển đổi đối tượng Java thành dl có thể truyền hoặc lưu và tệp
    private String Name;

    private String PhoneNum;
    private String Address;
    private String Gender;

    public int getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(int hinhanh) {
        this.hinhanh = hinhanh;
    }

    int hinhanh;
    @NonNull
    @Override
    public String toString() {
        String s = Name +" - "+Gender+" - "+PhoneNum+" - "+Address;
        return s;
    }


    public Student(){}
    public Student(String name, String phoneNum, String gender, String address, int hinhanh1) {
        Name = name;
        PhoneNum = phoneNum;
        Gender = gender;
        Address = address;
        hinhanh = hinhanh1;
    }




    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhoneNum() {
        return PhoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        PhoneNum = phoneNum;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getHobby() {
        return Hobby;
    }

    public void setHobby(String hobby) {
        Hobby = hobby;
    }

    private String Hobby;

}
