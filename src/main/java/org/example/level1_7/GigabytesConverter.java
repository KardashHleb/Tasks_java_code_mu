package org.example.level1_7;

public class GigabytesConverter {

    /** The same size expressed in smaller units. */
    public record Sizes(double megabytes, double kilobytes, double bytes) {
    }

    /** Converts gigabytes to megabytes, kilobytes and bytes (binary units, factor 1024). */
    public Sizes convert(double gigabytes) {
        if (gigabytes < 0 || Double.isNaN(gigabytes)) {
            throw new IllegalArgumentException("Size must not be negative: " + gigabytes);
        }
        double megabytes = gigabytes * 1024;
        double kilobytes = megabytes * 1024;
        double bytes = kilobytes * 1024;
        return new Sizes(megabytes, kilobytes, bytes);
    }
}
