package org.example.level3_1;

public class FirstThreeChars {
    public String firstThree(String str) {
        String result = "";

        for (int i = 0; i < 3; i++) {
            result = result + str.charAt(i);
        }

        System.out.println(result);
        return result;
    }
}
