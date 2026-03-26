package ru.mirea;

import java.util.HashMap;
import java.util.Map;

public class NumberDictionary {

    public static final Map<String, Long> UNITS = new HashMap<>();
    public static final Map<String, Long> TEENS = new HashMap<>();
    public static final Map<String, Long> TENS = new HashMap<>();
    public static final Map<String, Long> HUNDREDS = new HashMap<>();
    public static final Map<String, Long> MULTIPLIERS = new HashMap<>();

    public static final String NUMBER_WORD_PATTERN;

    static {
        UNITS.put("ноль", 0L);
        UNITS.put("один", 1L);
        UNITS.put("одна", 1L);
        UNITS.put("два", 2L);
        UNITS.put("две", 2L);
        UNITS.put("три", 3L);
        UNITS.put("четыре", 4L);
        UNITS.put("пять", 5L);
        UNITS.put("шесть", 6L);
        UNITS.put("семь", 7L);
        UNITS.put("восемь", 8L);
        UNITS.put("девять", 9L);

        TEENS.put("десять", 10L);
        TEENS.put("одиннадцать", 11L);
        TEENS.put("двенадцать", 12L);
        TEENS.put("тринадцать", 13L);
        TEENS.put("четырнадцать", 14L);
        TEENS.put("пятнадцать", 15L);
        TEENS.put("шестнадцать", 16L);
        TEENS.put("семнадцать", 17L);
        TEENS.put("восемнадцать", 18L);
        TEENS.put("девятнадцать", 19L);

        TENS.put("двадцать", 20L);
        TENS.put("тридцать", 30L);
        TENS.put("сорок", 40L);
        TENS.put("пятьдесят", 50L);
        TENS.put("шестьдесят", 60L);
        TENS.put("семьдесят", 70L);
        TENS.put("восемьдесят", 80L);
        TENS.put("девяносто", 90L);

        HUNDREDS.put("сто", 100L);
        HUNDREDS.put("двести", 200L);
        HUNDREDS.put("триста", 300L);
        HUNDREDS.put("четыреста", 400L);
        HUNDREDS.put("пятьсот", 500L);
        HUNDREDS.put("шестьсот", 600L);
        HUNDREDS.put("семьсот", 700L);
        HUNDREDS.put("восемьсот", 800L);
        HUNDREDS.put("девятьсот", 900L);

        MULTIPLIERS.put("тысяча", 1_000L);
        MULTIPLIERS.put("тысячи", 1_000L);
        MULTIPLIERS.put("тысяч", 1_000L);

        MULTIPLIERS.put("миллион", 1_000_000L);
        MULTIPLIERS.put("миллиона", 1_000_000L);
        MULTIPLIERS.put("миллионов", 1_000_000L);

        MULTIPLIERS.put("миллиард", 1_000_000_000L);
        MULTIPLIERS.put("миллиарда", 1_000_000_000L);
        MULTIPLIERS.put("миллиардов", 1_000_000_000L);

        String words =
                "ноль|один|одна|два|две|три|четыре|пять|шесть|семь|восемь|девять|" +
                        "десять|одиннадцать|двенадцать|тринадцать|четырнадцать|пятнадцать|" +
                        "шестнадцать|семнадцать|восемнадцать|девятнадцать|" +
                        "двадцать|тридцать|сорок|пятьдесят|шестьдесят|семьдесят|восемьдесят|девяносто|" +
                        "сто|двести|триста|четыреста|пятьсот|шестьсот|семьсот|восемьсот|девятьсот|" +
                        "тысяча|тысячи|тысяч|миллион|миллиона|миллионов|миллиард|миллиарда|миллиардов";

        NUMBER_WORD_PATTERN = "(?iu)(?<![а-яё-])(?:"
                + words +
                ")(?:\\s+(?:"
                + words +
                "))*"
                + "(?![а-яё-])";
    }

    private NumberDictionary() {
    }
}