package org.example.level4_4;

public class VowelsRemover {
    public String removeVowels(String str) {
        String vowels = "aeiouAEIOUаеёиоуыэюяАЕЁИОУЫЭЮЯ";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            boolean vowel = false;
            for (int j = 0; j < vowels.length(); j++) {
                if (current == vowels.charAt(j)) {
                    vowel = true;
                    break;
                }
            }
            if (!vowel) {
                result = result + current;
            }
        }

        System.out.println(result);
        return result;
    }
}
