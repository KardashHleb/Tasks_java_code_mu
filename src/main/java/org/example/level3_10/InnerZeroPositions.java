package org.example.level3_10;

import java.util.ArrayList;
import java.util.List;

public class InnerZeroPositions {

    /**
     * Returns the positions (indexes in the decimal notation, sign ignored) of all zeros of the number
     * except the first and the last zero.
     */
    public List<Integer> findInnerZeros(long number) {
        String digits = Long.toString(Math.abs(number));
        int first = digits.indexOf('0');
        int last = digits.lastIndexOf('0');
        List<Integer> positions = new ArrayList<>();
        if (first == -1) {
            return positions;
        }
        for (int i = first + 1; i < last; i++) {
            if (digits.charAt(i) == '0') {
                positions.add(i);
            }
        }
        return positions;
    }
}
