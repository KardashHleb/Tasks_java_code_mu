package org.example.level3_10;

public class UniqueDigitNumbers {
    public int[] collect(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (hasUniqueDigits(arr[i])) {
                count = count + 1;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (hasUniqueDigits(arr[i])) {
                result[index] = arr[i];
                System.out.println(result[index]);
                index = index + 1;
            }
        }

        return result;
    }

    private boolean hasUniqueDigits(int number) {
        int positiveNumber = Math.abs(number);
        boolean[] seen = new boolean[10];

        if (positiveNumber == 0) {
            return true;
        }

        while (positiveNumber > 0) {
            int digit = positiveNumber % 10;
            if (seen[digit]) {
                return false;
            }
            seen[digit] = true;
            positiveNumber = positiveNumber / 10;
        }

        return true;
    }
}
