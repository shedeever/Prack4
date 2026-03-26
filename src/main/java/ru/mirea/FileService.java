package ru.mirea;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileService {

    public static String readFile(String fileName) throws IOException {
        return Files.readString(Path.of(fileName), StandardCharsets.UTF_8);
    }

    public static void writeFile(String fileName, String content) throws IOException {
        Files.writeString(Path.of(fileName), content, StandardCharsets.UTF_8);
    }
}