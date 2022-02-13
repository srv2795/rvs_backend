package com.example.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamsWithFiles {
    public static void main(String[] args) {
        Stream<String> stream = null;
        try {
            stream = Files.lines(Paths.get("D:\\ranvijay\\demo\\src\\main\\java\\com\\example\\streams\\pqr.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        stream.sorted().filter(x -> x.startsWith("R")).map(String::toUpperCase).forEach(System.out::println);
        stream.close();
    }
}
