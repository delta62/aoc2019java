package com.samnoedel.aoc2019;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class InputReader {
    private String inputPath;

    public InputReader(String inputPath) {
        this.inputPath = inputPath;
    }

    public String read() throws IOException {
        StringBuilder sb = new StringBuilder();
        Stream<String> stream = Files.lines(Paths.get(inputPath), StandardCharsets.UTF_8);
        stream.forEach(str -> sb.append(str).append('\n'));
        return sb.toString();
    }
}
