package org.example.level6_9;

public class DigitGroupsSpacer {
    public String group(String number) {
        int remainder = number.length() % 3;
        int firstLength = remainder;
        if (firstLength == 0) {
            firstLength = 3;
        }

        String result = "";
        int index = 0;

        for (int i = 0; i < firstLength; i++) {
            result = result + number.charAt(index);
            index = index + 1;
        }

        while (index < number.length()) {
            result = result + " ";
            for (int i = 0; i < 3; i++) {
                result = result + number.charAt(index);
                index = index + 1;
            }
        }

        System.out.println(result);
        return result;
    }
}
