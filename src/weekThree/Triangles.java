package weekThree;

import javax.swing.*;

public class Triangles {
    public static void main(String[] args) {
        double side1 = Double.parseDouble(JOptionPane.showInputDialog("Enter in triangle side 1 length: "));
        double side2 = Double.parseDouble(JOptionPane.showInputDialog("Enter in triangle side 2 length: "));
        double side3 = Double.parseDouble(JOptionPane.showInputDialog("Enter in triangle side 3 length: "));
        if (side1 == side2 && side1 == side3) {
            System.out.println("Equilateral");
            return;
        }
        if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("Isosceles");
            return;
        }
        System.out.println("Scalene");
    }
}
