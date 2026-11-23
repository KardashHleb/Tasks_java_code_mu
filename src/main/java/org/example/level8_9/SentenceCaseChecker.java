package org.example.level8_9;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class SentenceCaseChecker {
    public boolean check(String path) {
        String text = readText(path);
        boolean expect = true;
        boolean ok = true;

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            if (expect) {
                if (current == ' ' || current == '\n' || current == '\t') {
                    continue;
                }
                if (Character.isLetter(current)) {
                    if (!Character.isUpperCase(current)) {
                        ok = false;
                    }
                    expect = false;
                }
            } else if (current == '.' || current == '!' || current == '?') {
                expect = true;
            }
        }

        System.out.println(ok);
        return ok;
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
