package org.example.level6_8;

public class DashedGroupsString {
    public String make() {
        int[] counts = {1, 2, 3, 3, 5};
        String result = "";

        for (int i = 0; i < counts.length; i++) {
            result = result + "-";
            for (int j = 0; j < counts[i]; j++) {
                result = result + (i + 1);
            }
        }

        result = result + "-";
        System.out.println(result);
        return result;
    }
}
