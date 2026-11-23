package org.example.level10_1;

public class SchoolLcm {
    public int find(int first, int second) {
        int left = first;
        int right = second;
        if (left < 0) {
            left = -left;
        }
        if (right < 0) {
            right = -right;
        }

        int result = 1;
        while (left > 1 || right > 1) {
            int divisor = 2;
            while ((left % divisor != 0) && (right % divisor != 0)) {
                divisor = divisor + 1;
            }
            System.out.println(left + " " + right + " | " + divisor);
            if (left % divisor == 0) {
                left = left / divisor;
            }
            if (right % divisor == 0) {
                right = right / divisor;
            }
            result = result * divisor;
        }
        System.out.println(left + " " + right + " |");
        System.out.println("НОК = " + result);
        return result;
    }
}
