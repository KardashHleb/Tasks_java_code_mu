package org.example.level10_4;

import java.util.ArrayList;
import java.util.List;

public class UrlFolderChain {

    /**
     * Returns the folder path of a URL and all its shorter tails, e.g. for
     * "http://site.com/dir1/dir2/dir3/page.html": ["/dir1/dir2/dir3/", "/dir2/dir3/", "/dir3/"].
     */
    public List<String> chain(String url) {
        String rest = url;
        int query = rest.indexOf('?');
        if (query >= 0) {
            rest = rest.substring(0, query);
        }
        int scheme = rest.indexOf("://");
        int start = scheme >= 0 ? scheme + 3 : 0;
        int pathStart = rest.indexOf('/', start);
        if (pathStart < 0) {
            return List.of();
        }
        String folders = rest.substring(pathStart, rest.lastIndexOf('/') + 1);

        List<String> result = new ArrayList<>();
        for (int i = 0; i < folders.length() - 1; i++) {
            if (folders.charAt(i) == '/') {
                result.add(folders.substring(i));
            }
        }
        return result;
    }
}
