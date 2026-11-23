package org.example.level5_5;

public class UniqueCharsKeeper {
    public String keepUnique(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            boolean already = false;

            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == current) {
                    already = true;
                }
            }

            if (!already) {
                result = result + current;
            }
        }

        System.out.println(result);
        return result;
    }
}
