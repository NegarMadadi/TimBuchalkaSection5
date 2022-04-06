package org.example;


//Write a method named hasSharedDigit with two parameters of type int.
//
//Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
//
//The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.
//
//
//EXAMPLE INPUT/OUTPUT:
//
//* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
//* hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
//* hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
//
//
//NOTE: The method hasSharedDigit should be defined as public static like we have been doing so far in the course.
//
//NOTE: Do not add a main method to the solution code.
public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23)); // → should return true since the digit 2 appears in both numbers
        System.out.println(hasSharedDigit(9, 99)); //→ should return false since 9 is not within the range of 10-99
        System.out.println(hasSharedDigit(15, 55)); //→ should return true since the digit 5 appears in both numbers
    }

    public static boolean hasSharedDigit(int aNumber, int bNumber) {
        if ((aNumber < 10 || aNumber > 99) || (bNumber < 10 || bNumber > 99)) {
            return false;
        }

        int lastDigitOfANumber = aNumber % 10;
        int lastDigitOfBNumber = bNumber % 10;
        aNumber = aNumber / 10;
        bNumber = bNumber / 10;
        int aNumberFirstDigit = aNumber;
        int bNumberFirstDigit = bNumber;

        return ((aNumberFirstDigit == lastDigitOfBNumber) ||
                (aNumberFirstDigit == bNumberFirstDigit) ||
                (lastDigitOfANumber == lastDigitOfBNumber) ||
                (lastDigitOfANumber == bNumberFirstDigit));
    }
}


// Other solution
// public static boolean hasSharedDigit(int numberOne, int numberTwo) {
//        if ((numberOne >= 10 && numberOne <= 99) && (numberTwo >= 10 && numberTwo <= 99)) {
//            int numberOneLastDigit = numberOne % 10;
//            int numberTwoLastDigit = numberTwo % 10;
//            numberOne /= 10;
//            numberTwo /= 10;
//            int numberOneFirstDigit = numberOne;
//            int numberTwoFirstDigit = numberTwo;
//            return ((numberOneFirstDigit == numberTwoLastDigit) || (numberOneFirstDigit == numberTwoFirstDigit) || (numberOneLastDigit == numberTwoLastDigit) || (numberOneLastDigit == numberTwoFirstDigit));
//        } else {
//        return false;
//        }
//    }
