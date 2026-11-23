package org.example.level2_7;

public class ArrayToStringMerger {
    public String merge(int[] arr) {
        String result = "";

        for (int i = 0; i < arr.length; i++) {
            result = result + arr[i];
        }

        System.out.println(result);
        return result;
    }
}
