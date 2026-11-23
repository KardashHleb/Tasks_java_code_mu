package org.example.level4_9;

public class EveryThirdCharRemover {
    public String remove(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if ((i + 1) % 3 != 0) {
                result = result + str.charAt(i);
            }
        }

        System.out.println(result);
        return result;
    }
}
