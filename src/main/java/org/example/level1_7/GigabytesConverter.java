package org.example.level1_7;

public class GigabytesConverter {
    public void convert(float gb) {
        double mb = gb * 1024;
        double kb = mb * 1024;
        double bytes = kb * 1024;

        System.out.println(mb);
        System.out.println(kb);
        System.out.println(bytes);
    }
}
