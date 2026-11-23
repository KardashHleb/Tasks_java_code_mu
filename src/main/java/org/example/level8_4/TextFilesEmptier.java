package org.example.level8_4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class TextFilesEmptier {
    public String[] clear(String folderPath) {
        File folder = new File(folderPath);
        File[] children = folder.listFiles();
        if (children == null) {
            System.out.println("Папка не найдена");
            return new String[0];
        }

        int count = 0;
        for (int i = 0; i < children.length; i++) {
            if (children[i].isFile() && isText(children[i].getName())) {
                count = count + 1;
            }
        }

        String[] cleared = new String[count];
        int index = 0;
        for (int i = 0; i < children.length; i++) {
            if (children[i].isFile() && isText(children[i].getName())) {
                writeEmpty(children[i]);
                cleared[index] = children[i].getName();
                System.out.println(cleared[index]);
                index = index + 1;
            }
        }
        return cleared;
    }

    private boolean isText(String name) {
        return name.length() >= 4 && name.substring(name.length() - 4).equalsIgnoreCase(".txt");
    }

    private void writeEmpty(File file) {
        try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8)) {
            writer.write("");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
