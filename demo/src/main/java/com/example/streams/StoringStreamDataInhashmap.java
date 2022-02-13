package com.example.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StoringStreamDataInhashmap {
    public static void main(String[] args) throws IOException {
        Stream<String> stream = Files.lines(Paths.get("D:\\ranvijay\\demo\\src\\main\\java\\com\\example\\streams\\xyz.txt"));
        Map<Integer, String> stringMap = stream.map(x -> x.split("-"))
                .collect(Collectors
                        .toMap(x -> Integer.parseInt(x[0]),
                                x -> x[1]));

        for(Integer key : stringMap.keySet()) {
            System.out.println("key - "+ Integer.parseInt(String.valueOf(key)) +" : value - "+ stringMap.get(key));
        }
    }
}
