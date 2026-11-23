package org.example.level4_5;

public class DigitSumThirteen {
    public void printNumbers() {
        for (int i = 1; i <= 1000; i++) {
            int temp = i;
            int sum = 0;
            while (temp > 0) {
                sum = sum + temp % 10;
                temp = temp / 10;
            }
            if (sum == 13) {
                System.out.println(i);
            }
        }
    }
}
