package org.example.level9_2;

public class PageFromUrl {
    public String page(String url) {
        int slash = -1;
        for (int i = 0; i < url.length(); i++) {
            if (url.charAt(i) == '/') {
                slash = i;
            }
        }

        String result = url;
        if (slash >= 0 && slash < url.length() - 1) {
            result = url.substring(slash + 1);
        }
        int question = result.indexOf('?');
        if (question >= 0) {
            result = result.substring(0, question);
        }

        System.out.println(result);
        return result;
    }
}
