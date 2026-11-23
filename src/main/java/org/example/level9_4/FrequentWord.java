package org.example.level9_4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class FrequentWord {
    public String find(String path) {
        String text = readText(path);
        int count = countWords(text);
        String[] words = new String[count];
        fillWords(text, words);

        String result = "";
        int best = 0;
        for (int i = 0; i < words.length; i++) {
            int times = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    times = times + 1;
                }
            }
            if (times > best) {
                best = times;
                result = words[i];
            }
        }

        System.out.println(result);
        return result;
    }

    private int countWords(String text) {
        int count = 0;
        boolean inWord = false;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetterOrDigit(text.charAt(i))) {
                if (!inWord) {
                    count = count + 1;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }
        return count;
    }

    private void fillWords(String text, String[] words) {
        int index = 0;
        String word = "";
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetterOrDigit(text.charAt(i))) {
                word = word + text.charAt(i);
            } else if (word.length() > 0) {
                words[index] = word;
                index = index + 1;
                word = "";
            }
        }
        if (word.length() > 0 && index < words.length) {
            words[index] = word;
        }
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
