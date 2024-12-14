package weekThree;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter in a number: ");

        int num = scn.nextInt();

        int isOdd = num & 1;
        if (isOdd == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
