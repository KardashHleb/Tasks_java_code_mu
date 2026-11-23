package org.example.level6_3;

public class RangeArrayFiller {
    public int[] fill(int first, int second) {
        System.out.println("Введите два целых числа");
        System.out.println(first);
        System.out.println(second);

        int min = first;
        int max = second;
        if (second < first) {
            min = second;
            max = first;
        }

        int[] result = new int[max - min + 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = min + i;
            System.out.println(result[i]);
        }

        return result;
    }
}
