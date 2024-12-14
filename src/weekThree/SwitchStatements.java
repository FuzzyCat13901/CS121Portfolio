package weekThree;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter in your grade: ");

        char letterGrade = scn.nextLine().charAt(0);
        switch (letterGrade) {
            case 'A':
                System.out.println("4.0 GPA");
                break;
            case 'B':
                System.out.println("3.0 GPA");
                break;
            case 'C':
                System.out.println("2.0 GPA");
                break;
            case 'D':
                System.out.println("1.0 GPA");
                break;
            default:
                //Code
        }
    }
}
