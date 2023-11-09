package org.example;

import java.util.List;

public class FPFunctional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 7, 11, 25, 37, 7, 15, 22, 8);
        //printAllNumbersInListFunctional(numbers);
        //printEvenNumbersInListFunctional(numbers);
        printSquaresOfEvenNumbersInListFunctional(numbers);
        //printCubesOfOddNumbersInListFunctional(numbers);
    }

    private static boolean isEven(int number){
        return number%2 == 0;
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers){
        numbers.forEach(System.out::println);
    }

    /*private static void printEvenNumbersInListFunctional(List<Integer> numbers){
        numbers.stream()
                //.stream().filter(FPFunctional::isEven)
                .filter(number -> number%2 == 0)
                .forEach(System.out::println);
    }*/

    private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers){
        numbers.stream()
                .filter(number -> number%2 == 0)
                .map(number -> number * number)
                .forEach(System.out::println);
    }


}
