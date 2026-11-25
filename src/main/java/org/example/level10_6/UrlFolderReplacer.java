package org.example.level10_6;

public class UrlFolderReplacer {

    /**
     * Replaces the folder with the given 1-based number in a URL, e.g.
     * ("http://site.com/dir1/dir2/page.html", 2, "new") -> "http://site.com/dir1/new/page.html".
     */
    public String replace(String url, int number, String value) {
        if (value.isEmpty() || value.contains("/")) {
            throw new IllegalArgumentException("Invalid folder name: \"" + value + "\"");
        }
        int scheme = url.indexOf("://");
        int start = scheme >= 0 ? scheme + 3 : 0;
        int pathStart = url.indexOf('/', start);
        int pathEnd = url.length();
        for (char stop : new char[]{'?', '#'}) {
            int index = url.indexOf(stop, start);
            if (index >= 0 && index < pathEnd) {
                pathEnd = index;
            }
        }
        if (pathStart < 0 || pathStart > pathEnd) {
            throw new IllegalArgumentException("URL has no folders: " + url);
        }
        int lastSlash = url.lastIndexOf('/', pathEnd - 1);
        String[] folders = lastSlash > pathStart
                ? url.substring(pathStart + 1, lastSlash).split("/")
                : new String[0];
        if (number < 1 || number > folders.length) {
            throw new IllegalArgumentException(
                    "Folder number " + number + " is out of range 1.." + folders.length + " for " + url);
        }
        folders[number - 1] = value;
        return url.substring(0, pathStart + 1) + String.join("/", folders) + url.substring(lastSlash);
    }
}
