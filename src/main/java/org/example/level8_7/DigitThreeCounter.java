package org.example.level8_7;

public class DigitThreeCounter {
    public int count(int[] values) {
        int result = 0;

        for (int i = 0; i < values.length; i++) {
            int value = values[i];
            if (value < 0) {
                value = -value;
            }
            if (value == 0) {
                continue;
            }
            while (value > 0) {
                if (value % 10 == 3) {
                    result = result + 1;
                }
                value = value / 10;
            }
        }

        System.out.println(result);
        return result;
    }
}
