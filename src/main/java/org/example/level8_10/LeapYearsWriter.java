package org.example.level8_10;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;

public class LeapYearsWriter {
    public int[] write(String path) {
        int current = LocalDate.now().getYear();
        int from = current - 100;
        int to = current - 1;
        int count = 0;

        for (int year = from; year <= to; year++) {
            if (isLeap(year)) {
                count = count + 1;
            }
        }

        int[] years = new int[count];
        int index = 0;
        String text = "";
        for (int year = from; year <= to; year++) {
            if (isLeap(year)) {
                years[index] = year;
                if (index > 0) {
                    text = text + "\n";
                }
                text = text + year;
                System.out.println(year);
                index = index + 1;
            }
        }

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

        return years;
    }

    private boolean isLeap(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;
    }
}
