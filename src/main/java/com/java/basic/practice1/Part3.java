package com.java.basic.practice1;

public class Part3 {

    public static void main(String[] args) {
        System.out.print(getResult(args));
    }

    public static String getResult(String[] args) {
        StringBuilder result = new StringBuilder();
        if (args.length == 0) {
            return "";
        }

        for (String element : args) {
            result = result.append(element);
            result = result.append(" ");
        }

        return result.substring(0, result.length() - 1);
    }
}