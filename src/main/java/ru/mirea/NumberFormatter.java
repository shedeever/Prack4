package ru.mirea;

import java.util.Locale;

public class NumberFormatter {

    public static String formatWithSpaces(long value) {
        return String.format(Locale.US, "%,d", value).replace(',', ' ');
    }

    private NumberFormatter() {
    }
}