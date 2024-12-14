package weekTwo;

import java.util.Scanner;

public class ScannerRectangleArea {
    public static void main(String[] args) {
        // prompt user

        System.out.println("Enter in rectangle length: ");

        Scanner scn = new Scanner(System.in);

        double length = Double.parseDouble(scn.nextLine());
        System.out.println("Enter in rectangle width: ");
        double width = Double.parseDouble(scn.nextLine());
        double area = width * length;
        System.out.printf("Rectangle area: %.2f\n",area);
    }
}
