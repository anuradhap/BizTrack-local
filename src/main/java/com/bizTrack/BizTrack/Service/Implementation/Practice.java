package com.bizTrack.BizTrack.Service.Implementation;

public class Practice {

    public static void main(String[] args){
        int randomNumber = (int) (Math.random()*9000)+1000;
        String otp = String.valueOf(randomNumber);
        System.out.println("Generated OTP: " +otp);
    }
}
