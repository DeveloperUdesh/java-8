package com.learnJava.streams_terminal;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import static java.util.stream.Collectors.averagingInt;

public class StreamsSumAvgExample {

    public static int sum() {

        return StudentDataBase.getAllStudents()
                .stream().mapToInt(Student::getNoteBooks).sum();
    }

    public static double average() {

        return StudentDataBase.getAllStudents()
                .stream()
                .collect(averagingInt(Student::getNoteBooks));
    }


    public static void main(String[] args) {
        System.out.println("Total no of Notebooks : " + sum());
        System.out.println("Ceil Average no of Notebooks : " + Math.ceil(average()));
        System.out.println("Average no of Notebooks : " + average());
    }
}
