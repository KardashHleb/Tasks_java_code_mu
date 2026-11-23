package org.example.level9_3;

public class ProtocolFromUrl {
    public String protocol(String url) {
        int end = url.indexOf("://");
        String result = url;
        if (end >= 0) {
            result = url.substring(0, end);
        }
        System.out.println(result);
        return result;
    }
}
