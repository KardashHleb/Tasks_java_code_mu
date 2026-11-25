package org.example.level9_3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ProtocolFromUrlTest {

    private final ProtocolFromUrl task = new ProtocolFromUrl();

    @ParameterizedTest
    @CsvSource({
            "https://site.com/page.html, https",
            "http://site.com, http",
            "ftp://files.site.com/a.zip, ftp"
    })
    void extractsProtocol(String url, String expected) {
        assertEquals(expected, task.protocol(url));
    }

    @Test
    void rejectsUrlWithoutProtocol() {
        assertThrows(IllegalArgumentException.class, () -> task.protocol("site.com/page.html"));
    }
}
