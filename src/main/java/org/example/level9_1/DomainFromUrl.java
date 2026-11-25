package org.example.level9_1;

public class DomainFromUrl {

    /** Returns the host part of a URL, e.g. "site.com" for "https://site.com:8080/dir/page.html". */
    public String domain(String url) {
        if (url == null || url.isBlank()) {
            throw new IllegalArgumentException("URL must not be empty");
        }
        int scheme = url.indexOf("://");
        int start = scheme >= 0 ? scheme + 3 : 0;

        int end = url.length();
        for (int i = start; i < url.length(); i++) {
            char current = url.charAt(i);
            if (current == '/' || current == ':' || current == '?' || current == '#') {
                end = i;
                break;
            }
        }
        return url.substring(start, end);
    }
}
