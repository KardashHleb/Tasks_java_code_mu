package org.example.level7_7;

public class FrequentDuplicatesRemover {
    public int[] remove(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int times = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    times = times + 1;
                }
            }
            if (times <= 3) {
                count = count + 1;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            int times = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    times = times + 1;
                }
            }
            if (times <= 3) {
                result[index] = arr[i];
                System.out.println(result[index]);
                index = index + 1;
            }
        }

        return result;
    }
}
