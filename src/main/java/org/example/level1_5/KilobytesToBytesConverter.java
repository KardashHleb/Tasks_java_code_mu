package org.example.level1_5;

public class KilobytesToBytesConverter {
    public int toBytes(int kb) {
        int bytes = kb * 1024;
        System.out.println(bytes);
        return bytes;
    }
}
