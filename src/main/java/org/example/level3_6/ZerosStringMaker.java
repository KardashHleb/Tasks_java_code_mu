package org.example.level3_6;

public class ZerosStringMaker {
    public String makeZeros(int count) {
        String result = "";

        for (int i = 0; i < count; i++) {
            result = result + "0";
        }

        System.out.println(result);
        return result;
    }
}
