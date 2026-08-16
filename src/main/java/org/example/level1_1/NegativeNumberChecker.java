package org.example.level1_1;

public class NegativeNumberChecker {


    public boolean isNegativer(int number){
        if (number<0){
            System.out.println("Число негативное");
            return true;
        } else {
            System.out.println("Число какое-то другое");
            return false;
        }

    }
}
