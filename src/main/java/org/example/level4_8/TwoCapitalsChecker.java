package org.example.level4_8;

public class TwoCapitalsChecker {
    public boolean atMostTwo(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                count = count + 1;
            }
        }

        if (count <= 2) {
            System.out.println("Не более двух заглавных");
            return true;
        }

        System.out.println("Больше двух заглавных");
        return false;
    }
}
