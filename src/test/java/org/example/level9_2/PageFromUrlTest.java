package org.example.level9_2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PageFromUrlTest {

    private final PageFromUrl task = new PageFromUrl();

    @ParameterizedTest
    @CsvSource({
            "https://site.com/dir/page.html, page.html",
            "https://site.com/dir/page.php?id=1/2, page.php",
            "https://site.com/dir/, ''",
            "index.html, index.html"
    })
    void extractsPage(String url, String expected) {
        assertEquals(expected, task.page(url));
    }
}
