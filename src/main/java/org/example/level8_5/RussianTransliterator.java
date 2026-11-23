package org.example.level8_5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class RussianTransliterator {
    public String translit(String source, String target) {
        String text = readText(source);
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            result = result + latin(text.charAt(i));
        }

        writeText(target, result);
        System.out.println(result);
        return result;
    }

    private String latin(char letter) {
        String lower = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        String[] map = {
                "a", "b", "v", "g", "d", "e", "yo", "zh", "z", "i",
                "y", "k", "l", "m", "n", "o", "p", "r", "s", "t",
                "u", "f", "h", "ts", "ch", "sh", "sch", "", "y", "",
                "e", "yu", "ya"
        };
        char current = Character.toLowerCase(letter);
        for (int i = 0; i < lower.length(); i++) {
            if (lower.charAt(i) == current) {
                String value = map[i];
                if (value.length() > 0 && Character.isUpperCase(letter)) {
                    value = Character.toUpperCase(value.charAt(0)) + value.substring(1);
                }
                return value;
            }
        }
        return "" + letter;
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
