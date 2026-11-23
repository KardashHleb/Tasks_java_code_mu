package org.example.level8_8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class UniqueWordsWriter {
    public String write(String source, String target) {
        String text = readText(source);
        int count = countWords(text);
        String[] words = new String[count];
        fillWords(text, words);

        int uniqueCount = 0;
        String[] unique = new String[count];
        for (int i = 0; i < words.length; i++) {
            boolean seen = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (unique[j].equals(words[i])) {
                    seen = true;
                }
            }
            if (!seen) {
                unique[uniqueCount] = words[i];
                uniqueCount = uniqueCount + 1;
            }
        }

        String result = "";
        int inRow = 0;
        for (int i = 0; i < uniqueCount; i++) {
            if (inRow == 10) {
                result = result + "\n";
                inRow = 0;
            } else if (inRow > 0) {
                result = result + " ";
            }
            result = result + unique[i];
            inRow = inRow + 1;
        }

        writeText(target, result);
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
        if (word.length() > 0) {
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
