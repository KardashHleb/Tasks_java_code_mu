package org.example.level4_8;

public class CharPairsMerger {
    public String[] merge(char[] arr) {
        String[] result = new String[arr.length / 2];

        for (int i = 0; i < result.length; i++) {
            result[i] = "" + arr[i * 2] + arr[i * 2 + 1];
            System.out.println(result[i]);
        }

        return result;
    }
}
