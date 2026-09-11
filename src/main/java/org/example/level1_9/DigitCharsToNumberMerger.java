package org.example.level1_9;

public class DigitCharsToNumberMerger {
    public int mergeToNumber(char chr1, char chr2, char chr3) {
        String str = "" + chr1 + chr2 + chr3;
        int number = Integer.parseInt(str);
        System.out.println(number);
        return number;
    }
}
