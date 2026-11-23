package org.example.level6_10;

public class PairedNumbersString {
    public String make() {
        String result = "";
        int number = 1;

        for (int group = 0; group < 4; group++) {
            if (group > 0) {
                result = result + " ";
            }
            result = result + number;
            number = number + 1;
            result = result + number;
            number = number + 1;
        }

        System.out.println(result);
        return result;
    }
}
