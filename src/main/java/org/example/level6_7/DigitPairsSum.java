package org.example.level6_7;

public class DigitPairsSum {
    public int sum(int num) {
        int positive = Math.abs(num);
        String digits = "";

        if (positive == 0) {
            digits = "0";
        } else {
            int temp = positive;
            while (temp > 0) {
                digits = (temp % 10) + digits;
                temp = temp / 10;
            }
        }

        int result = 0;
        for (int i = 0; i + 1 < digits.length(); i = i + 2) {
            int pair = (digits.charAt(i) - '0') * 10 + (digits.charAt(i + 1) - '0');
            result = result + pair;
        }

        System.out.println(result);
        return result;
    }
}
