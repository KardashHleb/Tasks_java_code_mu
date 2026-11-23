package org.example.level4_7;

public class DashedNumbersString {
    public String make() {
        String result = "";

        for (int i = 1; i <= 5; i++) {
            result = result + "-" + i;
        }

        result = result + "-";
        System.out.println(result);
        return result;
    }
}
