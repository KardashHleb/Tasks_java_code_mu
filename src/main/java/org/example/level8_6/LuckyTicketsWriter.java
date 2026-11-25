package org.example.level8_6;

import java.nio.file.Path;
import org.example.common.FileUtils;

public class LuckyTicketsWriter {

    private static final int MAX_TICKET = 999_999;

    /**
     * Writes every lucky six-digit ticket number (000000 to 999999), one per line, to the file and returns
     * how many there are. A ticket is lucky when the digit sums of its two halves are equal.
     */
    public int write(Path file) {
        StringBuilder text = new StringBuilder();
        int count = 0;
        for (int number = 0; number <= MAX_TICKET; number++) {
            if (digitSum(number / 1000) == digitSum(number % 1000)) {
                text.append(String.format("%06d", number)).append('\n');
                count++;
            }
        }
        FileUtils.writeText(file, text.toString());
        return count;
    }

    private int digitSum(int value) {
        int sum = 0;
        while (value > 0) {
            sum += value % 10;
            value /= 10;
        }
        return sum;
    }
}
