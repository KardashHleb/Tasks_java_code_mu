package org.example.level3_2;

public class HttpStringsShower {
    public void printHttp(String[] arr) {
        String prefix = "http://";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].startsWith(prefix)) {
                System.out.println(arr[i]);
            }
        }
    }
}
