package org.example;

import java.util.List;

public class FPExercises {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 7, 11, 25, 37, 7, 15, 22, 8);
        //printOddNumbersInListFunctional(numbers);
        //printCubesOfOddNumbersInListFunctional(numbers);

        List<String> courses = List.of("Spring", "Spring Boot", "API",
                "Microservices", "AWS", "Docker", "Kubernetes");

        //courses.forEach(System.out::println);

        /*courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);*/

        /*courses.stream()
                .filter(course -> course.length() > 3)
                .forEach(System.out::println);*/

        courses.stream()
                .map(course -> course + " " + course.length())
                .forEach(System.out::println);
    }

    /*private static void printOddNumbersInListFunctional(List<Integer> numbers){
        numbers.stream()
                .filter(number -> number%2 != 0)
                .forEach(System.out::println);
    }*/

    /*private static void printCubesOfOddNumbersInListFunctional(List<Integer> numbers){
        numbers.stream()
                .filter(number -> number%2 != 0)
                .map(number -> number * number * number)
                .forEach(System.out::println);
    }*/
}
