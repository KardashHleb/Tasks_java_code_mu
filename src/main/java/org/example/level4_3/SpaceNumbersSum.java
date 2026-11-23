package org.example.level4_3;

public class SpaceNumbersSum {
    public int sum(String str) {
        int sum = 0;
        String current = "";

        for (int i = 0; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) == ' ') {
                if (current.length() > 0) {
                    sum = sum + Integer.parseInt(current);
                    current = "";
                }
            } else {
                current = current + str.charAt(i);
            }
        }

        System.out.println(sum);
        return sum;
    }
}
