package org.example.level7_6;

import java.util.Random;

public class RandomLettersString {
    public String make(int length) {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        String result = "";

        for (int i = 0; i < length; i++) {
            result = result + letters.charAt(random.nextInt(letters.length()));
        }

        System.out.println(result);
        return result;
    }
}
