package org.example.level7_2;

public class ZeroDigitsRemover {
    public int remove(int num) {
        int positive = Math.abs(num);
        String digits = "";

        if (positive == 0) {
            System.out.println(0);
            return 0;
        }

        int temp = positive;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit != 0) {
                digits = digit + digits;
            }
            temp = temp / 10;
        }

        if (digits.length() == 0) {
            System.out.println(0);
            return 0;
        }

        int result = 0;
        for (int i = 0; i < digits.length(); i++) {
            result = result * 10 + (digits.charAt(i) - '0');
        }

        System.out.println(result);
        return result;
    }
}
