package org.example.level4_6;

public class EverySecondChar {
    public String take(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i = i + 2) {
            result = result + str.charAt(i);
        }

        System.out.println(result);
        return result;
    }
}
