package org.example.level3_6;

import java.util.Arrays;

public class HtmlStringsFilter {

    /** Returns the strings that end with ".html". */
    public String[] keepHtml(String[] arr) {
        return Arrays.stream(arr)
                .filter(str -> str.endsWith(".html"))
                .toArray(String[]::new);
    }
}
