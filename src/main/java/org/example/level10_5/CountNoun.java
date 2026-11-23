package org.example.level10_5;

public class CountNoun {
    public String form(int number, String one, String few, String many) {
        int value = number;
        if (value < 0) {
            value = -value;
        }
        int lastTwo = value % 100;
        int last = value % 10;
        String word = many;
        if (lastTwo < 11 || lastTwo > 14) {
            if (last == 1) {
                word = one;
            } else if (last >= 2 && last <= 4) {
                word = few;
            }
        }

        String result = number + " " + word;
        System.out.println(result);
        return result;
    }
}
