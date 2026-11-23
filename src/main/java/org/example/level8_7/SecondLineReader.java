package org.example.level8_7;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class SecondLineReader {
    public String read(String path) {
        String result = "";
        int line = 1;
        boolean done = false;
        boolean started = false;

        try (InputStreamReader reader = new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8)) {
            int ch = reader.read();
            while (ch != -1 && !done) {
                if (ch == '\n') {
                    if (line == 2) {
                        done = true;
                    } else {
                        line = line + 1;
                    }
                } else if (ch != '\r' && line == 2) {
                    result = result + (char) ch;
                    started = true;
                }
                ch = reader.read();
            }
            if (!started && line < 2) {
                result = "";
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(result);
        return result;
    }
}
