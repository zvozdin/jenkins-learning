package com.java.basic.practice1;

import java.util.HashSet;

class A {

    private int x;

    public A(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "A{" +
                "x=" + x +
                '}';
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        A obj1 = (A) obj;
        return x==obj1.x;
    }
}


public class Part4 {
    private static int a;
    private static int b;

    public static void main(String[] args) {

        HashSet<A> as = new HashSet<>();
        A a1 = new A(2);
        A a3 = new A(3);

        as.add(a1);
        as.add(a3);


        System.out.print(as);
    }




    private static void setLargeAndSmallVar(int val1, int val2) {
        if (val1 > val2) {
            a = val1;
            b = val2;
        } else {
            b = val1;
            a = val2;
        }
    }

    private static int getResult(String[] args) {
        setLargeAndSmallVar(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

        if (b == 0) {
            return 0;
        }

        int r;
        do {
            r = a % b;
            a = b;
            b = r;
        } while (r != 0);

        return a;
    }
}