package org.example.level3_6;

public class HtmlStringsFilter {
    public String[] keepHtml(String[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].endsWith(".html")) {
                count = count + 1;
            }
        }

        String[] result = new String[count];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].endsWith(".html")) {
                result[index] = arr[i];
                System.out.println(result[index]);
                index = index + 1;
            }
        }

        return result;
    }
}
