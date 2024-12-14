package weekTwo;

import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter in the test score of test 1: ");

        double test1 = Double.parseDouble(scn.nextLine());

        System.out.println("Enter in the test score of test 2: ");

        double test2 = Double.parseDouble(scn.nextLine());

        System.out.println("Enter in the test score of test 3: ");

        double test3 = Double.parseDouble(scn.nextLine());

        double testAverageDouble = (test1 + test2 + test3) / 3;
        int testAverage = ((int) testAverageDouble) - 60;

        if (testAverage < 0) {
            scn.close();
            System.out.println("F");
            return;
        }
        char[] grades = {'D', 'C', 'B', 'A', 'A'};
        System.out.printf("%c\n",grades[testAverage / 10]);

        scn.close();
    }
}
