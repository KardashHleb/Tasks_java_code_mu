package org.example.level8_10;

import java.io.File;

public class FolderRemover {
    public boolean remove(String folderPath) {
        File folder = new File(folderPath);
        if (!folder.isDirectory()) {
            System.out.println("Папка не найдена");
            return false;
        }
        if (folder.getParentFile() == null) {
            System.out.println("Нельзя удалить корень диска");
            return false;
        }

        boolean removed = removeAll(folder);
        System.out.println(removed);
        System.out.println(folder.getPath());
        return removed;
    }

    private boolean removeAll(File file) {
        if (file.isDirectory()) {
            File[] children = file.listFiles();
            if (children != null) {
                for (int i = 0; i < children.length; i++) {
                    removeAll(children[i]);
                }
            }
        }
        return file.delete();
    }
}
