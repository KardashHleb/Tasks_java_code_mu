package org.example.level8_9;

import java.io.File;

public class ImagesMover {
    public String[] move(String fromFolder, String toFolder) {
        File source = new File(fromFolder);
        File target = new File(toFolder);
        target.mkdirs();

        int count = countImages(source);
        File[] images = new File[count];
        fill(source, images, new int[]{0});

        String[] moved = new String[count];
        for (int i = 0; i < images.length; i++) {
            String name = images[i].getName();
            File dest = new File(target, name);
            int suffix = 2;
            while (dest.exists()) {
                dest = new File(target, withSuffix(name, suffix));
                suffix = suffix + 1;
            }
            images[i].renameTo(dest);
            moved[i] = dest.getPath();
            System.out.println(moved[i]);
        }
        return moved;
    }

    private int countImages(File folder) {
        File[] children = folder.listFiles();
        if (children == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < children.length; i++) {
            if (children[i].isDirectory()) {
                count = count + countImages(children[i]);
            } else if (children[i].isFile() && isImage(children[i].getName())) {
                count = count + 1;
            }
        }
        return count;
    }

    private void fill(File folder, File[] result, int[] index) {
        File[] children = folder.listFiles();
        if (children == null) {
            return;
        }
        for (int i = 0; i < children.length; i++) {
            if (children[i].isDirectory()) {
                fill(children[i], result, index);
            } else if (children[i].isFile() && isImage(children[i].getName())) {
                result[index[0]] = children[i];
                index[0] = index[0] + 1;
            }
        }
    }

    private boolean isImage(String name) {
        String lower = "";
        for (int i = 0; i < name.length(); i++) {
            lower = lower + Character.toLowerCase(name.charAt(i));
        }
        return lower.endsWith(".jpg") || lower.endsWith(".jpeg") || lower.endsWith(".png")
                || lower.endsWith(".gif") || lower.endsWith(".bmp") || lower.endsWith(".webp");
    }

    private String withSuffix(String name, int suffix) {
        int dot = name.lastIndexOf('.');
        if (dot < 0) {
            return name + "_" + suffix;
        }
        return name.substring(0, dot) + "_" + suffix + name.substring(dot);
    }
}
