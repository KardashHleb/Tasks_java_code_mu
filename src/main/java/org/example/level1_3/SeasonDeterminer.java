package org.example.level1_3;

public class SeasonDeterminer {

    /** Returns the season ("Winter", "Spring", "Summer" or "Autumn") of the month number 1-12. */
    public String determineSeason(int month) {
        if (month == 12 || month == 1 || month == 2) {
            return "Winter";
        } else if (month >= 3 && month <= 5) {
            return "Spring";
        } else if (month >= 6 && month <= 8) {
            return "Summer";
        } else if (month >= 9 && month <= 11) {
            return "Autumn";
        }
        throw new IllegalArgumentException("Month number must be between 1 and 12: " + month);
    }
}
