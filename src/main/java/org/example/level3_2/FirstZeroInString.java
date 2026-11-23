package org.example.level3_2;

public class FirstZeroInString {
    public int findFirstZero(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                System.out.println(i);
                return i;
            }
        }

        System.out.println("Ноль не найден");
        return -1;
    }
}
