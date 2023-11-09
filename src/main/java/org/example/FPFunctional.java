package org.example;

import java.util.List;

public class FPFunctional {
    public static void main(String[] args) {
        printAllNumbersInListFunctional(List.of(3, 7, 11, 25, 37, 7, 15));
    }

    private static void print(int number){
        System.out.println(number);
    }
    private static void printAllNumbersInListFunctional(List<Integer> numbers){
        numbers.forEach(FPFunctional::print);
    }
}
