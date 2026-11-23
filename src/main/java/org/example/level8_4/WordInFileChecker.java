package org.example.level8_4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class WordInFileChecker {
    public boolean contains(String path, String word) {
        System.out.println("Введите слово");
        System.out.println(word);

        String text = readText(path);
        boolean found = false;

        for (int i = 0; i + word.length() <= text.length(); i++) {
            boolean match = true;
            for (int j = 0; j < word.length(); j++) {
                if (text.charAt(i + j) != word.charAt(j)) {
                    match = false;
                }
            }
            if (match) {
                boolean leftFree = i == 0 || !Character.isLetterOrDigit(text.charAt(i - 1));
                int after = i + word.length();
                boolean rightFree = after == text.length() || !Character.isLetterOrDigit(text.charAt(after));
                if (leftFree && rightFree) {
                    found = true;
                }
            }
        }

        System.out.println(found);
        return found;
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
