package org.example.level9_2;

public class PageFromUrl {

    /** Returns the last path segment of a URL without the query string, e.g. "page.html". */
    public String page(String url) {
        String result = url;
        int query = result.indexOf('?');
        if (query >= 0) {
            result = result.substring(0, query);
        }
        int slash = result.lastIndexOf('/');
        if (slash >= 0) {
            result = result.substring(slash + 1);
        }
        return result;
    }
}
