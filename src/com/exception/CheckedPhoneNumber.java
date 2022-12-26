package com.exception;

public class CheckedPhoneNumber {
    static void checkMobile(String num){
       if(num.length()!=10){
            throw new RuntimeException("mobile number is not correct");
        } else {
            System.out.println("mobile number is correct");
        }
    }

    public static void main(String[] args) {

        checkMobile("9782260961");
    }
}
