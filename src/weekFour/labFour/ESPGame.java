package weekFour.labFour;

import java.util.Random;
import java.util.Scanner;

public class ESPGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scn = new Scanner(System.in);
        String[] colors = {"red", "green", "blue", "orange", "yellow"};
        int correct = 0;
        for (int i = 1; i < 11; i++) {
            int value = rand.nextInt(5);
            String comColor = colors[value];
            System.out.println(i + ". What color has the computer chosen?");
            String input = scn.nextLine();
            if (input.equals(comColor)) {
                correct++;
            }
            System.out.println(">The computer chose " + comColor);
        }
        System.out.println("You got " + correct + " out of 10 correct");
    }
}
