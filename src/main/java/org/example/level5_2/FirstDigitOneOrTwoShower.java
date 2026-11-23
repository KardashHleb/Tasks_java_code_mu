package org.example.level5_2;

public class FirstDigitOneOrTwoShower {
    public int[] print(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int first = Math.abs(arr[i]);
            while (first >= 10) {
                first = first / 10;
            }
            if (first == 1 || first == 2) {
                count = count + 1;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            int first = Math.abs(arr[i]);
            while (first >= 10) {
                first = first / 10;
            }
            if (first == 1 || first == 2) {
                result[index] = arr[i];
                System.out.println(result[index]);
                index = index + 1;
            }
        }

        return result;
    }
}
