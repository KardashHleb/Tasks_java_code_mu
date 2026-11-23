package org.example.level8_10;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class FilePathsWriter {
    public String[] write(String folderPath, String target) {
        int count = countFiles(new File(folderPath));
        String[] result = new String[count];
        fill(new File(folderPath), result, new int[]{0});
        sort(result);

        String text = "";
        for (int i = 0; i < result.length; i++) {
            if (i > 0) {
                text = text + "\n";
            }
            text = text + result[i];
            System.out.println(result[i]);
        }
        writeText(target, text);
        return result;
    }

    private int countFiles(File folder) {
        File[] children = folder.listFiles();
        if (children == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < children.length; i++) {
            if (children[i].isDirectory()) {
                count = count + countFiles(children[i]);
            } else if (children[i].isFile()) {
                count = count + 1;
            }
        }
        return count;
    }

    private void fill(File folder, String[] result, int[] index) {
        File[] children = folder.listFiles();
        if (children == null) {
            return;
        }
        for (int i = 0; i < children.length; i++) {
            if (children[i].isDirectory()) {
                fill(children[i], result, index);
            } else if (children[i].isFile()) {
                result[index[0]] = children[i].getPath();
                index[0] = index[0] + 1;
            }
        }
    }

    private void sort(String[] values) {
        for (int i = 0; i < values.length; i++) {
            int min = i;
            for (int j = i + 1; j < values.length; j++) {
                if (values[j].compareTo(values[min]) < 0) {
                    min = j;
                }
            }
            String temp = values[i];
            values[i] = values[min];
            values[min] = temp;
        }
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
