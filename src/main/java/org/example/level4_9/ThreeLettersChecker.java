package org.example.level4_9;

public class ThreeLettersChecker {
    public boolean atMostThree(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                count = count + 1;
            }
        }

        if (count <= 3) {
            System.out.println("Не более трех букв");
            return true;
        }

        System.out.println("Больше трех букв");
        return false;
    }
}
