package weekSix;

import java.util.Scanner;

public class MovieSimulationOne {
    public static void output(int movieCount, String[] movieNames, String[] movieTypes, int[] movieAvailability, double[] moviePrices) {
        System.out.println("------MOVIE DETAILS------");
        System.out.println("Name  Type   Seats   Price");
        for (int i = 0; i < movieCount; i++) {
            System.out.printf("%s        %s        %d        %f\n",movieNames[i],movieTypes[i],movieAvailability[i],moviePrices[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("How many movies?");
        int movieCount = scn.nextInt();
        String[] movieNames = new String[movieCount];
        String[] movieTypes = new String[movieCount];
        int[] movieAvailability = new int[movieCount];
        double[] moviePrices = new double[movieCount];

        /* PREVENT BUFFER OVERFLOW */
        /*if (movieCount > 10) {
            System.out.println("Please enter 10 or less movies.");
        }*/

        for (int i = 0; i < movieCount; i++) {
            System.out.println("Name?");
            movieNames[i] = scn.nextLine();
            /* For some reason it skips over the first so I just use two lol */
            movieNames[i] = scn.nextLine();
            System.out.println("2D or 3D?");
            movieTypes[i] = scn.nextLine();
            System.out.println("Available seats?");
            movieAvailability[i] = scn.nextInt();
            System.out.println("Prices?");
            moviePrices[i] = scn.nextDouble();
        }
        output(movieCount, movieNames, movieTypes, movieAvailability, moviePrices);
    }
}
