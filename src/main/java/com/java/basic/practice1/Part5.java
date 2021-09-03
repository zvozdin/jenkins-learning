package com.java.basic.practice1;

public class Part5 {

    public static void main(String[] args) {
        System.out.print(getResult(args));
    }

    public static int getResult(String[] args) {
        Integer n = Integer.valueOf(args[0]);
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}