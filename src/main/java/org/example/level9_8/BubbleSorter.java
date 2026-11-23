package org.example.level9_8;

public class BubbleSorter {
    public int[] sort(int[] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length - 1; j++) {
                if (values[j] > values[j + 1]) {
                    int temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
        return values;
    }
}
