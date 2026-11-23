package org.example.level8_7;

import java.io.File;

public class SubfolderNamesReader {
    public String[] names(String folderPath) {
        File folder = new File(folderPath);
        File[] children = folder.listFiles();
        if (children == null) {
            System.out.println("Папка не найдена");
            return new String[0];
        }

        int count = 0;
        for (int i = 0; i < children.length; i++) {
            if (children[i].isDirectory()) {
                count = count + 1;
            }
        }

        String[] result = new String[count];
        int index = 0;
        for (int i = 0; i < children.length; i++) {
            if (children[i].isDirectory()) {
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
