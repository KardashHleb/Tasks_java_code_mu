package org.example.level2_9;

public class CelsiusToFahrenheit {
    public double convert(short celsius) {
        double fahrenheit = celsius * 9.0 / 5 + 32;
        System.out.println(fahrenheit);
        return fahrenheit;
    }
}
