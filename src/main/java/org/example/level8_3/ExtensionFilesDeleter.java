package org.example.level8_3;

import java.io.File;

public class ExtensionFilesDeleter {
    public String[] delete(String folderPath, String extension) {
        String suffix = extension;
        if (suffix.length() > 0 && suffix.charAt(0) != '.') {
            suffix = "." + suffix;
        }

        File folder = new File(folderPath);
        File[] children = folder.listFiles();
        if (children == null) {
            System.out.println("Папка не найдена");
            return new String[0];
        }

        int count = 0;
        for (int i = 0; i < children.length; i++) {
            if (children[i].isFile() && endsWith(children[i].getName(), suffix)) {
                count = count + 1;
            }
        }

        String[] deleted = new String[count];
        int index = 0;
        for (int i = 0; i < children.length; i++) {
            if (children[i].isFile() && endsWith(children[i].getName(), suffix)) {
                String name = children[i].getName();
                children[i].delete();
                deleted[index] = name;
                System.out.println(deleted[index]);
                index = index + 1;
            }
        }

        return deleted;
    }

    private boolean endsWith(String name, String suffix) {
        if (name.length() < suffix.length()) {
            return false;
        }
        String ending = name.substring(name.length() - suffix.length());
        return ending.equalsIgnoreCase(suffix);
    }
}
