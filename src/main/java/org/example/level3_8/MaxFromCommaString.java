package org.example.level3_8;

public class MaxFromCommaString {
    public int findMax(String str) {
        int max = Integer.MIN_VALUE;
        String current = "";
        boolean found = false;

        for (int i = 0; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) == ',') {
                int number = Integer.parseInt(current);
                if (!found || number > max) {
                    max = number;
                    found = true;
                }
                current = "";
            } else {
                current = current + str.charAt(i);
            }
        }

        System.out.println(max);
        return max;
    }
}
