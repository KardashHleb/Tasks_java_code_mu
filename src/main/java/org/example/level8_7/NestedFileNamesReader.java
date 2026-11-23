package org.example.level8_7;

import java.io.File;

public class NestedFileNamesReader {
    public String[] names(String folderPath) {
        File folder = new File(folderPath);
        int count = countFiles(folder);
        String[] result = new String[count];
        fill(folder, result, new int[]{0});
        sort(result);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
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
                result[index[0]] = children[i].getName();
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
}
