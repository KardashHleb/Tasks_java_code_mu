package org.example.level4_9;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class MonthShortNames {

    /** Converts month numbers (1-12) to short English month names, e.g. 1 gives "Jan". */
    public String[] toNames(byte[] months) {
        String[] result = new String[months.length];
        for (int i = 0; i < months.length; i++) {
            if (months[i] < 1 || months[i] > 12) {
                throw new IllegalArgumentException("Month number must be between 1 and 12, got " + months[i]);
            }
            result[i] = Month.of(months[i]).getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
        }
        return result;
    }
}
