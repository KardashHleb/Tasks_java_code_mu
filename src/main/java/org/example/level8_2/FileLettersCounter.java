package org.example.level8_2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class FileLettersCounter {
    public int count(String path) {
        int result = 0;

        try (InputStreamReader reader = new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8)) {
            int ch = reader.read();
            while (ch != -1) {
                if (Character.isLetter((char) ch)) {
                    result = result + 1;
                }
                ch = reader.read();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(result);
        return result;
    }
}
