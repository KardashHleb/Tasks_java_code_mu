package org.example.level5_10;

public class MultiplicationTable {
    public String make(int number) {
        System.out.println("Введите число");
        System.out.println(number);

        String result = "";
        for (int i = 1; i <= 9; i++) {
            if (i > 1) {
                result = result + "\n";
            }
            result = result + i + " * " + number + " = " + (i * number);
        }

        System.out.println(result);
        return result;
    }
}
