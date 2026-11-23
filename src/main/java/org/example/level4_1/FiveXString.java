package org.example.level4_1;

public class FiveXString {
    public String make() {
        String result = "";

        for (int i = 0; i < 5; i++) {
            result = result + "x";
        }

        System.out.println(result);
        return result;
    }
}
