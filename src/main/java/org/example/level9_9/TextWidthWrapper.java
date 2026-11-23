package org.example.level9_9;

public class TextWidthWrapper {
    public String wrap(String text) {
        String result = "";
        String line = "";
        String word = "";

        for (int i = 0; i <= text.length(); i++) {
            boolean boundary = i == text.length()
                    || text.charAt(i) == ' '
                    || text.charAt(i) == '\n'
                    || text.charAt(i) == '\t';
            if (boundary) {
                if (word.length() > 0) {
                    if (line.length() == 0) {
                        line = word;
                    } else if (line.length() + 1 + word.length() <= 70) {
                        line = line + " " + word;
                    } else {
                        if (result.length() > 0) {
                            result = result + "\n";
                        }
                        result = result + line;
                        line = word;
                    }
                    word = "";
                }
            } else {
                word = word + text.charAt(i);
            }
        }
        if (line.length() > 0) {
            if (result.length() > 0) {
                result = result + "\n";
            }
            result = result + line;
        }

        System.out.println(result);
        return result;
    }
}
