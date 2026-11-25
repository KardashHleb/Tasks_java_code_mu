package org.example.level10_10;

import java.util.ArrayList;
import java.util.List;

public class ColumnProduct {

    /** The product and the lines of the long multiplication layout. */
    public record Solution(long product, List<String> lines) {
    }

    /** Product of two numbers computed by long multiplication. */
    public long multiply(int first, int second) {
        return solve(first, second).product();
    }

    /**
     * Multiplies "in a column": the first number is multiplied by every digit of the second one
     * (right to left), each partial product is shifted by its digit place, and the partials are added.
     * Example for 123 * 45: " 123", "x 45", "----", " 615", "4920", "----", "5535".
     */
    public Solution solve(int first, int second) {
        long left = Math.abs((long) first);
        long right = Math.abs((long) second);

        List<String> partials = new ArrayList<>();
        long total = 0;
        long place = 1;
        do {
            long digit = right % 10;
            long partial = left * digit * place;
            partials.add(String.valueOf(partial));
            total += partial;
            place *= 10;
            right /= 10;
        } while (right > 0);

        if ((first < 0) != (second < 0) && total != 0) {
            total = -total;
        }

        String top = String.valueOf(first);
        String bottom = "x " + second;
        String result = String.valueOf(total);
        int width = Math.max(Math.max(top.length(), bottom.length()), result.length());
        for (String partial : partials) {
            width = Math.max(width, partial.length());
        }

        List<String> lines = new ArrayList<>();
        lines.add(padLeft(top, width));
        lines.add("x " + padLeft(String.valueOf(second), width - 2));
        lines.add("-".repeat(width));
        for (String partial : partials) {
            lines.add(padLeft(partial, width));
        }
        lines.add("-".repeat(width));
        lines.add(padLeft(result, width));
        return new Solution(total, List.copyOf(lines));
    }

    private static String padLeft(String text, int width) {
        return " ".repeat(Math.max(0, width - text.length())) + text;
    }
}
