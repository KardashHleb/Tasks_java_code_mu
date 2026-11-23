package org.example.level10_4;

public class UrlFolderChain {
    public String[] chain(String url) {
        int scheme = url.indexOf("://");
        int start = 0;
        if (scheme >= 0) {
            start = scheme + 3;
        }

        int pathStart = url.length();
        for (int i = start; i < url.length(); i++) {
            if (url.charAt(i) == '/') {
                pathStart = i;
                break;
            }
        }

        String path = "";
        if (pathStart < url.length()) {
            path = url.substring(pathStart);
        }
        int question = path.indexOf('?');
        if (question >= 0) {
            path = path.substring(0, question);
        }

        int lastSlash = -1;
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == '/') {
                lastSlash = i;
            }
        }
        if (lastSlash >= 0) {
            path = path.substring(0, lastSlash + 1);
        }

        int slashes = 0;
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == '/') {
                slashes = slashes + 1;
            }
        }
        int count = slashes - 1;
        if (count < 0) {
            count = 0;
        }

        String[] result = new String[count];
        int index = 0;
        for (int i = 0; i < path.length() && index < count; i++) {
            if (path.charAt(i) == '/') {
                result[index] = path.substring(i);
                System.out.println(result[index]);
                index = index + 1;
            }
        }
        return result;
    }
}
