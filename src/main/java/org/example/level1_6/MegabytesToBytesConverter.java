package org.example.level1_6;

public class MegabytesToBytesConverter {
    public int toBytes(int mb) {
        int bytes = mb * 1024 * 1024;
        System.out.println(bytes);
        return bytes;
    }
}
