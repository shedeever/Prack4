package ru.mirea;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextNumberReplacer {

    private final NumberParser numberParser;
    private final Pattern pattern;

    public TextNumberReplacer(NumberParser numberParser) {
        this.numberParser = numberParser;
        this.pattern = Pattern.compile(NumberDictionary.NUMBER_WORD_PATTERN);
    }

    public String replaceWrittenNumbers(String text) {
        Matcher matcher = pattern.matcher(text);
        StringBuilder result = new StringBuilder();

        while (matcher.find()) {
            String fragment = matcher.group();

            Long number = numberParser.parseNumber(fragment);

            if (number != null) {
                String replacement = NumberFormatter.formatWithSpaces(number);
                matcher.appendReplacement(result, Matcher.quoteReplacement(replacement));
            } else {
                matcher.appendReplacement(result, Matcher.quoteReplacement(fragment));
            }
        }

        matcher.appendTail(result);
        return result.toString();
    }
}