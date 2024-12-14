package weekTwo;

import javax.swing.*;

public class ScannerRectanglePerimeter {
    public static void main(String[] args) {
        double length = Double.parseDouble(JOptionPane.showInputDialog("Enter in rectangle length: "));
        double width = Double.parseDouble(JOptionPane.showInputDialog("Enter in rectangle width: "));
        double area = (width + length) * 2;
        String dialog = "Area: " + area;
        JOptionPane.showMessageDialog(null, dialog);
    }
}
