package org.example.level3_10;

public class InnerZeroPositions {
    public void printInnerZeros(long number) {
        String digits = String.valueOf(Math.abs(number));
        int first = -1;
        int last = -1;

        for (int i = 0; i < digits.length(); i++) {
            if (digits.charAt(i) == '0') {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }

        for (int i = 0; i < digits.length(); i++) {
            if (digits.charAt(i) == '0' && i != first && i != last) {
                System.out.println(i);
            }
        }
    }
}
