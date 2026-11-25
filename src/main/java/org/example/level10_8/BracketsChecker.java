package org.example.level10_8;

public class BracketsChecker {

    /**
     * Checks that the round brackets in the text are balanced: a running counter goes up on "(" and
     * down on ")", must never drop below zero and must end at zero.
     */
    public boolean isBalanced(String text) {
        int balance = 0;
        for (char current : text.toCharArray()) {
            if (current == '(') {
                balance++;
            } else if (current == ')') {
                balance--;
                if (balance < 0) {
                    return false;
                }
            }
        }
        return balance == 0;
    }
}
