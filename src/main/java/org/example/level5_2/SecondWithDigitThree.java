package org.example.level5_2;

public class SecondWithDigitThree {
    public int find(int[] arr) {
        int found = 0;

        for (int i = 0; i < arr.length; i++) {
            int temp = Math.abs(arr[i]);
            boolean hasThree = false;

            if (temp == 0) {
                hasThree = false;
            }

            while (temp > 0) {
                if (temp % 10 == 3) {
                    hasThree = true;
                }
                temp = temp / 10;
            }

            if (hasThree) {
                found = found + 1;
                if (found == 2) {
                    System.out.println(arr[i]);
                    return arr[i];
                }
            }
        }

        System.out.println("Второй элемент с цифрой 3 не найден");
        return -1;
    }
}
