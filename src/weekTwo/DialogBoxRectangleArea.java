package weekTwo;

import javax.swing.*;
import java.util.Scanner;

public class DialogBoxRectangleArea {
    public static void main(String[] args) {
        double length = Double.parseDouble(JOptionPane.showInputDialog("Enter in rectangle length: "));
        double width = Double.parseDouble(JOptionPane.showInputDialog("Enter in rectangle width: "));
        double area = width * length;
        String dialog = "Area: " + area;
        JOptionPane.showMessageDialog(null, dialog);
    }
}
