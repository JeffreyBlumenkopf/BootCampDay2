package com.jetbrains;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        int userInputNumber = 0;

/*
      created by Jeffrey Blumenkopf

 */


        System.out.println("What is your name?");
        String  userName = scan1.next();

/*
do while loop runs while userContinue = yes. User is prompted whether to continue at the end of the do loop
user enters a number depending on the numbers value and whether it is even or odd a individual loop runs
 */
        String userContinue = "yes";
        do {
            System.out.println(userName + " Enter a number:");
            userInputNumber = scan1.nextInt();
            if((userInputNumber %2 != 0) && (userInputNumber <= 60)){
                System.out.println("Odd");
            }else if( (userInputNumber %2 != 0) && (userInputNumber > 60) ){
                System.out.println(userInputNumber + " Odd");
            }else if( (userInputNumber %2 == 0) && (userInputNumber <= 25)){
                System.out.println("Even and less than 25");
            }else if (  (userInputNumber %2 == 0) && (userInputNumber <= 60)){
                System.out.println("Even");
            }else if ( (userInputNumber %2 == 0) && (userInputNumber > 60)){
                System.out.println(userInputNumber + " Even");
            }
            System.out.println(userName +" Continue?: ");
            userContinue = scan1.next();
        } while (userContinue.equalsIgnoreCase("yes"));



    }
}
