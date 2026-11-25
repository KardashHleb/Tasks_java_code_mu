package org.example.level9_6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FirstFolderFromUrlTest {

    private final FirstFolderFromUrl task = new FirstFolderFromUrl();

    @ParameterizedTest
    @CsvSource({
            "http://site.com/dir1/dir2/page.html, dir1",
            "https://site.com/blog/, blog",
            "https://site.com/page.html, ''",
            "https://site.com, ''",
            "https://site.com/page.php?back=/a/b, ''"
    })
    void extractsFirstFolder(String url, String expected) {
        assertEquals(expected, task.folder(url));
    }
}
