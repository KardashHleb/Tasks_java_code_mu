package org.example.level9_6;

public class NumberInWords {
    public String words(int number) {
        int value = number;
        if (value < 0) {
            value = -value;
        }

        String result;
        if (value == 0) {
            result = "ноль";
        } else if (value > 999) {
            result = "только до 999";
        } else {
            result = "";
            int hundreds = value / 100;
            int rest = value % 100;
            if (hundreds > 0) {
                result = hundreds(hundreds);
            }
            if (rest > 0) {
                if (result.length() > 0) {
                    result = result + " ";
                }
                if (rest < 20) {
                    result = result + underTwenty(rest);
                } else {
                    result = result + tens(rest / 10);
                    if (rest % 10 > 0) {
                        result = result + " " + underTwenty(rest % 10);
                    }
                }
            }
        }

        if (number < 0 && value != 0 && value <= 999) {
            result = "минус " + result;
        }
        System.out.println(result);
        return result;
    }

    private String underTwenty(int value) {
        String[] words = {
                "", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять",
                "десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать",
                "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"
        };
        return words[value];
    }

    private String tens(int value) {
        String[] words = {
                "", "", "двадцать", "тридцать", "сорок", "пятьдесят",
                "шестьдесят", "семьдесят", "восемьдесят", "девяносто"
        };
        return words[value];
    }

    private String hundreds(int value) {
        String[] words = {
                "", "сто", "двести", "триста", "четыреста", "пятьсот",
                "шестьсот", "семьсот", "восемьсот", "девятьсот"
        };
        return words[value];
    }
}
