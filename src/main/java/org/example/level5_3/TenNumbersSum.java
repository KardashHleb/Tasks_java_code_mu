package org.example.level5_3;

public class TenNumbersSum {
    public int sum(int[] numbers) {
        int result = 0;

        System.out.println("Введите 10 чисел");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            result = result + numbers[i];
        }

        System.out.println(result);
        return result;
    }
}
