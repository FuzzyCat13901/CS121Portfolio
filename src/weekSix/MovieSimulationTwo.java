package weekSix;

import java.util.Random;
import java.util.Scanner;

public class MovieSimulationTwo {
    public static int[][] setSeatAvailability(int[][] seatAvailability) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                seatAvailability[j][i] = 0;
            }
        }
        return seatAvailability;
    }
    public static int[][] randomizeAvailability(int[][] seatAvailability) {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                seatAvailability[j][i] = rand.nextInt(2);
            }
        }
        return seatAvailability;
    }
    public static void displayMovieDetails(String[] movieNames, String[] movieTypes, double[] moviePrices) {
        System.out.println("------MOVIE DETAILS------");
        System.out.println("Name           Type            Price");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%s       %s       %f\n", movieNames[i], movieTypes[i], moviePrices[i]);
        }
    }
    public static void displaySeatAvailability(int[][] movieAvailability) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(movieAvailability[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] movieNames = {"Jumanji", "Matrix", "Star Wars", "Oppenheimer"};
        String[] movieTypes = {"2D", "3D", "2D", "Drama/Historical"};
        double[] moviePrices = {15.25, 20.15, 18.11, 22.12};

        displayMovieDetails(movieNames, movieTypes, moviePrices);

        final int[][] movieAvailability = {{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0}};
        setSeatAvailability(movieAvailability);
        displaySeatAvailability(movieAvailability);
        randomizeAvailability(movieAvailability);
        displaySeatAvailability(movieAvailability);
    }
}
