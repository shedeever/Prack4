package ru.mirea;

import java.io.IOException;

public class Main {
    static void main(String[] args) throws IOException {
        String inputFile = args.length > 0 ? args[0] : "src/main/resources/input.txt";
        String outputFile = args.length > 1 ? args[1] : "src/main/resources/output.txt";

        String text = FileService.readFile(inputFile);

        NumberParser parser = new NumberParser();
        TextNumberReplacer replacer = new TextNumberReplacer(parser);

        String result = replacer.replaceWrittenNumbers(text);

        System.out.println("=== Исходный текст ===");
        System.out.println(text);
        System.out.println();
        System.out.println("=== Результат ===");
        System.out.println(result);

        FileService.writeFile(outputFile, result);
    }
}