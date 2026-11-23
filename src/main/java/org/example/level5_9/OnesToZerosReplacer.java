package org.example.level5_9;

public class OnesToZerosReplacer {
    public String[] replace(String[] arr) {
        String[] result = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            String replaced = "";
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == '1') {
                    replaced = replaced + "0";
                } else {
                    replaced = replaced + arr[i].charAt(j);
                }
            }
            result[i] = replaced;
            System.out.println(result[i]);
        }

        return result;
    }
}
