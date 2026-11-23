package org.example.level3_10;

public class FloatPartsSplitter {
    public void split(float number) {
        int whole = (int) number;
        int fraction = Math.round((number - whole) * 100);

        System.out.println(whole);
        System.out.println(fraction);
    }
}
