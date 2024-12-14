package weekFour;

import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int value = rand.nextInt(101 - 1) + 1;
        Boolean run = true;
        int guess = 0;
        while (run) {
            Scanner scn = new Scanner(System.in);

            System.out.println("Guess a number from 1 to 100, press \"q\" to quit: ");

            String input = scn.nextLine();
            if (input.equals("q")) {
                guess++;
                System.out.println("The number was " + value);
                break;
            }
            int num = Integer.parseInt(input);

            if (num > value) {
                System.out.println("Too big, guess again.");
            } else if (num < value) {
                System.out.println("Too small, guess again.");
            } else {
                run = false;
                System.out.println("Correct!");
            }
            guess++;
        }
        System.out.println("Guesses: " + guess);
    }
}
