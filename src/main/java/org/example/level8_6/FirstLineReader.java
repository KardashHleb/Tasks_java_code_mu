package org.example.level8_6;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class FirstLineReader {
    public String read(String path) {
        String result = "";
        boolean done = false;

        try (InputStreamReader reader = new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8)) {
            int ch = reader.read();
            while (ch != -1 && !done) {
                if (ch == '\n') {
                    done = true;
                } else if (ch != '\r') {
                    result = result + (char) ch;
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
