package org.example.level8_9;

import java.io.File;

public class NestedFilesCounter {
    public int count(String folderPath) {
        int result = countFiles(new File(folderPath));
        System.out.println(result);
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
}
