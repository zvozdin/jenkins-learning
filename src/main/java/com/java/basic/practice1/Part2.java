package com.java.basic.practice1;

public class Part2 {

    public static void main(String[] args) {
        System.out.print(getResult(args));
    }

    public static int getResult(String[] args) {
        int result = 0;
        for (String element : args) {
            if (Integer.valueOf(element) instanceof Integer) {
                result += Integer.parseInt(element);
            } else {
                throw new IllegalArgumentException();
            }
        }
        return result;
    }
}