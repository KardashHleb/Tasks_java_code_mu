package org.example.level10_2;

public class SchoolGcd {
    public int find(int first, int second) {
        int left = first;
        int right = second;
        if (left < 0) {
            left = -left;
        }
        if (right < 0) {
            right = -right;
        }

        while (right != 0) {
            int quote = left / right;
            int rest = left % right;
            System.out.println(left + " = " + right + " * " + quote + " + " + rest);
            left = right;
            right = rest;
        }

        System.out.println("НОД = " + left);
        return left;
    }
}
