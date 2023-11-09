package org.example;

import java.util.List;

public class FPStructured {
    public static void main(String[] args) {
        printAllNumbersInListStructured(List.of(3, 7, 11, 25, 37, 7, 15));
    }
    private static void printAllNumbersInListStructured(List<Integer> numbers){
        for(int number:numbers){
            System.out.println(number);
        }
    }
}