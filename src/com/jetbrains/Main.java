package com.jetbrains;

import java.util.Scanner;

/*
      created by Jeffrey Blumenkopf
      January 31, 2017

 */
public class Main {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);



        System.out.println("What is your name?");
        String  userName = scan1.next();

/*
        Explanation of Loops:
        do while loop (lines 27 -50) runs while userContinue = yes. User is prompted whether to continue at the end of the do loop
        while loop (lines  28 -36) ensures that input number is between 1 and 100 Loop runs at first beacuse number is initialized to 0. The loop is broken only if user changes the number to a value between 1 and 100.

 */
        String userContinue = "yes";
        do {

            int userInputNumber = 0; // important that this is not above the do loop. the program will not ask for user number if the user runs the program a 2nd time     while(userInputNumber > 100 || userInputNumber <= 0) {
            while(userInputNumber > 100 || userInputNumber < 1){
                System.out.println(userName + " Enter a number between 1 and 100:");
                userInputNumber = scan1.nextInt();

                if (userInputNumber <= 100 && userInputNumber > 0) {
                    break;
                }
                System.out.println("Error. Number must be between 1 and 100");
            }
            if((userInputNumber %2 != 0) && (userInputNumber <= 60)){ //checks if number is odd and <= 60
                System.out.println("Odd");
            }else if( (userInputNumber %2 != 0) && (userInputNumber > 60) ){//checks to see if number is odd and > 60
                System.out.println(userInputNumber + " Odd");
            }else if( (userInputNumber %2 == 0) && (userInputNumber <= 25)){//checks to see if number is even and <=25
                System.out.println("Even and less than 25");
            }else if (  (userInputNumber %2 == 0) && (userInputNumber <= 60)){//checks to see if number is even and <= 60
                System.out.println("Even");
            }else if ( (userInputNumber %2 == 0) && (userInputNumber > 60)){//check to see if number is even and > 60
                System.out.println(userInputNumber + " Even");
            }
            System.out.println(userName +" Continue?: ");
            userContinue = scan1.next();
        } while (userContinue.equalsIgnoreCase("yes"));



    }
}
