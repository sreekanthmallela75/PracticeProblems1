package com.exception;

import java.io.IOException;

public class ThrowsDemo {
    static void method()throws ArithmeticException, IOException{
        int a =25/1;
        System.out.println(a);
        throw  new IOException("hello");
    }

    public static void main(String[] args) throws ArithmeticException {
        try {
            method();
        } catch (ArithmeticException e){
            System.out.println("hii");
        }
        catch (IOException e){
            System.out.println("Sreekanth");
        }

    }
}
