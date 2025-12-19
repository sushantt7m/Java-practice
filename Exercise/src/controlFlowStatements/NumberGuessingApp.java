package controlFlowStatements;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingApp {
    public static void main(String[] args) {
        // we are creating a number guessing app
        // Random rand = new Random();
        // int randomNumber = rand.nextInt(100); // smallest is 0 and largest is 100

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Guess the Number : ");
        // int guessedNumber = sc.nextInt();

        // now we are going to call the same thing till the user gueeses the correct
        // Number

        // boolean condition = true;
        // while (condition) {
        // if (guessedNumber > randomNumber) {
        // System.out.println("Guess Lower");
        // System.out.print("Try Again : ");
        // guessedNumber = sc.nextInt();
        // } else if (guessedNumber < randomNumber) {
        // System.out.println("Guess Higher");
        // System.out.print("Try Again : ");
        // guessedNumber = sc.nextInt();
        // }
        // else{
        // //the guessedNumber == randomNumber
        // System.out.println("Correct! you guessed it right : Number is " +
        // randomNumber );
        // // set the condition to be true so that we can exit from the loop
        // condition = false;
        // }
        // }
        // System.out.println("Exited from the loop ");

        // Another way of doing the same above thing

        Random rand = new Random();
        int randomNumber = rand.nextInt(5, 100); // smallest is 0 and largest is 100

        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the Number between 5 and 100");
        while (true) {
            int guessedNumber = sc.nextInt();
            if(guessedNumber > randomNumber){
                System.out.println("Guess Lower");
            }
            else if(guessedNumber < randomNumber){
                System.out.println("Guess Higher");
            }
            else{
                // guessedNumber == randomNumber
                System.out.println("Congratulations! you guessed right : " + guessedNumber);
                break;
            }
        }
        sc.close();
    }
}
