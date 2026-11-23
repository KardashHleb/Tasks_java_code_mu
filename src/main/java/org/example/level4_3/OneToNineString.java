package org.example.level4_3;

public class OneToNineString {
    public String make() {
        String result = "";

        for (int i = 1; i <= 9; i++) {
            result = result + i;
        }

        System.out.println(result);
        return result;
    }
}
