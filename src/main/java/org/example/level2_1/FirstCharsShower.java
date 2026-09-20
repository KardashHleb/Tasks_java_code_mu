package org.example.level2_1;

public class FirstCharsShower {
    public void printFirstChars(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            char firstChar = arr[i].charAt(0);
            System.out.println(firstChar);
        }
    }
}
