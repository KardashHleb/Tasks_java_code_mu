package org.example.level8_4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

public class TimeAppender {
    public String append(String path) {
        String text = readText(path);
        LocalDateTime now = LocalDateTime.now();
        String moment = now.getYear() + "-" + two(now.getMonthValue()) + "-" + two(now.getDayOfMonth())
                + " " + two(now.getHour()) + ":" + two(now.getMinute()) + ":" + two(now.getSecond());

        if (text.length() > 0 && text.charAt(text.length() - 1) != '\n') {
            text = text + "\n";
        }
        String result = text + moment;

        writeText(path, result);
        System.out.println(result);
        return result;
    }

    private String two(int value) {
        if (value < 10) {
            return "0" + value;
        }
        return "" + value;
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
