package org.example.level9_10;

public class AmicableChecker {
    public boolean check(int first, int second) {
        System.out.println("Введите два числа");
        System.out.println(first);
        System.out.println(second);

        boolean friends = first != second && properSum(first) == second && properSum(second) == first;
        System.out.println(friends);
        return friends;
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
