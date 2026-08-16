package org.example;

import org.example.level1_1.EvenNumberChecker;
import org.example.level1_1.FirstTwoLettersChecker;
import org.example.level1_1.LastCharShower;
import org.example.level1_1.NegativeNumberChecker;
import org.example.level1_1.StringLengthShower;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NegativeNumberChecker checker = new NegativeNumberChecker();
        checker.isNegativer(-22);
        StringLengthShower showLength = new StringLengthShower();
        showLength.lengthShower("привет, как дела?");
        LastCharShower lastChar = new LastCharShower();
        lastChar.showLastChar("привет, как дела?");

        EvenNumberChecker evenChecker = new EvenNumberChecker();
        evenChecker.isEven(-22);

        FirstTwoLettersChecker lettersChecker = new FirstTwoLettersChecker();
        lettersChecker.sameFirstTwoLetters("привет", "приветик");
        lettersChecker.sameFirstTwoLetters("кот", "дом");
    }
}
