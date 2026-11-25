package org.example.level1_4;

public class HourQuarterDeterminer {

    private static final String[] QUARTERS = {"First quarter", "Second quarter", "Third quarter", "Fourth quarter"};

    /** Returns which quarter of an hour the given minute (0-59) falls into. */
    public String determineQuarter(int minute) {
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Minute must be between 0 and 59: " + minute);
        }
        return QUARTERS[minute / 15];
    }
}
