package org.example.level6_10;

public class ConsecutiveEqualsChecker {
    public boolean hasPair(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println("Есть два одинаковых элемента подряд");
                return true;
            }
        }

        System.out.println("Двух одинаковых элементов подряд нет");
        return false;
    }
}
