package org.example;

import java.util.List;

public class FPStructured {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 7, 11, 25, 37, 7, 15, 22, 8);
        //printAllNumbersInListStructured(numbers);
        printEvenNumbersInListStructured(numbers);
    }
    /*private static void printAllNumbersInListStructured(List<Integer> numbers){
        for(int number:numbers){
            System.out.println(number);
        }
    }*/

    private static void printEvenNumbersInListStructured(List<Integer> numbers){
        for(int number:numbers){
            if(number%2==0) {
                System.out.println(number);
            }
        }
    }
}