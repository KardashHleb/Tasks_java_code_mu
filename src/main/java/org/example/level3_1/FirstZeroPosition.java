package org.example.level3_1;

public class FirstZeroPosition {
    public int findFirstZero(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.out.println(i);
                return i;
            }
        }

        System.out.println("Ноль не найден");
        return -1;
    }
}
