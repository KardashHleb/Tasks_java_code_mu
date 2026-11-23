package org.example.level7_3;

public class UniqueElements {
    public int[] unique(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean seen = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                    seen = true;
                }
            }
            if (!seen) {
                count = count + 1;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean seen = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                    seen = true;
                }
            }
            if (!seen) {
                result[index] = arr[i];
                System.out.println(result[index]);
                index = index + 1;
            }
        }

        return result;
    }
}
