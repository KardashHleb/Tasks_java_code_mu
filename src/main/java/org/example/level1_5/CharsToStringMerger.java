package org.example.level1_5;

public class CharsToStringMerger {

    /** Joins three characters into a string. */
    public String merge(char chr1, char chr2, char chr3) {
        return new StringBuilder(3).append(chr1).append(chr2).append(chr3).toString();
    }
}
