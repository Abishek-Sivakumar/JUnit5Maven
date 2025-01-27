package com.abishek.learning;

public class Calculator {
    public int add(int a,int b){
        int sum = a+b;
        if(sum<0){
            throw new IllegalArgumentException("sum cannot be negative");
        }
        else{
            return 5;
        }
    }

}
