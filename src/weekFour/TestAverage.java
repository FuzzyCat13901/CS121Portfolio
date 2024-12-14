package weekFour;

import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number of students");
        int students = scn.nextInt();
        System.out.println("Enter number of tests per student");
        int test = scn.nextInt();
        for (int i = 1; i <= students; i++) {
            System.out.println("Enter score 1: ");
            int score1 = scn.nextInt();
            System.out.println("Enter score 2: ");
            int score2 = scn.nextInt();
            System.out.println("Enter score 3: ");
            int score3 = scn.nextInt();
            double average = ((double)(score1 + score2 + score3)) / 3.0;
            System.out.println("The average for student " + i + " is " + average);
        }
    }
}
