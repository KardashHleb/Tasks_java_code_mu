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
import org.example.level1_3.DivisionRemainder;
import org.example.level1_3.NumbersFromOneToHundred;
import org.example.level1_3.PenultimateCharShower;
import org.example.level1_3.SeasonDeterminer;
import org.example.level1_4.EvenNumbersFromOneToHundred;
import org.example.level1_4.HourQuarterDeterminer;
import org.example.level1_4.ReverseCharsShower;
import org.example.level1_5.CharsToStringMerger;
import org.example.level1_5.DivisibleWithoutRemainderChecker;
import org.example.level1_5.KilobytesToBytesConverter;
import org.example.level1_5.MultiplesOfThreeFromOneToHundred;
import org.example.level1_6.DigitCharsSummer;
import org.example.level1_6.MegabytesToBytesConverter;
import org.example.level1_6.SumFromOneToHundred;
import org.example.level1_7.DigitsSumFinder;
import org.example.level1_7.GigabytesConverter;
import org.example.level1_7.NumberReverser;
import org.example.level1_7.NumberStringsSummer;
import org.example.level1_7.OddSumFromOneToHundred;
import org.example.level1_7.PowersOfTwoShower;
import org.example.level1_8.BytesConverter;
import org.example.level1_8.CharsFromEndShower;
import org.example.level1_8.NumbersFromHundredToOne;
import org.example.level1_9.DigitCharsToNumberMerger;
import org.example.level1_9.LastAndFirstLetterChecker;
import org.example.level1_9.NumbersFromMinusHundredToZero;
import org.example.level1_9.SecondsInDayFinder;
import org.example.level1_10.DivideUntilLessThanTen;
import org.example.level1_10.DivisorsShower;
import org.example.level1_10.EvenSumFromOneToHundred;
import org.example.level1_10.SecondsInYearFinder;

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

        NumbersFromOneToHundred numbers = new NumbersFromOneToHundred();
        numbers.printNumbers();

        PenultimateCharShower penultimateChar = new PenultimateCharShower();
        penultimateChar.showPenultimateChar("привет");
        penultimateChar.showPenultimateChar("я");

        DivisionRemainder remainder = new DivisionRemainder();
        remainder.findRemainder(10, 3);
        remainder.findRemainder(20, 5);

        SeasonDeterminer season = new SeasonDeterminer();
        season.determineSeason((byte) 1);
        season.determineSeason((byte) 4);
        season.determineSeason((byte) 7);
        season.determineSeason((byte) 10);

        EvenNumbersFromOneToHundred evenNumbers = new EvenNumbersFromOneToHundred();
        evenNumbers.printEvenNumbers();

        ReverseCharsShower reverseChars = new ReverseCharsShower();
        reverseChars.showCharsFromEnd("abcde");

        HourQuarterDeterminer quarter = new HourQuarterDeterminer();
        quarter.determineQuarter((byte) 30);
        quarter.determineQuarter((byte) 10);
        quarter.determineQuarter((byte) 40);
        quarter.determineQuarter((byte) 55);

        MultiplesOfThreeFromOneToHundred multiplesOfThree = new MultiplesOfThreeFromOneToHundred();
        multiplesOfThree.printMultiplesOfThree();

        DivisibleWithoutRemainderChecker divisibleChecker = new DivisibleWithoutRemainderChecker();
        divisibleChecker.dividesWithoutRemainder(10, 5);
        divisibleChecker.dividesWithoutRemainder(10, 3);

        CharsToStringMerger charsMerger = new CharsToStringMerger();
        charsMerger.mergeChars('a', 'b', 'c');

        KilobytesToBytesConverter kbConverter = new KilobytesToBytesConverter();
        kbConverter.toBytes(35);

        SumFromOneToHundred sumFromOneToHundred = new SumFromOneToHundred();
        sumFromOneToHundred.calculateSum();

        DigitCharsSummer digitCharsSummer = new DigitCharsSummer();
        digitCharsSummer.sumDigitChars('1', '2', '3');

        MegabytesToBytesConverter mbConverter = new MegabytesToBytesConverter();
        mbConverter.toBytes(35);

        OddSumFromOneToHundred oddSum = new OddSumFromOneToHundred();
        oddSum.calculateOddSum();

        PowersOfTwoShower powersOfTwo = new PowersOfTwoShower();
        powersOfTwo.printPowersOfTwo(5);

        NumberStringsSummer numberStringsSummer = new NumberStringsSummer();
        numberStringsSummer.sumNumberStrings("123", "456", "789");

        NumberReverser numberReverser = new NumberReverser();
        numberReverser.reverse(12345);

        DigitsSumFinder digitsSumFinder = new DigitsSumFinder();
        digitsSumFinder.sumDigits(12345);

        GigabytesConverter gbConverter = new GigabytesConverter();
        gbConverter.convert(35.24f);

        NumbersFromHundredToOne numbersFromHundred = new NumbersFromHundredToOne();
        numbersFromHundred.printNumbers();

        CharsFromEndShower charsFromEnd = new CharsFromEndShower();
        charsFromEnd.showCharsFromEnd("abcde");

        BytesConverter bytesConverter = new BytesConverter();
        bytesConverter.convert(3535645778L);

        LastAndFirstLetterChecker lastAndFirstChecker = new LastAndFirstLetterChecker();
        lastAndFirstChecker.sameLastAndFirstLetter("кот", "торт");
        lastAndFirstChecker.sameLastAndFirstLetter("дом", "кот");

        SecondsInDayFinder secondsInDay = new SecondsInDayFinder();
        secondsInDay.countSeconds();

        NumbersFromMinusHundredToZero numbersToZero = new NumbersFromMinusHundredToZero();
        numbersToZero.printNumbers();

        DigitCharsToNumberMerger digitCharsToNumber = new DigitCharsToNumberMerger();
        digitCharsToNumber.mergeToNumber('1', '2', '3');

        EvenSumFromOneToHundred evenSum = new EvenSumFromOneToHundred();
        evenSum.calculateEvenSum();

        SecondsInYearFinder secondsInYear = new SecondsInYearFinder();
        secondsInYear.countSeconds();

        DivisorsShower divisorsShower = new DivisorsShower();
        divisorsShower.printDivisors(12);

        DivideUntilLessThanTen divideUntilTen = new DivideUntilLessThanTen();
        divideUntilTen.countIterations(12345);
    }
}
