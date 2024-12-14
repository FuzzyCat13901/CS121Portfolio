package weekSix;

import java.util.Scanner;

public class Rectangle {
    static Scanner scanner = new Scanner(System.in);
    public static double getLength() {
        System.out.println("Please input length:");
        return scanner.nextDouble();
    }
    public static double getWidth() {
        System.out.println("Please input width:");
        return scanner.nextDouble();
    }
    public static double getArea(double length, double width) {
        return length*width;
    }
    public static void displayData(double length, double width, double area) {
        System.out.println("Rectangle length: " + length);
        System.out.println("Rectangle width: " + width);
        System.out.println("Rectangle area: " + area);
    }
    public static void main(String[] args) {
        double length = getLength();
        double width = getWidth();
        double area = getArea(length,width);
        scanner.close();
        displayData(length,width,area);
    }
}
