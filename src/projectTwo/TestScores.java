package projectTwo;

import java.util.Random;
import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random rand = new Random();
        final int SIZE = rand.nextInt(8) + 3;

        int[] testScores = new int[SIZE];
        char[] letterGrades = new char[SIZE];

        System.out.println("Enter " + SIZE + " test scores:");

        for (int i = 0; i < SIZE; i++) {
            System.out.print("Score " + (i + 1) + ": ");
            testScores[i] = scn.nextInt();
        }

        for (int i = 0; i < SIZE; i++) {
            letterGrades[i] = getLetterGrade(testScores[i]);
        }
        printGrades(testScores, letterGrades);

        printHighestScore(testScores);
        printLowestScore(testScores);
        printAverageScore(testScores);

        scn.close();
    }

    public static char getLetterGrade(int score) {
        //recycling my code from week 2 testscore here
        int testAverage = score - 60;

        if (testAverage < 0) {
            return 'F';
        }
        char[] grades = {'D', 'C', 'B', 'A', 'A'};
        return grades[testAverage / 10];
    }

    public static void printGrades(int []testScore, char []grades) {
        System.out.println("Score    Grade");
        for (int i = 0; i < 4; i++) {
            System.out.println(testScore[i] + "  " + grades[i]);
        }
    }

    public static void printHighestScore(int[] scores) {
        int highest = 0;
        for (int score : scores) {
            if (score > highest) {
                highest = score;
            }
        }
        System.out.println("The highest score is " + highest);
    }

    public static void printLowestScore(int[] scores) {
        int lowest = 100;
        for (int score : scores) {
            if (score < lowest) {
                lowest = score;
            }
        }
        System.out.println("The lowest score is " + lowest);
    }

    public static void printAverageScore(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        double average = (double) sum / scores.length;
        System.out.printf("Average Score is %.2f\n", average);
    }
}
