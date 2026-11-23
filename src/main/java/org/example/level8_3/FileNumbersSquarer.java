package org.example.level8_3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class FileNumbersSquarer {
    public String square(String path) {
        String text = readText(path);
        String result = "";
        int i = 0;

        while (i < text.length()) {
            if (isDigit(text.charAt(i))) {
                int value = 0;
                while (i < text.length() && isDigit(text.charAt(i))) {
                    value = value * 10 + (text.charAt(i) - '0');
                    i = i + 1;
                }
                long squared = (long) value * value;
                result = result + squared;
            } else {
                result = result + text.charAt(i);
                i = i + 1;
            }
        }

        writeText(path, result);
        System.out.println(result);
        return result;
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
