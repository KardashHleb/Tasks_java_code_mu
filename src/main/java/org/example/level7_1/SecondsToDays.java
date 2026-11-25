package org.example.level7_1;

public class SecondsToDays {

    private static final long SECONDS_PER_DAY = 24 * 60 * 60;

    /** Returns how many full days fit into the given number of seconds. */
    public long toDays(long seconds) {
        if (seconds < 0) {
            throw new IllegalArgumentException("Seconds must not be negative: " + seconds);
        }
        return seconds / SECONDS_PER_DAY;
    }
}
