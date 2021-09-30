package com.udemy;

public class Main {
    public static void main(String[] args) {
        ITelephone myPhone;
        myPhone = new DeskPhone(1234);

        myPhone.powerOn();
        myPhone.callPhone(234);
        myPhone.answer();

        myPhone = new MobilePhone(24565);
        myPhone.powerOn();
        myPhone.callPhone(24565);
        myPhone.answer();

    }
}
