package org.example.level6_7;

public class TenNumbersAverage {
    public double average(int[] numbers) {
        System.out.println("Введите десять чисел");
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            sum = sum + numbers[i];
        }

        double result = (double) sum / numbers.length;
        System.out.println(result);
        return result;
    }
}
