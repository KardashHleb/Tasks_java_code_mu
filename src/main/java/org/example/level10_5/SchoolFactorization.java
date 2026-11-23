package org.example.level10_5;

public class SchoolFactorization {
    public int[] factor(int number) {
        System.out.println("Введите число");
        System.out.println(number);

        int value = number;
        if (value < 0) {
            value = -value;
        }
        int[] found = new int[32];
        int count = 0;
        int divisor = 2;

        while (value > 1) {
            if (value % divisor == 0) {
                System.out.println(value + " | " + divisor);
                found[count] = divisor;
                count = count + 1;
                value = value / divisor;
            } else {
                divisor = divisor + 1;
            }
        }
        System.out.println(value + " |");

        int[] result = new int[count];
        String line = number + " = ";
        for (int i = 0; i < count; i++) {
            result[i] = found[i];
            if (i > 0) {
                line = line + " * ";
            }
            line = line + result[i];
        }
        System.out.println(line);
        return result;
    }
}
