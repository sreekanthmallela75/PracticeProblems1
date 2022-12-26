package com.exception;

public class CheckedPhoneNumber1 {
    public static void checkMobile(String num) {
        if (num.length() == 10 ) {
            if (num.charAt(0) == 9 || num.charAt(0) == 8 || num.charAt(0) == 7 || num.charAt(0) == 6) {
                System.out.println("The Mobile Number is  Correct");
            }else throw new RuntimeException("The number does not start with correct pattern");
        } else{
                throw new RuntimeException("The Mobile Number Not is Correct");


            }
    }

        public static void main (String[]args){

            checkMobile("5782260961");
        }


}
