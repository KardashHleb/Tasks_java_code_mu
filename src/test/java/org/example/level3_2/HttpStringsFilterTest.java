package org.example.level3_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class HttpStringsFilterTest {

    private final HttpStringsFilter filter = new HttpStringsFilter();

    @Test
    void keepsHttpUrls() {
        String[] input = {"http://a.com", "https://b.com", "ftp://c.com", "http://d.org"};
        assertArrayEquals(new String[]{"http://a.com", "http://d.org"}, filter.filter(input));
    }

    @Test
    void noMatches() {
        assertArrayEquals(new String[0], filter.filter(new String[]{"https://secure.com", "http:/broken"}));
    }
}
