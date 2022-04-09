package org.example.setion5;

public class ChallengeForWhileAndDoWhile {
    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;
        int evenNumberFound = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            evenNumberFound++;
            if (evenNumberFound >= 5) {
                break;
            }
        }
        System.out.println("Total even numbers found = " + evenNumberFound);
    }

       /* while(number <= finishNumber){
            number++;
            if (!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);
        }*/

    // Modify the while above code
    //Make it also record the total number of even numbers it has found
    //and break since 5 are found
    // and at the end, display the total number of even numbers.

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
