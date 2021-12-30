package com.basic;

public interface ITelephone {
    public void powerOn();
    public void dial(int phoneNumber);
    public void answer();

    public boolean callPhone(int phoneNUmber);
    public boolean isRinging();
}
