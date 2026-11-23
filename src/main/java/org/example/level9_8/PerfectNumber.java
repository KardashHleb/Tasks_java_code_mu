package org.example.level9_8;

public class PerfectNumber {
    public boolean check(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        boolean perfect = number > 1 && sum == number;
        System.out.println(perfect);
        return perfect;
    }
}
