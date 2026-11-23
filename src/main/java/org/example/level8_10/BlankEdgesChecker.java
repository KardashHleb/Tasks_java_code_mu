package org.example.level8_10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class BlankEdgesChecker {
    public boolean check(String path) {
        String text = readText(path);
        String[] rows = lines(text);
        boolean ok = rows.length >= 3
                && rows[0].length() == 0
                && rows[1].length() > 0
                && rows[rows.length - 1].length() == 0
                && rows[rows.length - 2].length() == 0
                && rows[rows.length - 3].length() > 0;

        System.out.println(ok);
        return ok;
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

    private String readText(String path) {
        String text = "";
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8)) {
            int ch = reader.read();
            while (ch != -1) {
                if (ch != '\r') {
                    text = text + (char) ch;
                }
                ch = reader.read();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return text;
    }
}
