package org.example.level1_8;

public class BytesConverter {
    public void convert(long bytes) {
        double kb = (double) bytes / 1024;
        double mb = kb / 1024;
        double gb = mb / 1024;

        System.out.println(gb);
        System.out.println(mb);
        System.out.println(kb);
    }
}
