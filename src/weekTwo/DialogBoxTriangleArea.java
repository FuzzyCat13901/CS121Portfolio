package weekTwo;

import javax.swing.*;

public class DialogBoxTriangleArea {
    public static void main(String[] args) {
        double side1 = Double.parseDouble(JOptionPane.showInputDialog("Enter in triangle side 1 length: "));
        double side2 = Double.parseDouble(JOptionPane.showInputDialog("Enter in triangle side 2 length: "));
        double side3 = Double.parseDouble(JOptionPane.showInputDialog("Enter in triangle side 3 length: "));
        double area = (side1 * side2 * side3) * 0.5;
        String dialog = "Area: " + area;
        JOptionPane.showMessageDialog(null, dialog);
    }
}
