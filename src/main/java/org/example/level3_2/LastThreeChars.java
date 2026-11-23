package org.example.level3_2;

public class LastThreeChars {
    public String lastThree(String str) {
        String result = "";
        int start = str.length() - 3;

        for (int i = start; i < str.length(); i++) {
            result = result + str.charAt(i);
        }

        System.out.println(result);
        return result;
    }
}
