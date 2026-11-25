package org.example.level1_5;

public class KilobytesToBytesConverter {

    /** Converts kilobytes to bytes (1 KB = 1024 bytes). */
    public long toBytes(long kilobytes) {
        if (kilobytes < 0) {
            throw new IllegalArgumentException("Size must not be negative: " + kilobytes);
        }
        return Math.multiplyExact(kilobytes, 1024L);
    }
}
