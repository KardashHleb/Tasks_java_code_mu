package org.example.level1_1;

public class EvenNumberChecker {

    public boolean isEven(int number){
        if (number%2==0){
            System.out.println("Число четное");
            return true;
        } else {
            System.out.println("Число какое-то другое");
            return false;
        }

    }
}
