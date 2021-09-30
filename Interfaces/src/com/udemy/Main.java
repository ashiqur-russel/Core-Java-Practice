package com.udemy;

public class Main {
    public static void main(String[] args) {
        ITelephone myPhone;
        myPhone = new DeskPhone(1234);

        myPhone.powerOn();
        myPhone.callPhone(234);
        myPhone.answer();

    }
}
