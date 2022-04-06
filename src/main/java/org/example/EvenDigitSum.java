package org.example;

// Write a method named getEvenDigitSum with one parameter of type int called number.
//
//The method should return the sum of the even digits within the number.
//
//If the number is negative, the method should return -1 to indicate an invalid value.
//
//
//EXAMPLE INPUT/OUTPUT:
//
//* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
//
//* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
//
//* getEvenDigitSum(-22); → should return -1 since the number is negative
//
//
//NOTE: The method getEvenDigitSum should be defined as public static like we have been doing so far in the course.
//
//NOTE: Do not add a main method to the solution code.

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789)); //→ should return 20 since 2 + 4 + 6 + 8 = 20
        System.out.println(getEvenDigitSum(252)); //→ should return 4 since 2 + 2 = 4
        System.out.println(getEvenDigitSum(-22)); //→ should return -1 since the number is negative

    }

    private static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int evenDIgitsSum;
        int lastdigitOfNumber;
        for (evenDIgitsSum = 0; number != 0; number /= 10) {
            lastdigitOfNumber = number % 10;
            if (lastdigitOfNumber % 2 == 0) {
                evenDIgitsSum += lastdigitOfNumber;
            }
        }
        return evenDIgitsSum;
    }
}

