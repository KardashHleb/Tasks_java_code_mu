package org.example.level5_7;

public class FirstTwoDigitsSumFive {
    public int[] print() {
        int count = 0;

        for (int number = 10; number <= 1000; number++) {
            if (firstTwoSum(number) == 5) {
                count = count + 1;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int number = 10; number <= 1000; number++) {
            if (firstTwoSum(number) == 5) {
                result[index] = number;
                System.out.println(result[index]);
                index = index + 1;
            }
        }

        return result;
    }

    private int firstTwoSum(int number) {
        int reduced = number;
        while (reduced >= 100) {
            reduced = reduced / 10;
        }
        int first = reduced / 10;
        int second = reduced % 10;
        return first + second;
    }
}
