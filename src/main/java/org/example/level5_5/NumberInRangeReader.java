package org.example.level5_5;

public class NumberInRangeReader {
    public int read(int[] attempts) {
        for (int i = 0; i < attempts.length; i++) {
            System.out.println("Введите целое число от 1 до 10");
            System.out.println(attempts[i]);
            if (attempts[i] >= 1 && attempts[i] <= 10) {
                System.out.println(attempts[i]);
                return attempts[i];
            }
            System.out.println("Введите число еще раз");
        }

        System.out.println("Число из промежутка не введено");
        return -1;
    }
}
