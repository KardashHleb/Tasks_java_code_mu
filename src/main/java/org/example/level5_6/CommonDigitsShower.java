package org.example.level5_6;

public class CommonDigitsShower {
    public String show(int num1, int num2) {
        String first = toDigits(num1);
        String second = toDigits(num2);
        String result = "";

        for (int i = 0; i < first.length(); i++) {
            char digit = first.charAt(i);
            boolean inSecond = false;
            boolean already = false;

            for (int j = 0; j < second.length(); j++) {
                if (second.charAt(j) == digit) {
                    inSecond = true;
                }
            }

            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == digit) {
                    already = true;
                }
            }

            if (inSecond && !already) {
                result = result + digit;
            }
        }

        System.out.println(result);
        return result;
    }

    private String toDigits(int num) {
        int positive = Math.abs(num);
        if (positive == 0) {
            return "0";
        }

        String digits = "";
        while (positive > 0) {
            digits = (positive % 10) + digits;
            positive = positive / 10;
        }
        return digits;
    }
}
