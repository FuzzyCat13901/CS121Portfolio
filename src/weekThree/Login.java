package weekThree;

import javax.swing.*;

public class Login {
    public static void main(String[] args) {
        String userName = "John";
        String password = "a123456"; //Storing this in plaintext is a bad idea but eh
        String name = JOptionPane.showInputDialog("Enter in user name: ");
        String pw = JOptionPane.showInputDialog("Enter in password: ");
        if (!userName.equals(name)) {
            if (password.equals(pw)) {
                JOptionPane.showMessageDialog(null,"Name not found.");
            } else {
                JOptionPane.showMessageDialog(null,"Name and password not found");
            }
            return;
        }
        if (password.equals(pw)) {
            JOptionPane.showMessageDialog(null,"Welcome to CS121");
        } else {
            JOptionPane.showMessageDialog(null,"Password incorrect.");
        }
    }
}
