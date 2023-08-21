package org.bp9.specialization;

import java.util.Scanner;

public class GuessingGame {
    public static void main (String[] args) {

    //  For this section of the project, you’ll write a program that plays a classic number guessing game.
    //  The game will work like this: The computer will choose a random number between 1–100 and ask the user to guess the number

   //  Once the user guesses, the computer will tell the user if their guess was too high or too low

   //  The game is over once the user guesses the computer’s number.
   //  When the game is over, the computer prints the total number of guesses the user made before getting the right answer.


        boolean correctGuess = false;
        int tries = 0;
        int magicNumber = (int)(Math.random() * 101);
        System.out.println("Hello, visitor!");
        System.out.println("What's your name? ");

        Scanner input = new Scanner(System.in);
        String userName = input.nextLine();

        System.out.println("Hi " + userName + "! Guess a number!");

        while (!correctGuess) {
            int userGuess = input.nextInt();
            System.out.println("Your guess: " + userGuess);
            tries++;
            if (userGuess < magicNumber) {
                System.out.println("Your guess is too low!");
            } else if (userGuess == magicNumber) {
                System.out.println("Your guess is correct!");
                System.out.println("You guessed the number in " + tries +" attempts!");
            } else if (userGuess > magicNumber) {
                System.out.println("Your guess is too high! Try again!");
            }
        }




    }




}
