package org.example.level1_6;

public class MegabytesToBytesConverter {

    /** Converts megabytes to bytes (1 MB = 1024 * 1024 bytes). */
    public long toBytes(long megabytes) {
        if (megabytes < 0) {
            throw new IllegalArgumentException("Size must not be negative: " + megabytes);
        }
        return Math.multiplyExact(megabytes, 1024L * 1024L);
    }
}
