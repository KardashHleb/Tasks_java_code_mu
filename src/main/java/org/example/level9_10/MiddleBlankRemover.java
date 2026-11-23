package org.example.level9_10;

public class MiddleBlankRemover {
    public String clean(String text) {
        String[] rows = lines(text);
        int first = -1;
        int last = -1;
        for (int i = 0; i < rows.length; i++) {
            if (rows[i].length() > 0) {
                if (first < 0) {
                    first = i;
                }
                last = i;
            }
        }

        String result = "";
        boolean started = false;
        for (int i = 0; i < rows.length; i++) {
            boolean keep = rows[i].length() > 0 || first < 0 || i < first || i > last;
            if (keep) {
                if (started) {
                    result = result + "\n";
                }
                result = result + rows[i];
                started = true;
            }
        }

        System.out.println(result);
        return result;
    }

    private String[] lines(String text) {
        if (text.length() == 0) {
            return new String[0];
        }
        int count = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '\n') {
                count = count + 1;
            }
        }
        if (text.charAt(text.length() - 1) == '\n') {
            count = count - 1;
        }
        String[] result = new String[count];
        String line = "";
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '\n') {
                if (index < result.length) {
                    result[index] = line;
                    index = index + 1;
                }
                line = "";
            } else {
                line = line + text.charAt(i);
            }
        }
        if (index < result.length) {
            result[index] = line;
        }
        return result;
    }
}
