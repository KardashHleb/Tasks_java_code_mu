package org.example.level10_6;

public class LetterPermutations {
    public String[] make(String word) {
        System.out.println("Введите слово");
        System.out.println(word);

        if (word.length() > 8) {
            System.out.println("слишком длинное слово");
            return new String[0];
        }

        int limit = 1;
        for (int i = 2; i <= word.length(); i++) {
            limit = limit * i;
        }
        String[] found = new String[limit];
        int[] count = new int[]{0};
        walk(word, new boolean[word.length()], "", found, count);

        String[] result = new String[count[0]];
        for (int i = 0; i < result.length; i++) {
            result[i] = found[i];
            System.out.println(result[i]);
        }
        return result;
    }

    private void walk(String word, boolean[] used, String current, String[] found, int[] count) {
        if (current.length() == word.length()) {
            for (int i = 0; i < count[0]; i++) {
                if (found[i].equals(current)) {
                    return;
                }
            }
            found[count[0]] = current;
            count[0] = count[0] + 1;
            return;
        }
        for (int i = 0; i < word.length(); i++) {
            if (!used[i]) {
                used[i] = true;
                walk(word, used, current + word.charAt(i), found, count);
                used[i] = false;
            }
        }
    }
}
