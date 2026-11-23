package org.example.level8_4;

import java.io.File;
import java.io.IOException;

public class NamedFilesCreator {
    public String[] create(String folderPath, String[] names) {
        File folder = new File(folderPath);
        folder.mkdirs();
        String[] created = new String[names.length];

        for (int i = 0; i < names.length; i++) {
            File file = new File(folder, names[i]);
            File parent = file.getParentFile();
            if (parent != null) {
                parent.mkdirs();
            }
            try {
                file.createNewFile();
                created[i] = file.getPath();
            } catch (IOException e) {
                System.out.println(e.getMessage());
                created[i] = "";
            }
            System.out.println(created[i]);
        }

        return created;
    }
}
