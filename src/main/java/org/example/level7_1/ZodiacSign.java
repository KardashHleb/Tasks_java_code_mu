package org.example.level7_1;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class ZodiacSign {

    /** Returns the English zodiac sign for a date given as yyyy-MM-dd. */
    public String sign(String dateText) {
        try {
            return sign(LocalDate.parse(dateText));
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date, expected yyyy-MM-dd: " + dateText, e);
        }
    }

    /** Returns the English zodiac sign for the date. */
    public String sign(LocalDate date) {
        int monthDay = date.getMonthValue() * 100 + date.getDayOfMonth();
        if (monthDay >= 1222 || monthDay <= 119) {
            return "Capricorn";
        } else if (monthDay <= 218) {
            return "Aquarius";
        } else if (monthDay <= 320) {
            return "Pisces";
        } else if (monthDay <= 419) {
            return "Aries";
        } else if (monthDay <= 520) {
            return "Taurus";
        } else if (monthDay <= 620) {
            return "Gemini";
        } else if (monthDay <= 722) {
            return "Cancer";
        } else if (monthDay <= 822) {
            return "Leo";
        } else if (monthDay <= 922) {
            return "Virgo";
        } else if (monthDay <= 1022) {
            return "Libra";
        } else if (monthDay <= 1121) {
            return "Scorpio";
        }
        return "Sagittarius";
    }
}
