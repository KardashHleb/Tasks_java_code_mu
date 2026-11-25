package org.example.level7_7;

public class WordsSorter {

    /** Sorts the whitespace-separated words of the text alphabetically with a bubble sort and joins them with spaces. */
    public String sort(String text) {
        String trimmed = text.strip();
        if (trimmed.isEmpty()) {
            return "";
        }
        String[] words = trimmed.split("\\s+");
        for (int pass = 0; pass < words.length - 1; pass++) {
            boolean swapped = false;
            for (int j = 0; j < words.length - 1 - pass; j++) {
                if (words[j].compareTo(words[j + 1]) > 0) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return String.join(" ", words);
    }
}
