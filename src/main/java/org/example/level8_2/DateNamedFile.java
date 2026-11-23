package org.example.level8_2;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

public class DateNamedFile {
    public String create(String folder) {
        LocalDate today = LocalDate.now();
        String name = today.getYear() + "-" + two(today.getMonthValue()) + "-" + two(today.getDayOfMonth()) + ".txt";
        File dir = new File(folder);
        dir.mkdirs();
        File file = new File(dir, name);

        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(file.getPath());
        return file.getPath();
    }

    private String two(int value) {
        if (value < 10) {
            return "0" + value;
        }
        return "" + value;
    }
}
