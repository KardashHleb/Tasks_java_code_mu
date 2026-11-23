package org.example.level5_9;

public class DigitsDoubler {
    public long doubleDigits(int num) {
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

        String doubled = "";
        for (int i = 0; i < digits.length(); i++) {
            doubled = doubled + digits.charAt(i);
            doubled = doubled + digits.charAt(i);
        }

        long result = 0;
        for (int i = 0; i < doubled.length(); i++) {
            result = result * 10 + (doubled.charAt(i) - '0');
        }

        System.out.println(result);
        return result;
    }
}
