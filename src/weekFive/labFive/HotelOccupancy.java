package weekFive.labFive;

import java.util.Scanner;

public class HotelOccupancy {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter in the number of floors:");
        int floors = scn.nextInt();
        int rooms = 0;
        int occupied = 0;
        for (int i = 1; i <= floors; i++) {
            System.out.println("Number of rooms on floor " + i + ":");
            rooms += scn.nextInt();
            System.out.println("How many floor rooms are occupied?");
            occupied += scn.nextInt();
        }
        System.out.println("Floors: " + floors);
        System.out.println("Rooms: " + rooms);
        System.out.println("Occupied: " + occupied);
        System.out.println("Vacant: " + (rooms - occupied));
        double occupancy = (double)occupied / (double)rooms;
        System.out.println("Occupancy: " + occupancy);
    }
}
