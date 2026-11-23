package org.example.level3_9;

public class BinaryConverter {
    public String toBinary(int number) {
        int positiveNumber = Math.abs(number);

        if (positiveNumber == 0) {
            System.out.println("0");
            return "0";
        }

        String binary = "";

        while (positiveNumber > 0) {
            binary = (positiveNumber % 2) + binary;
            positiveNumber = positiveNumber / 2;
        }

        System.out.println(binary);
        return binary;
    }
}
