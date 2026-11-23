package org.example.level8_3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class ArrayLineWriter {
    public String write(int[] values, String path) {
        String result = "";

        for (int i = 0; i < values.length; i++) {
            if (i > 0) {
                result = result + "\n";
            }
            result = result + values[i];
            System.out.println(values[i]);
        }

        try {
            File file = new File(path);
            File parent = file.getParentFile();
            if (parent != null) {
                parent.mkdirs();
            }
            try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8)) {
                writer.write(result);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return result;
    }
}
