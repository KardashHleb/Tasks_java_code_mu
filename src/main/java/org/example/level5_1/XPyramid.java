package org.example.level5_1;

public class XPyramid {

    /** Builds a pyramid of five rows where row n consists of n 'x' characters. */
    public String build() {
        StringBuilder result = new StringBuilder();
        for (int row = 1; row <= 5; row++) {
            if (row > 1) {
                result.append('\n');
            }
            for (int col = 0; col < row; col++) {
                result.append('x');
            }
        }
        return result.toString();
    }
}
