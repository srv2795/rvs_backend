package com.example.io;

import java.io.*;
import java.util.Scanner;

public class ReadAFile {
    public static void main(String[] args) {
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
        try (FileReader fileReader = new FileReader("D:\\ranvijay\\demo\\src\\main\\java\\com\\example\\io\\abc.txt")) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            bufferedReader.read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
