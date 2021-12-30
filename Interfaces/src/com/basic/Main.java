package com.basic;

public class Main {
    public static void main(String[] args) {
        MobilePhone myPhone = new MobilePhone(123456);
        myPhone.powerOn();
        myPhone.callPhone(123456);
        myPhone.answer();
    }
}
