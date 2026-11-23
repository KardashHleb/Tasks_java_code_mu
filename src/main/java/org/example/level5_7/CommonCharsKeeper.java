package org.example.level5_7;

public class CommonCharsKeeper {
    public String keep(String str1, String str2) {
        String result = "";

        for (int i = 0; i < str1.length(); i++) {
            char current = str1.charAt(i);
            boolean inSecond = false;
            boolean already = false;

            for (int j = 0; j < str2.length(); j++) {
                if (str2.charAt(j) == current) {
                    inSecond = true;
                }
            }

            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == current) {
                    already = true;
                }
            }

            if (inSecond && !already) {
                result = result + current;
            }
        }

        System.out.println(result);
        return result;
    }
}
