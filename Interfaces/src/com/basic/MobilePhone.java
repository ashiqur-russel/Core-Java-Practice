package com.basic;

public class MobilePhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;
    private boolean isOn= false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn=true;
        System.out.println("Mobile Phone powered up");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn){
            System.out.println("Now ringing"+ phoneNumber+" on Mobile");
        }
    }

    @Override
    public void answer() {

        if(isRinging){
            System.out.println("Answering the mobile phone");
            isRinging= false;
        }

    }

    @Override
    public boolean callPhone(int phoneNUmber) {
        if(phoneNUmber==myNumber && isOn){
            isRinging=true;
            System.out.println("Melody Ring");
        }else
        {
            isRinging=false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
