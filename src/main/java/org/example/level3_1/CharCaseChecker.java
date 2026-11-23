package org.example.level3_1;

public class CharCaseChecker {
    public String checkCase(char chr) {
        if (Character.isLowerCase(chr)) {
            System.out.println("Нижний регистр");
            return "Нижний регистр";
        } else if (Character.isUpperCase(chr)) {
            System.out.println("Верхний регистр");
            return "Верхний регистр";
        } else {
            System.out.println("Не буква");
            return "Не буква";
        }
    }
}
