package weekFour;

import java.util.Scanner;

public class DistanceTraveled {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the speed of the vehicle in mph");
        int speed = scn.nextInt();
        System.out.println("Enter the number of hours traveling");
        int hours = scn.nextInt();
        System.out.println("Hour    Distance Travelled");
        for (int i = 1; i <= hours; i++) {
            System.out.println(i + "   " + (i * speed));
        }
    }
}
