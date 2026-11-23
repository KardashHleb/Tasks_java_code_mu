package org.example.level7_10;

public class LetterCaseChecker {
    public String check(char letter) {
        if (!Character.isLetter(letter)) {
            System.out.println("Не буква");
            return "не буква";
        }

        if (Character.isUpperCase(letter)) {
            System.out.println("Верхний регистр");
            return "верхний";
        }

        System.out.println("Нижний регистр");
        return "нижний";
    }
}
