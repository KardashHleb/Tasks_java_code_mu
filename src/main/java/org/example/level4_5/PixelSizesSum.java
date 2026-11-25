package org.example.level4_5;

public class PixelSizesSum {

    /** Adds two CSS pixel sizes, e.g. "12px" + "15px" gives "27px". */
    public String sum(String size1, String size2) {
        return (pixels(size1) + pixels(size2)) + "px";
    }

    private int pixels(String size) {
        if (!size.matches("\\d+px")) {
            throw new IllegalArgumentException("Expected a size like \"12px\", got \"" + size + "\"");
        }
        return Integer.parseInt(size.substring(0, size.length() - 2));
    }
}
