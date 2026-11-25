package org.example.level3_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class HtmlStringsFilterTest {

    private final HtmlStringsFilter filter = new HtmlStringsFilter();

    @Test
    void keepsHtmlFiles() {
        String[] input = {"index.html", "style.css", "about.html", "html.txt"};
        assertArrayEquals(new String[]{"index.html", "about.html"}, filter.keepHtml(input));
    }

    @Test
    void emptyInput() {
        assertArrayEquals(new String[0], filter.keepHtml(new String[0]));
    }
}
