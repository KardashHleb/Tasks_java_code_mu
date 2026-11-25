package org.example.level9_6;

public class FirstFolderFromUrl {

    /** Returns the first folder of a URL path, e.g. "dir1" for "http://site.com/dir1/dir2/page.html", or "" if there is none. */
    public String folder(String url) {
        String rest = url;
        int query = rest.indexOf('?');
        if (query >= 0) {
            rest = rest.substring(0, query);
        }
        int scheme = rest.indexOf("://");
        int start = scheme >= 0 ? scheme + 3 : 0;

        int pathStart = rest.indexOf('/', start);
        if (pathStart < 0) {
            return "";
        }
        int folderEnd = rest.indexOf('/', pathStart + 1);
        if (folderEnd < 0) {
            return "";
        }
        return rest.substring(pathStart + 1, folderEnd);
    }
}
