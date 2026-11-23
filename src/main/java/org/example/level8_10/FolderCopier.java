package org.example.level8_10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FolderCopier {
    public String copy(String sourcePath, String targetPath) {
        File source = new File(sourcePath);
        File target = new File(targetPath);
        if (!source.isDirectory()) {
            System.out.println("Папка не найдена");
            return "";
        }
        copyAll(source, target);
        System.out.println(target.getPath());
        return target.getPath();
    }

    private void copyAll(File source, File target) {
        if (source.isDirectory()) {
            target.mkdirs();
            File[] children = source.listFiles();
            if (children != null) {
                for (int i = 0; i < children.length; i++) {
                    copyAll(children[i], new File(target, children[i].getName()));
                }
            }
        } else if (source.isFile()) {
            File parent = target.getParentFile();
            if (parent != null) {
                parent.mkdirs();
            }
            try (InputStream input = new FileInputStream(source);
                 OutputStream output = new FileOutputStream(target)) {
                byte[] buffer = new byte[1024];
                int read = input.read(buffer);
                while (read != -1) {
                    output.write(buffer, 0, read);
                    read = input.read(buffer);
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
