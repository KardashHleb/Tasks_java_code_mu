package org.example.level10_10;

public class ColumnProduct {
    public long multiply(int first, int second) {
        System.out.println("  " + first);
        System.out.println("x " + second);

        long left = first;
        long right = second;
        if (left < 0) {
            left = -left;
        }
        if (right < 0) {
            right = -right;
        }

        long total = 0;
        long place = 1;
        if (right == 0) {
            System.out.println(0);
            return 0;
        }
        while (right > 0) {
            int digit = (int) (right % 10);
            long partial = left * digit * place;
            System.out.println(partial);
            total = total + partial;
            place = place * 10;
            right = right / 10;
        }
        if ((first < 0 && second > 0) || (first > 0 && second < 0)) {
            total = -total;
        }
        System.out.println(total);
        return total;
    }
}
