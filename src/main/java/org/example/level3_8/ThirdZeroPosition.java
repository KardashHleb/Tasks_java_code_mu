package org.example.level3_8;

public class ThirdZeroPosition {
    public int findThirdZero(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                count = count + 1;
                if (count == 3) {
                    System.out.println(i);
                    return i;
                }
            }
        }

        System.out.println("Третий ноль не найден");
        return -1;
    }
}
