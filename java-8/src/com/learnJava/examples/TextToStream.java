package com.learnJava.examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class TextToStream {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("E:\\Work\\Intelij-Projects\\java-8\\java-8\\resources\\input.txt"));
        List<String> result = bufferedReader.lines().parallel().collect(Concatenator::new, Concatenator::accumulate, Concatenator::combine).getResult();
        result.forEach(System.out::println);
    }
}
