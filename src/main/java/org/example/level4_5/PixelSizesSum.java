package org.example.level4_5;

public class PixelSizesSum {
    public String sum(String size1, String size2) {
        int first = pixels(size1);
        int second = pixels(size2);
        String result = (first + second) + "px";
        System.out.println(result);
        return result;
    }

    private int pixels(String size) {
        String number = "";
        for (int i = 0; i < size.length(); i++) {
            char current = size.charAt(i);
            if (current >= '0' && current <= '9') {
                number = number + current;
            }
        }
        return Integer.parseInt(number);
    }
}
