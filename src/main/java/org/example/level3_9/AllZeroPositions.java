package org.example.level3_9;

public class AllZeroPositions {
    public void printZeroPositions(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                System.out.println(i);
            }
        }
    }
}
