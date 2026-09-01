package org.example.level1_2;

public class LastDigitShower {
    public int showLastDigit(int number) {
        int lastDigit = Math.abs(number) % 10;
        System.out.println(lastDigit);
        return lastDigit;
    }
}
