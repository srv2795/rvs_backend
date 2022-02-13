package com.example.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TakeStringfromFileAndSaveInList {
    public static void main(String[] args) throws IOException {
        Stream<String> stream = Files.lines(Paths.get("D:\\ranvijay\\demo\\src\\main\\java\\com\\example\\streams\\pqr.txt"));
        List<String> list = stream.sorted().collect(Collectors.toList());
        list.stream().map(String::toUpperCase).forEach(System.out::println);
        // Use of filter and print the elements of the list
        System.out.println("Use of filter and print the elements of the list");
        list.stream().filter(x -> x.length() ==5).map(String::toUpperCase).forEach(System.out::println);

        System.out.println("Taking data from csv file and count");
        Stream<String> stream2fromcsv = Files.lines(Paths.get("D:\\ranvijay\\demo\\src\\main\\java\\com\\example\\streams\\lmn.txt"));
        int rowcount =(int) stream2fromcsv.map(x -> x.split(",")).count();
        System.out.println("count : "+ rowcount);

        System.out.println("saving data fro csv to list object");

        Stream<String> stream2fromcsv2 = Files.lines(Paths.get("D:\\ranvijay\\demo\\src\\main\\java\\com\\example\\streams\\lmn.txt"));
        List<String> list3 = stream2fromcsv2.filter(x -> x.endsWith(",")).collect(Collectors.toList());
        Iterator itr = list3.iterator();
        while(itr.hasNext()) {
            String str =(String) itr.next();

            System.out.println("Iterated Element : "+ str.substring(0, str.length()-1));
        }
    }
}
