package com.java.basic.practice1;

public class Part7 {

    private static String arrow = " ==> ";

    public static void main(String[] args) {
        System.out.println("A" + arrow + str2int("A") + arrow + int2str(1));
        System.out.println("B" + arrow + str2int("B") + arrow + int2str(2));
        System.out.println("Z" + arrow + str2int("Z") + arrow + int2str(26));
        System.out.println("AA" + arrow + str2int("AA") + arrow + int2str(27));
        System.out.println("AZ" + arrow + str2int("AZ") + arrow + int2str(52));
        System.out.println("BA" + arrow + str2int("BA") + arrow + int2str(53));
        System.out.println("ZZ" + arrow + str2int("ZZ") + arrow + int2str(702));
        System.out.println("AAA" + arrow + str2int("AAA") + arrow + int2str(703));
    }

    public static int str2int(String number) {
        char[] chars = number.toUpperCase().toCharArray();
        int result = 0;
        String base = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int i;
        int j;

        for (i = 0, j = number.length() - 1; i < number.length(); i += 1, j -= 1) {
            result += Math.pow(base.length(), j) * (base.indexOf(chars[i]) + 1);
        }

        return result;
    }

    public static String int2str(int number) {
        StringBuilder columnName = new StringBuilder();
        while (number > 0) {
            int rem = number % 26;
            if (rem == 0) {
                columnName.append("Z");
                number = (number / 26) - 1;
            } else {
                columnName.append((char) ((rem - 1) + 'A'));
                number = number / 26;
            }
        }

        return String.valueOf(columnName.reverse());
    }

    public static String rightColumn(String number) {
        int integerColumn = str2int(number);
        return int2str(++integerColumn);
    }
}