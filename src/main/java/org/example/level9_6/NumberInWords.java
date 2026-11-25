package org.example.level9_6;

public class NumberInWords {

    private static final String[] UNDER_TWENTY = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
            "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] TENS = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    /** Writes a number from -999 to 999 in English words, e.g. 123 -> "one hundred twenty-three". */
    public String words(int number) {
        if (number < -999 || number > 999) {
            throw new IllegalArgumentException("Number must be between -999 and 999: " + number);
        }
        if (number == 0) {
            return UNDER_TWENTY[0];
        }
        int value = Math.abs(number);
        StringBuilder result = new StringBuilder();
        if (number < 0) {
            result.append("minus ");
        }

        int hundreds = value / 100;
        int rest = value % 100;
        if (hundreds > 0) {
            result.append(UNDER_TWENTY[hundreds]).append(" hundred");
            if (rest > 0) {
                result.append(' ');
            }
        }
        if (rest >= 20) {
            result.append(TENS[rest / 10]);
            if (rest % 10 > 0) {
                result.append('-').append(UNDER_TWENTY[rest % 10]);
            }
        } else if (rest > 0) {
            result.append(UNDER_TWENTY[rest]);
        }
        return result.toString();
    }
}
