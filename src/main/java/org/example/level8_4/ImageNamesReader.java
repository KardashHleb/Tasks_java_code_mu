package org.example.level8_4;

import java.io.File;

public class ImageNamesReader {
    public String[] names(String folderPath) {
        File folder = new File(folderPath);
        File[] children = folder.listFiles();
        if (children == null) {
            System.out.println("Папка не найдена");
            return new String[0];
        }

        int count = 0;
        for (int i = 0; i < children.length; i++) {
            if (children[i].isFile() && isImage(children[i].getName())) {
                count = count + 1;
            }
        }

        String[] result = new String[count];
        int index = 0;
        for (int i = 0; i < children.length; i++) {
            if (children[i].isFile() && isImage(children[i].getName())) {
                result[index] = children[i].getName();
                index = index + 1;
            }
        }

        sort(result);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        return result;
    }

    private boolean isImage(String name) {
        String lower = "";
        for (int i = 0; i < name.length(); i++) {
            lower = lower + Character.toLowerCase(name.charAt(i));
        }
        return lower.endsWith(".jpg") || lower.endsWith(".jpeg") || lower.endsWith(".png")
                || lower.endsWith(".gif") || lower.endsWith(".bmp") || lower.endsWith(".webp");
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
}
