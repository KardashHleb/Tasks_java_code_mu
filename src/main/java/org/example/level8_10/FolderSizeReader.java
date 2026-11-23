package org.example.level8_10;

import java.io.File;

public class FolderSizeReader {
    public long size(String folderPath) {
        long result = sizeOf(new File(folderPath));
        System.out.println(result);
        return result;
    }

    private long sizeOf(File folder) {
        File[] children = folder.listFiles();
        if (children == null) {
            if (folder.isFile()) {
                return folder.length();
            }
            return 0;
        }
        long sum = 0;
        for (int i = 0; i < children.length; i++) {
            if (children[i].isDirectory()) {
                sum = sum + sizeOf(children[i]);
            } else if (children[i].isFile()) {
                sum = sum + children[i].length();
            }
        }
        return sum;
    }
}
