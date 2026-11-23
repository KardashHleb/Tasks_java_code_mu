package org.example.level10_6;

public class UrlFolderReplacer {
    public String replace(String url, int number, String value) {
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

        String head = url.substring(0, pathStart);
        String path = "";
        if (pathStart < url.length()) {
            path = url.substring(pathStart);
        }

        String result = head;
        int folder = 0;
        int i = 0;
        while (i < path.length()) {
            if (path.charAt(i) == '/') {
                int next = i + 1;
                while (next < path.length() && path.charAt(next) != '/') {
                    next = next + 1;
                }
                folder = folder + 1;
                result = result + "/";
                if (folder == number && next > i + 1) {
                    result = result + value;
                } else {
                    result = result + path.substring(i + 1, next);
                }
                i = next;
            } else {
                result = result + path.charAt(i);
                i = i + 1;
            }
        }

        System.out.println(result);
        return result;
    }
}
