package org.example.level5_9;

public class ArrayToLines {
    public String join(String[] arr) {
        String result = "";

        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                result = result + "\n";
            }
            result = result + arr[i];
        }

        System.out.println(result);
        return result;
    }
}
