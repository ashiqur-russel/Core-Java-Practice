package com.basic;

public class DeskPhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing"+ phoneNumber+" on deskphone");
    }

    @Override
    public void answer() {

        if(isRinging){
            System.out.println("Answering the Desk phone");
            isRinging= false;
        }

    }

    @Override
    public boolean callPhone(int phoneNUmber) {
        if(phoneNUmber==myNumber){
            isRinging=true;
            System.out.println("Ring Ring");
        }else
        {
            isRinging=false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
