package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NegativeNumberChecker checker = new org.example.NegativeNumberChecker();
        checker.isNegativer(-22);
        StringLengthShower showLength = new org.example.StringLengthShower();
        showLength.lengthShower("привет, как дела?");
        LastCharShower lastChar = new org.example.LastCharShower();
        lastChar.showLastChar("привет, как дела?");

        EvenNumberChecker evenChecker = new org.example.EvenNumberChecker();
        evenChecker.isEven(-22);

        FirstTwoLettersChecker lettersChecker = new org.example.FirstTwoLettersChecker();
        lettersChecker.sameFirstTwoLetters("привет", "приветик");
        lettersChecker.sameFirstTwoLetters("кот", "дом");
    }
}