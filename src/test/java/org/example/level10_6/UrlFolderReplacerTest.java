package org.example.level10_6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class UrlFolderReplacerTest {

    private final UrlFolderReplacer task = new UrlFolderReplacer();

    @ParameterizedTest
    @CsvSource({
            "http://site.com/dir1/dir2/page.html, 2, new, http://site.com/dir1/new/page.html",
            "http://site.com/dir1/dir2/page.html, 1, x, http://site.com/x/dir2/page.html",
            "http://site.com/a/b/?q=1/2, 2, c, http://site.com/a/c/?q=1/2"
    })
    void replacesFolder(String url, int number, String value, String expected) {
        assertEquals(expected, task.replace(url, number, value));
    }

    @Test
    void rejectsFolderNumberOutOfRange() {
        assertThrows(IllegalArgumentException.class,
                () -> task.replace("http://site.com/dir1/dir2/page.html", 3, "x"));
        assertThrows(IllegalArgumentException.class,
                () -> task.replace("http://site.com/page.html", 1, "x"));
        assertThrows(IllegalArgumentException.class,
                () -> task.replace("http://site.com/dir1/page.html", 0, "x"));
    }

    @Test
    void rejectsInvalidFolderName() {
        assertThrows(IllegalArgumentException.class,
                () -> task.replace("http://site.com/dir1/page.html", 1, "a/b"));
    }
}
