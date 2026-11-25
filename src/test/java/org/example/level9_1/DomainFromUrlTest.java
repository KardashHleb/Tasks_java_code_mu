package org.example.level9_1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Test;

class DomainFromUrlTest {

    private final DomainFromUrl task = new DomainFromUrl();

    @ParameterizedTest
    @CsvSource({
            "https://site.com/dir/page.html, site.com",
            "http://site.com:8080/index.html, site.com",
            "site.com/page?x=1, site.com",
            "https://sub.site.com, sub.site.com"
    })
    void extractsDomain(String url, String expected) {
        assertEquals(expected, task.domain(url));
    }

    @Test
    void rejectsEmptyUrl() {
        assertThrows(IllegalArgumentException.class, () -> task.domain(" "));
    }
}
