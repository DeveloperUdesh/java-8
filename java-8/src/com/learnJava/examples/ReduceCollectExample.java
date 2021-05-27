package com.learnJava.examples;

import java.util.Arrays;

public class ReduceCollectExample {

    public static void main(String[] args) {

        String[] strings = {"udesh ", "mudhigonda ", "Btech ", "learning ", "java8."};

        // String s = Arrays.stream(strings).reduce(new String(), String::concat,String::concat);
        //  String s1 = Arrays.stream(strings).parallel().collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();

        String s2 = Arrays.stream(strings).parallel().reduce(new StringBuilder(), (sb1, s1) -> new StringBuilder(sb1).append(s1), StringBuilder::append).toString();

        System.out.println("Sequential collect: " + s2);
        //System.out.println("Parallel collect: " + s1);
    }
}
