package org.example.level3_9;

public class BinaryConverter {

    /**
     * Converts the number to its binary notation by repeated division by two.
     * Negative numbers get a leading minus sign, e.g. -5 gives "-101".
     */
    public String toBinary(int number) {
        if (number == 0) {
            return "0";
        }
        long rest = Math.abs((long) number);
        StringBuilder binary = new StringBuilder();
        while (rest > 0) {
            binary.append(rest % 2);
            rest = rest / 2;
        }
        if (number < 0) {
            binary.append('-');
        }
        return binary.reverse().toString();
    }
}
