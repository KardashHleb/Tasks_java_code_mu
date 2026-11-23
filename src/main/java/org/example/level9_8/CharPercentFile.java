package org.example.level9_8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class CharPercentFile {
    public String write(String source, String target) {
        String text = readText(source);
        String chars = "";
        int[] counts = new int[text.length() + 1];

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            int place = -1;
            for (int j = 0; j < chars.length(); j++) {
                if (chars.charAt(j) == current) {
                    place = j;
                }
            }
            if (place < 0) {
                chars = chars + current;
                counts[chars.length() - 1] = 1;
            } else {
                counts[place] = counts[place] + 1;
            }
        }

        String result = "";
        for (int i = 0; i < chars.length(); i++) {
            if (i > 0) {
                result = result + "\n";
            }
            int scaled = 0;
            if (text.length() > 0) {
                scaled = counts[i] * 1000 / text.length();
            }
            result = result + show(chars.charAt(i)) + " " + (scaled / 10) + "." + (scaled % 10) + "%";
        }

        writeText(target, result);
        System.out.println(result);
        return result;
    }

    private String show(char current) {
        if (current == ' ') {
            return "пробел";
        }
        if (current == '\n') {
            return "\\n";
        }
        return "" + current;
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
