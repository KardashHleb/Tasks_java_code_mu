package org.example.level5_10;

public class LinesToArray {
    public String[] split(String text) {
        int count = 0;
        String line = "";

        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == '\n') {
                if (line.length() > 0) {
                    count = count + 1;
                }
                line = "";
            } else if (text.charAt(i) != '\r') {
                line = line + text.charAt(i);
            }
        }

        String[] result = new String[count];
        int index = 0;
        line = "";

        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == '\n') {
                if (line.length() > 0) {
                    result[index] = line;
                    System.out.println(result[index]);
                    index = index + 1;
                }
                line = "";
            } else if (text.charAt(i) != '\r') {
                line = line + text.charAt(i);
            }
        }

        return result;
    }
}
