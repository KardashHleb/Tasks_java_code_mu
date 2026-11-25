package org.example.level2_9;

public class CelsiusToFahrenheitConverter {

    private static final double ABSOLUTE_ZERO_CELSIUS = -273.15;

    /** Converts degrees Celsius to degrees Fahrenheit: F = C * 9 / 5 + 32. */
    public double toFahrenheit(double celsius) {
        if (celsius < ABSOLUTE_ZERO_CELSIUS || Double.isNaN(celsius)) {
            throw new IllegalArgumentException("Temperature is below absolute zero: " + celsius);
        }
        return celsius * 9.0 / 5.0 + 32;
    }
}
