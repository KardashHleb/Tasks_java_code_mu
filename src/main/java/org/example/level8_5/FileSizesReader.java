package org.example.level8_5;

import java.io.File;

public class FileSizesReader {
    public long[] sizes(String folderPath) {
        File folder = new File(folderPath);
        File[] children = folder.listFiles();
        if (children == null) {
            System.out.println("Папка не найдена");
            return new long[0];
        }

        int count = 0;
        for (int i = 0; i < children.length; i++) {
            if (children[i].isFile()) {
                count = count + 1;
            }
        }

        String[] names = new String[count];
        long[] result = new long[count];
        int index = 0;
        for (int i = 0; i < children.length; i++) {
            if (children[i].isFile()) {
                names[index] = children[i].getName();
                result[index] = children[i].length();
                index = index + 1;
            }
        }

        for (int i = 0; i < names.length; i++) {
            int min = i;
            for (int j = i + 1; j < names.length; j++) {
                if (names[j].compareTo(names[min]) < 0) {
                    min = j;
                }
            }
            String name = names[i];
            names[i] = names[min];
            names[min] = name;
            long size = result[i];
            result[i] = result[min];
            result[min] = size;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(names[i] + " " + result[i]);
        }
        return result;
    }
}
