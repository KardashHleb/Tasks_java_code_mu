package org.example.level7_8;

import java.util.Random;

public class NonRepeatingElementPicker {
    private boolean hasLast = false;
    private int last = 0;

    public int pick(int[] arr) {
        boolean hasOther = false;
        for (int i = 0; i < arr.length; i++) {
            if (!hasLast || arr[i] != last) {
                hasOther = true;
            }
        }

        Random random = new Random();
        int index = random.nextInt(arr.length);
        while (hasLast && hasOther && arr[index] == last) {
            index = random.nextInt(arr.length);
        }

        last = arr[index];
        hasLast = true;
        System.out.println(last);
        return last;
    }
}
