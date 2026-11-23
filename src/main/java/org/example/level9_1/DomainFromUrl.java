package org.example.level9_1;

public class DomainFromUrl {
    public String domain(String url) {
        int start = url.indexOf("://");
        if (start >= 0) {
            start = start + 3;
        } else {
            start = 0;
        }

        int end = url.length();
        for (int i = start; i < url.length(); i++) {
            if (url.charAt(i) == '/' || url.charAt(i) == ':' || url.charAt(i) == '?') {
                end = i;
                break;
            }
        }

        String result = url.substring(start, end);
        System.out.println(result);
        return result;
    }
}
