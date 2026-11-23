package org.example.level10_9;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class FrequentChar {
    public char find(String path) {
        String text = readText(path);
        String chars = "";
        int[] counts = new int[text.length() + 1];

        for (int i = 0; i < text.length(); i++) {
            int place = chars.indexOf(text.charAt(i));
            if (place < 0) {
                chars = chars + text.charAt(i);
                counts[chars.length() - 1] = 1;
            } else {
                counts[place] = counts[place] + 1;
            }
        }

        char result = ' ';
        int best = 0;
        for (int i = 0; i < chars.length(); i++) {
            if (counts[i] > best) {
                best = counts[i];
                result = chars.charAt(i);
            }
        }

        System.out.println(result);
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
