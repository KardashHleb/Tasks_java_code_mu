package org.example.level8_8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class WordsShuffler {
    public String shuffle(String path) {
        String text = readText(path);
        int count = countWords(text);
        String[] words = new String[count];
        int[] starts = new int[count];
        int[] ends = new int[count];
        collect(text, words, starts, ends);

        Random random = new Random();
        for (int i = words.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
        }

        String result = "";
        int word = 0;
        int i = 0;
        while (i < text.length()) {
            if (word < words.length && i == starts[word]) {
                result = result + words[word];
                i = ends[word];
                word = word + 1;
            } else {
                result = result + text.charAt(i);
                i = i + 1;
            }
        }

        writeText(path, result);
        System.out.println(result);
        return result;
    }

    private int countWords(String text) {
        int count = 0;
        boolean inWord = false;
        for (int i = 0; i < text.length(); i++) {
            if (isWordChar(text.charAt(i))) {
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

    private void collect(String text, String[] words, int[] starts, int[] ends) {
        int index = 0;
        boolean inWord = false;
        for (int i = 0; i < text.length(); i++) {
            if (isWordChar(text.charAt(i))) {
                if (!inWord) {
                    starts[index] = i;
                    inWord = true;
                }
            } else if (inWord) {
                ends[index] = i;
                words[index] = text.substring(starts[index], ends[index]);
                index = index + 1;
                inWord = false;
            }
        }
        if (inWord) {
            ends[index] = text.length();
            words[index] = text.substring(starts[index], ends[index]);
        }
    }

    private boolean isWordChar(char current) {
        return Character.isLetterOrDigit(current);
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

    private void writeText(String path, String text) {
        try {
            File file = new File(path);
            File parent = file.getParentFile();
            if (parent != null) {
                parent.mkdirs();
            }
            try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8)) {
                writer.write(text);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
