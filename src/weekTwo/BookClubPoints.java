package weekTwo;

import java.util.Scanner;

public class BookClubPoints {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter in the number of books purchased: ");

        int booksPurchased = Integer.parseInt(scn.nextLine());
        int points;
        if (booksPurchased == 0) {
            points = 0;
        } else if (booksPurchased == 1) {
            points = 5;
        } else if (booksPurchased == 2) {
            points = 15;
        } else if (booksPurchased == 3) {
            points = 30;
        } else if (booksPurchased >= 4) {
            points = 60;
        } else {
            points = -1;
            System.out.println("Invalid input!");
        }
        System.out.printf("The amount you are awarded is %d points\n",points);

        scn.close();
    }
}
