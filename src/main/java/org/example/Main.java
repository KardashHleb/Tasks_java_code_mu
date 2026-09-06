package org.example;

import org.example.level1_1.EvenNumberChecker;
import org.example.level1_1.FirstTwoLettersChecker;
import org.example.level1_1.LastCharShower;
import org.example.level1_1.NegativeNumberChecker;
import org.example.level1_1.StringLengthShower;
import org.example.level1_2.DigitAmaount;
import org.example.level1_2.FirstDigitShower;
import org.example.level1_2.FirstDigitsChecker;
import org.example.level1_2.LastDigitShower;
import org.example.level1_2.SummFirstAndLast;

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

        FirstDigitShower firstDigit = new FirstDigitShower();
        firstDigit.showFirstDigit(12345);
        firstDigit.showFirstDigit(-567);

        LastDigitShower lastDigit = new LastDigitShower();
        lastDigit.showLastDigit(12345);
        lastDigit.showLastDigit(-567);

        SummFirstAndLast summFirstAndLast = new SummFirstAndLast();
        summFirstAndLast.sumFirstAndLast(12345);
        summFirstAndLast.sumFirstAndLast(-567);

        DigitAmaount digitAmount = new DigitAmaount();
        digitAmount.countDigits(12345);
        digitAmount.countDigits(-567);

        FirstDigitsChecker firstDigitsChecker = new FirstDigitsChecker();
        firstDigitsChecker.sameFirstDigits(123, 156);
        firstDigitsChecker.sameFirstDigits(89, 12);
    }
}
