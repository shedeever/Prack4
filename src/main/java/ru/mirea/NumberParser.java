package ru.mirea;

import java.util.Locale;

public class NumberParser {

    public Long parseNumber(String text) {
        String[] words = text.toLowerCase(Locale.ROOT).trim().split("\\s+");

        long total = 0;
        long current = 0;
        boolean found = false;

        for (String word : words) {
            if (NumberDictionary.HUNDREDS.containsKey(word)) {
                current += NumberDictionary.HUNDREDS.get(word);
                found = true;
            } else if (NumberDictionary.TENS.containsKey(word)) {
                current += NumberDictionary.TENS.get(word);
                found = true;
            } else if (NumberDictionary.TEENS.containsKey(word)) {
                current += NumberDictionary.TEENS.get(word);
                found = true;
            } else if (NumberDictionary.UNITS.containsKey(word)) {
                current += NumberDictionary.UNITS.get(word);
                found = true;
            } else if (NumberDictionary.MULTIPLIERS.containsKey(word)) {
                long multiplier = NumberDictionary.MULTIPLIERS.get(word);

                if (current == 0) {
                    current = 1;
                }

                total += current * multiplier;
                current = 0;
                found = true;
            } else {
                return null;
            }
        }

        if (!found) {
            return null;
        }

        return total + current;
    }
}