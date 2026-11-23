package org.example.level8_2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class CommaMaxNumber {
    public int max(String path) {
        String text = readText(path);
        boolean found = false;
        int max = 0;
        int i = 0;

        while (i < text.length()) {
            char current = text.charAt(i);
            if (current == '-' || isDigit(current)) {
                int sign = 1;
                if (current == '-') {
                    sign = -1;
                    i = i + 1;
                }
                if (i < text.length() && isDigit(text.charAt(i))) {
                    int value = 0;
                    while (i < text.length() && isDigit(text.charAt(i))) {
                        value = value * 10 + (text.charAt(i) - '0');
                        i = i + 1;
                    }
                    value = value * sign;
                    if (!found || value > max) {
                        max = value;
                        found = true;
                    }
                }
            } else {
                i = i + 1;
            }
        }

        if (!found) {
            System.out.println("числа не найдены");
            return 0;
        }

        System.out.println(max);
        return max;
    }

    private boolean isDigit(char current) {
        return current >= '0' && current <= '9';
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
