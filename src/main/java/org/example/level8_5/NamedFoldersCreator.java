package org.example.level8_5;

import java.io.File;

public class NamedFoldersCreator {
    public String[] create(String folderPath, String[] names) {
        File folder = new File(folderPath);
        folder.mkdirs();
        String[] created = new String[names.length];

        for (int i = 0; i < names.length; i++) {
            File dir = new File(folder, names[i]);
            dir.mkdirs();
            created[i] = dir.getPath();
            System.out.println(created[i]);
        }

        return created;
    }
}
