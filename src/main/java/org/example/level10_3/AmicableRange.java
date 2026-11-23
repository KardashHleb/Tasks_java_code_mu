package org.example.level10_3;

public class AmicableRange {
    public int[][] pairs(int from, int to) {
        if (from > to) {
            int temp = from;
            from = to;
            to = temp;
        }

        int count = 0;
        for (int number = from; number <= to; number++) {
            int pair = properSum(number);
            if (pair > number && pair <= to && properSum(pair) == number) {
                count = count + 1;
            }
        }

        int[][] result = new int[count][2];
        int index = 0;
        for (int number = from; number <= to; number++) {
            int pair = properSum(number);
            if (pair > number && pair <= to && properSum(pair) == number) {
                result[index][0] = number;
                result[index][1] = pair;
                System.out.println(number + " " + pair);
                index = index + 1;
            }
        }
        return result;
    }

    private int properSum(int number) {
        if (number < 0) {
            number = -number;
        }
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
