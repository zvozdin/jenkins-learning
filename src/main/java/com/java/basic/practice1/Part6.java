package com.java.basic.practice1;

public class Part6 {

    public static void main(String[] args) {
        int[] primeNumbers = new int[Integer.parseInt(args[0])];
        fillArrayByPrimeNumbers(primeNumbers);
        print(primeNumbers);
    }

    private static void print(int[] array) {
        StringBuilder result = new StringBuilder();
        if (array.length == 0) {
            System.out.print("");
            return;
        }
        for (int element : array) {
            result = result.append(element);
            result = result.append(" ");
        }
        System.out.print(result.substring(0, result.length() - 1));
    }

    private static void fillArrayByPrimeNumbers(int[] primeNumbers) {
        int primeNumber = 2;
        int i = 0;
        while (i < primeNumbers.length) {
            if (isSimple(primeNumber)) {
                primeNumbers[i] = primeNumber;
                i++;
            }
            primeNumber++;
        }
    }

    private static boolean isSimple(int k) {
        if (k % 2 == 0 && k != 2) {
            return false;
        }
        int maxDiv = (int) Math.sqrt(k);
        for (int i = 3; i <= maxDiv; i += 2) {
            if (k % i == 0) {
                return false;
            }
        }
        return true;
    }
}