package org.example.level6_10;

public class AlternatingSignsString {
    public String make() {
        String result = "1";

        for (int number = 2; number <= 8; number++) {
            if (number % 2 == 0) {
                result = result + "+";
            } else {
                result = result + "-";
            }
            result = result + number;
        }

        System.out.println(result);
        return result;
    }
}
