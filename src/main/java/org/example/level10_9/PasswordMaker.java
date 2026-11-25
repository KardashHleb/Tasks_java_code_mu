package org.example.level10_9;

import java.util.Random;

public class PasswordMaker {

    public static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    public static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String DIGITS = "0123456789";
    public static final String SPECIAL = "!@#$%&*";

    private static final String ALL = LOWER + UPPER + DIGITS + SPECIAL;

    /**
     * Generates a password of the given length (at least 4) that contains at least one lowercase
     * letter, one uppercase letter, one digit and one special character: one character of each class
     * is placed first, the rest are random, then everything is shuffled (Fisher-Yates).
     */
    public String make(int length, Random random) {
        if (length < 4) {
            throw new IllegalArgumentException("Password length must be at least 4: " + length);
        }
        char[] password = new char[length];
        password[0] = randomChar(LOWER, random);
        password[1] = randomChar(UPPER, random);
        password[2] = randomChar(DIGITS, random);
        password[3] = randomChar(SPECIAL, random);
        for (int i = 4; i < length; i++) {
            password[i] = randomChar(ALL, random);
        }
        for (int i = length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            char temp = password[i];
            password[i] = password[j];
            password[j] = temp;
        }
        return new String(password);
    }

    private static char randomChar(String chars, Random random) {
        return chars.charAt(random.nextInt(chars.length()));
    }
}
