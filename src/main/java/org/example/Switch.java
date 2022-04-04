package org.example;

import java.util.Locale;

public class Switch {
    public static void main(String[] args) {
//        int value = 2 ;
//        if (value == 1){
//            System.out.println("Value was  1.");
//        }else if(value == 2){
//            System.out.println("Value was 2.");
//        }else{
//            System.out.println("value was not 1 or 2");
//        }


        int switchValue = 3;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            default:
                System.out.println("Value was not 1 or 2.");
        }

        char newChar = 'C';
        switch (newChar) {
            case 'A':
                System.out.println("Value was A");
                break;
            case 'B':
                System.out.println("charValue was B");
                break;
            case 'C':
                System.out.println("charValue was C");
                break;
            case 'D':
                System.out.println("charValue was D");
                break;
            case 'E':
                System.out.println("charValue was E");
                break;
            default:
                System.out.println("charValue was not found.");
                break;
        }


        String month = "January";
        switch (month.toLowerCase()) {
            case "January":
                System.out.println("Jan");
                break;
            case "February":
                System.out.println("Feb");
                break;
            case "July":
                System.out.println("Jul");
                break;
            default:
                System.out.println("Not sure.");
                break;
        }
    }
}


