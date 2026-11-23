package org.example.level7_8;

import java.util.Random;

public class RandomElementPicker {
    public int pick(int[] arr) {
        Random random = new Random();
        int result = arr[random.nextInt(arr.length)];
        System.out.println(result);
        return result;
    }
}
