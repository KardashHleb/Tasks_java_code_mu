package org.example.level1_8;

public class BytesConverter {

    /** The same size expressed in larger units. */
    public record Sizes(double gigabytes, double megabytes, double kilobytes) {
    }

    /** Converts bytes to gigabytes, megabytes and kilobytes (binary units, factor 1024). */
    public Sizes convert(long bytes) {
        if (bytes < 0) {
            throw new IllegalArgumentException("Size must not be negative: " + bytes);
        }
        double kilobytes = bytes / 1024.0;
        double megabytes = kilobytes / 1024;
        double gigabytes = megabytes / 1024;
        return new Sizes(gigabytes, megabytes, kilobytes);
    }
}
