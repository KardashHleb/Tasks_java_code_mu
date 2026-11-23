package org.example.level10_8;

public class SameLettersChecker {
    public boolean same(String first, String second) {
        boolean result = false;
        if (first.length() == second.length()) {
            int[] counts = new int[first.length()];
            String chars = "";
            for (int i = 0; i < first.length(); i++) {
                int place = chars.indexOf(first.charAt(i));
                if (place < 0) {
                    chars = chars + first.charAt(i);
                    counts[chars.length() - 1] = 1;
                } else {
                    counts[place] = counts[place] + 1;
                }
            }
            result = true;
            for (int i = 0; i < second.length(); i++) {
                int place = chars.indexOf(second.charAt(i));
                if (place < 0 || counts[place] == 0) {
                    result = false;
                } else {
                    counts[place] = counts[place] - 1;
                }
            }
        }
        System.out.println(result);
        return result;
    }
}
