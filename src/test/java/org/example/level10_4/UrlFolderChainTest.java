package org.example.level10_4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class UrlFolderChainTest {

    private final UrlFolderChain task = new UrlFolderChain();

    @Test
    void listsFolderChain() {
        assertEquals(List.of("/dir1/dir2/dir3/", "/dir2/dir3/", "/dir3/"),
                task.chain("http://site.com/dir1/dir2/dir3/page.html"));
    }

    @Test
    void ignoresQueryString() {
        assertEquals(List.of("/a/"), task.chain("https://site.com/a/?back=/x/y/"));
    }

    @Test
    void urlWithoutFoldersGivesEmptyList() {
        assertEquals(List.of(), task.chain("http://site.com/page.html"));
        assertEquals(List.of(), task.chain("http://site.com"));
    }
}
