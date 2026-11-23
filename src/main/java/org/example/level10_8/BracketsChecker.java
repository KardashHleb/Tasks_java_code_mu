package org.example.level10_8;

public class BracketsChecker {
    public boolean check(String text) {
        int balance = 0;
        boolean ok = true;

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            if (current == '(') {
                balance = balance + 1;
            } else if (current == ')') {
                balance = balance - 1;
                if (balance < 0) {
                    ok = false;
                }
            }
        }
        if (balance != 0) {
            ok = false;
        }

        System.out.println(ok);
        return ok;
    }
}
