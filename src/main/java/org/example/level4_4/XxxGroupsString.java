package org.example.level4_4;

public class XxxGroupsString {
    public String make() {
        String result = "";

        for (int group = 0; group < 3; group++) {
            if (group > 0) {
                result = result + " ";
            }
            result = result + "xxx";
        }

        System.out.println(result);
        return result;
    }
}
