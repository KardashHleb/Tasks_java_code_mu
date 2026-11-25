package org.example.level5_9;

public class EvenXPyramid {

    /** Builds five rows of 'x' characters of lengths 2, 4, 6, 8, 10. */
    public String build() {
        StringBuilder result = new StringBuilder();
        for (int count = 2; count <= 10; count += 2) {
            if (count > 2) {
                result.append('\n');
            }
            for (int i = 0; i < count; i++) {
                result.append('x');
            }
        }
        return result.toString();
    }
}
