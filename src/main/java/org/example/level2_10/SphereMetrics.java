package org.example.level2_10;

public class SphereMetrics {
    public void calculate(float radius) {
        double volume = 4.0 / 3.0 * Math.PI * radius * radius * radius;
        double surface = 4 * Math.PI * radius * radius;

        System.out.println(volume);
        System.out.println(surface);
    }
}
