package org.example.level9_6;

public class FirstFolderFromUrl {
    public String folder(String url) {
        int scheme = url.indexOf("://");
        int start = 0;
        if (scheme >= 0) {
            start = scheme + 3;
        }

        int domainEnd = url.length();
        for (int i = start; i < url.length(); i++) {
            if (url.charAt(i) == '/') {
                domainEnd = i;
                break;
            }
        }

        int folderStart = domainEnd + 1;
        int folderEnd = url.length();
        for (int i = folderStart; i < url.length(); i++) {
            if (url.charAt(i) == '/') {
                folderEnd = i;
                break;
            }
        }

        String result = "";
        if (folderStart < folderEnd && folderStart <= url.length()) {
            result = url.substring(folderStart, folderEnd);
        }
        System.out.println(result);
        return result;
    }
}
