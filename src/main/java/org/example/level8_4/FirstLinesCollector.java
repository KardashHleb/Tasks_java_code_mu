package org.example.level8_4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class FirstLinesCollector {
    public String collect(String folderPath, int count, String target) {
        File folder = new File(folderPath);
        File[] children = folder.listFiles();
        if (children == null) {
            System.out.println("Папка не найдена");
            return "";
        }

        String[] names = new String[children.length];
        int files = 0;
        for (int i = 0; i < children.length; i++) {
            if (children[i].isFile() && isText(children[i].getName())) {
                names[files] = children[i].getName();
                files = files + 1;
            }
        }

        String[] textNames = new String[files];
        for (int i = 0; i < files; i++) {
            textNames[i] = names[i];
        }
        sort(textNames);

        String result = "";
        for (int i = 0; i < textNames.length; i++) {
            if (i > 0) {
                result = result + "\n";
            }
            String[] rows = lines(readText(new File(folder, textNames[i]).getPath()));
            int limit = count;
            if (limit > rows.length) {
                limit = rows.length;
            }
            for (int j = 0; j < limit; j++) {
                if (j > 0) {
                    result = result + "\n";
                }
                result = result + rows[j];
            }
        }

        writeText(target, result);
        System.out.println(result);
        return result;
    }

    private boolean isText(String name) {
        return name.length() >= 4 && name.substring(name.length() - 4).equalsIgnoreCase(".txt");
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

    private String[] lines(String text) {
        if (text.length() == 0) {
            return new String[0];
        }
        int count = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '\n') {
                count = count + 1;
            }
        }
        if (text.charAt(text.length() - 1) == '\n') {
            count = count - 1;
        }
        String[] result = new String[count];
        String line = "";
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '\n') {
                if (index < result.length) {
                    result[index] = line;
                    index = index + 1;
                }
                line = "";
            } else {
                line = line + text.charAt(i);
            }
        }
        if (index < result.length) {
            result[index] = line;
        }
        return result;
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
