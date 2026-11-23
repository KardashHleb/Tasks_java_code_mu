package org.example.level5_8;

public class PairsMerger {
    public int[] merge(int[] arr) {
        int[] result = new int[arr.length / 2];
        int index = 0;

        for (int i = 0; i < arr.length - 1; i = i + 2) {
            int second = Math.abs(arr[i + 1]);
            int multiplier = 1;

            if (second == 0) {
                multiplier = 10;
            } else {
                int temp = second;
                while (temp > 0) {
                    multiplier = multiplier * 10;
                    temp = temp / 10;
                }
            }

            result[index] = arr[i] * multiplier + arr[i + 1];
            System.out.println(result[index]);
            index = index + 1;
        }

        return result;
    }
}
