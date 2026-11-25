package org.example.level9_3;

public class ProtocolFromUrl {

    /** Returns the protocol of a URL, e.g. "https" for "https://site.com". */
    public String protocol(String url) {
        int end = url.indexOf("://");
        if (end <= 0) {
            throw new IllegalArgumentException("URL has no protocol: " + url);
        }
        return url.substring(0, end);
    }
}
