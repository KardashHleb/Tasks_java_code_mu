package org.example.level3_5;

public class AllPositiveChecker {
    public boolean allPositive(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0) {
                System.out.println("Есть неположительное число");
                return false;
            }
        }

        System.out.println("Все положительные");
        return true;
    }
}
