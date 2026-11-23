package org.example.level7_9;

import java.util.Random;

public class RandomColor {
    public String color() {
        String symbols = "0123456789abcdef";
        Random random = new Random();
        String result = "#";

        for (int i = 0; i < 6; i++) {
            result = result + symbols.charAt(random.nextInt(symbols.length()));
        }

        System.out.println(result);
        return result;
    }
}
