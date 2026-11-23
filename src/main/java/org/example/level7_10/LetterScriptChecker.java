package org.example.level7_10;

public class LetterScriptChecker {
    public String check(char letter) {
        if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')) {
            System.out.println("латиница");
            return "латиница";
        }

        if ((letter >= 'а' && letter <= 'я') || (letter >= 'А' && letter <= 'Я') || letter == 'ё' || letter == 'Ё') {
            System.out.println("кириллица");
            return "кириллица";
        }

        System.out.println("не буква");
        return "не буква";
    }
}
