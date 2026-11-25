package org.example.level8_10;

import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.example.common.FileUtils;

public class LeapYearsWriter {

    private static final int YEARS_BACK = 100;

    /** Writes the leap years of the last hundred years before the current one to the file and returns them. */
    public List<Integer> write(Path file) {
        return write(file, LocalDate.now());
    }

    /** Writes the leap years from {@code today}'s year minus 100 to the previous year, one per line, and returns them. */
    public List<Integer> write(Path file, LocalDate today) {
        int currentYear = today.getYear();
        List<Integer> years = new ArrayList<>();
        for (int year = currentYear - YEARS_BACK; year < currentYear; year++) {
            if (isLeap(year)) {
                years.add(year);
            }
        }
        FileUtils.writeLines(file, years.stream().map(String::valueOf).toList());
        return years;
    }

    private boolean isLeap(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;
    }
}
