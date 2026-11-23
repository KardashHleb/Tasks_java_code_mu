package org.example.level4_6;

public class CountdownString {
    public String make() {
        String result = "";

        for (int i = 5; i >= 1; i--) {
            result = result + i;
        }

        System.out.println(result);
        return result;
    }
}
