package com.learnJava.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class CollectionsvsStreams {

    public static void main(String[] args) {
        Stream.of("Adam,", "Jim,", "Jenny").forEach(System.out::print);
    }
}
