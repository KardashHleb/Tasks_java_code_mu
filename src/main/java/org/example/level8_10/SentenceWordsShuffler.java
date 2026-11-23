package org.example.level8_10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class SentenceWordsShuffler {
    public String shuffle(String source, String target) {
        String text = readText(source);
        String result = "";
        int start = 0;

        for (int i = 0; i <= text.length(); i++) {
            boolean boundary = i == text.length()
                    || text.charAt(i) == '.'
                    || text.charAt(i) == '!'
                    || text.charAt(i) == '?';
            if (boundary) {
                result = result + mix(text.substring(start, i));
                if (i < text.length()) {
                    result = result + text.charAt(i);
                }
                start = i + 1;
            }
        }

        writeText(target, result);
        System.out.println(result);
        return result;
    }

    private String mix(String sentence) {
        int count = 0;
        boolean inWord = false;
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isLetterOrDigit(sentence.charAt(i))) {
                if (!inWord) {
                    count = count + 1;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }

        String[] words = new String[count];
        int[] starts = new int[count];
        int[] ends = new int[count];
        int index = 0;
        inWord = false;
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isLetterOrDigit(sentence.charAt(i))) {
                if (!inWord) {
                    starts[index] = i;
                    inWord = true;
                }
            } else if (inWord) {
                ends[index] = i;
                words[index] = sentence.substring(starts[index], i);
                index = index + 1;
                inWord = false;
            }
        }
        if (inWord) {
            ends[index] = sentence.length();
            words[index] = sentence.substring(starts[index], sentence.length());
        }

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
        while (i < sentence.length()) {
            if (word < words.length && i == starts[word]) {
                result = result + words[word];
                i = ends[word];
                word = word + 1;
            } else {
                result = result + sentence.charAt(i);
                i = i + 1;
            }
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
