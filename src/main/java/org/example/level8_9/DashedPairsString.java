package org.example.level8_9;

public class DashedPairsString {
    public String make() {
        String result = "-1-";

        for (int i = 1; i <= 4; i++) {
            result = result + i + (i + 1) + "-";
        }

        System.out.println(result);
        return result;
    }
}
