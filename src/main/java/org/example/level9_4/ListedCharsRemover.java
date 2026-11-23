package org.example.level9_4;

public class ListedCharsRemover {
    public String remove(String text, String deleted) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            boolean drop = false;
            for (int j = 0; j < deleted.length(); j++) {
                if (text.charAt(i) == deleted.charAt(j)) {
                    drop = true;
                }
            }
            if (!drop) {
                result = result + text.charAt(i);
            }
        }

        System.out.println(result);
        return result;
    }
}
