package projectThree;

import java.util.Scanner;

/*public class Main {
    public static void main(String[] args) {
        //create a customer
        Customer customer = new Customer("John", "Doe", "1234");

        //create accounts for the customer
        Account account1 = new Account(500);  // Initial deposit of 500
        Account account2 = new Account(1000); // Initial deposit of 1000

        //nevermind i rechecked this is supposed to be in Menu class and Main class is supposed to call Menu OOPS commenting this out
    }
}*/

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();  // Create instance of Menu class
        menu.runMenu();  // Start running the menu
    }
}