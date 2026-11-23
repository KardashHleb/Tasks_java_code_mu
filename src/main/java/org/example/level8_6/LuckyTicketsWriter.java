package org.example.level8_6;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class LuckyTicketsWriter {
    public int write(String path) {
        int count = 0;

        try {
            File file = new File(path);
            File parent = file.getParentFile();
            if (parent != null) {
                parent.mkdirs();
            }
            try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8)) {
                for (int number = 0; number <= 999999; number++) {
                    int left = number / 1000;
                    int right = number % 1000;
                    if (digitSum(left) == digitSum(right)) {
                        writer.write(ticket(number));
                        writer.write("\n");
                        count = count + 1;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(count);
        System.out.println(path);
        return count;
    }

    private int digitSum(int value) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum = sum + value % 10;
            value = value / 10;
        }
        return sum;
    }

    private String ticket(int number) {
        String result = "" + number;
        while (result.length() < 6) {
            result = "0" + result;
        }
        return result;
    }
}
