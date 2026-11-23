package org.example.level10_9;

import java.util.Random;

public class PasswordMaker {
    public String make(int length) {
        if (length < 4) {
            length = 4;
        }

        String lower = "abcdefghijklmnopqrstuvwxyz";
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digits = "0123456789";
        String special = "!@#$%&*";
        String all = lower + upper + digits + special;
        char[] password = new char[length];
        Random random = new Random();

        password[0] = lower.charAt(random.nextInt(lower.length()));
        password[1] = upper.charAt(random.nextInt(upper.length()));
        password[2] = digits.charAt(random.nextInt(digits.length()));
        password[3] = special.charAt(random.nextInt(special.length()));
        for (int i = 4; i < password.length; i++) {
            password[i] = all.charAt(random.nextInt(all.length()));
        }
        for (int i = password.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            char temp = password[i];
            password[i] = password[j];
            password[j] = temp;
        }

        String result = "";
        for (int i = 0; i < password.length; i++) {
            result = result + password[i];
        }
        System.out.println(result);
        return result;
    }
}
