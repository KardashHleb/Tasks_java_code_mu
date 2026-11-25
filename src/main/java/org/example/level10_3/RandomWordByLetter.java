package org.example.level10_3;

import java.util.List;
import java.util.Optional;
import java.util.Random;

public class RandomWordByLetter {

    /** Picks a random word starting with the given letter (case-insensitive), or empty if there is none. */
    public Optional<String> pick(List<String> words, char letter, Random random) {
        if (!Character.isLetter(letter)) {
            throw new IllegalArgumentException("Not a letter: '" + letter + "'");
        }
        char wanted = Character.toLowerCase(letter);
        List<String> matched = words.stream()
                .filter(word -> !word.isEmpty() && Character.toLowerCase(word.charAt(0)) == wanted)
                .toList();
        if (matched.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(matched.get(random.nextInt(matched.size())));
    }
}
