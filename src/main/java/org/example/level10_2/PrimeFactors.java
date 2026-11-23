package org.example.level10_2;

public class PrimeFactors {
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
        while (value > 1 && divisor * divisor <= value) {
            while (value % divisor == 0) {
                found[count] = divisor;
                count = count + 1;
                value = value / divisor;
            }
            divisor = divisor + 1;
        }
        if (value > 1) {
            found[count] = value;
            count = count + 1;
        }

        int[] result = new int[count];
        String line = "";
        for (int i = 0; i < count; i++) {
            result[i] = found[i];
            if (i > 0) {
                line = line + " * ";
            }
            line = line + result[i];
        }
        if (count == 0) {
            line = "" + number;
        }
        System.out.println(line);
        return result;
    }
}
