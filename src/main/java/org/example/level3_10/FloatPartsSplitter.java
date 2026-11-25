package org.example.level3_10;

public class FloatPartsSplitter {

    /**
     * Splits a number into its integer part and its fractional part rounded to hundredths,
     * e.g. 12.34 gives {12, 34}. The fractional part is always non-negative.
     */
    public int[] split(float number) {
        int whole = (int) number;
        int fraction = Math.abs(Math.round((number - whole) * 100));
        return new int[]{whole, fraction};
    }
}
