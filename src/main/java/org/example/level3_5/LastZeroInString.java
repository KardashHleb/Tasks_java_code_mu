package org.example.level3_5;

public class LastZeroInString {
    public int findLastZero(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '0') {
                System.out.println(i);
                return i;
            }
        }

        System.out.println("Ноль не найден");
        return -1;
    }
}
