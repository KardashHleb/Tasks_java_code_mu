package org.example.level1_7;

public class NumberStringsSummer {
    public int sumNumberStrings(String str1, String str2, String str3) {
        int number1 = Integer.parseInt(str1);
        int number2 = Integer.parseInt(str2);
        int number3 = Integer.parseInt(str3);
        int sum = number1 + number2 + number3;
        System.out.println(sum);
        return sum;
    }
}
