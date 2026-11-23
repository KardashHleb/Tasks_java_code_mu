package org.example.level4_2;

public class AllElementsPresentChecker {
    public boolean allPresent(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Не все элементы есть во втором");
                return false;
            }
        }

        System.out.println("Все элементы есть во втором");
        return true;
    }
}
