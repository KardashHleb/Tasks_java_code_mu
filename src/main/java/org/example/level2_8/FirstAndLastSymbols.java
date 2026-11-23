package org.example.level2_8;

public class FirstAndLastSymbols {
    public String mergeFirstAndLast(String str) {
        String result = "" + str.charAt(0) + str.charAt(str.length() - 1);
        System.out.println(result);
        return result;
    }
}
