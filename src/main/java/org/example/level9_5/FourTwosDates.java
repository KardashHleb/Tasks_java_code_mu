package org.example.level9_5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FourTwosDates {

    private static final DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    /** Dates of the 21st century (2001-2100) whose dd.MM.yyyy form contains exactly four digits 2. */
    public List<String> find() {
        return find(2001, 2100);
    }

    /** Dates between the given years (inclusive) whose dd.MM.yyyy form contains exactly four digits 2. */
    public List<String> find(int fromYear, int toYear) {
        if (fromYear > toYear) {
            throw new IllegalArgumentException("Start year " + fromYear + " is after end year " + toYear);
        }
        List<String> result = new ArrayList<>();
        LocalDate end = LocalDate.of(toYear, 12, 31);
        for (LocalDate date = LocalDate.of(fromYear, 1, 1); !date.isAfter(end); date = date.plusDays(1)) {
            String text = date.format(FORMAT);
            if (countTwos(text) == 4) {
                result.add(text);
            }
        }
        return result;
    }

    private static int countTwos(String text) {
        int count = 0;
        for (char current : text.toCharArray()) {
            if (current == '2') {
                count++;
            }
        }
        return count;
    }
}
