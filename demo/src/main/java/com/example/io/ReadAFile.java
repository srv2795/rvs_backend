package com.example.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class ReadAFile {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\ranvijay\\demo\\src\\main\\java\\com\\example\\io\\abc.txt");
        //----------------------- read a file using Scanner class
        try {
            Scanner sc = new Scanner(file);
            String str = sc.nextLine();
            System.out.println(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //-------------------------read a file using BufferedReader
        BufferedReader bufferedReader = null;
        try (FileReader fileReader = new FileReader("D:\\ranvijay\\demo\\src\\main\\java\\com\\example\\io\\abc.txt")) {
            bufferedReader = new BufferedReader(fileReader);
            System.out.println();
            String str = bufferedReader.readLine();
            System.out.println("content of file : "+ str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        bufferedReader.close();
    }
}
