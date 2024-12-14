package weekFive;


public class TwoDimensionalArrays {
    public static void main(String[] args) {
        int [][]array1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12} };
        double [][]array2 = {{1.1, 2.2, 3.3},{4.4,5.5,6.6},{7.7,8.8,9.9},{10.0,11.1,12.2}};
        String [][]array3 = {{"Ann", "Andy", "Andrea"},{"John", "Joan", "Joanna"}};
        System.out.printf("Array 1\n");
        for (int i = 0; i < array1.length; i++) {
            int []inArray = array1[i];
            for (int j = 0; j < inArray.length; j++) {
                System.out.print(inArray[j] + " ");
            }
            System.out.println();
        }
        System.out.printf("\n\nArray 2\n");
        for (double inArray[]: array2) {
            for (int j = 0; j < inArray.length; j++) {
                System.out.print(inArray[j] + " ");
            }
            System.out.println();
        }
        System.out.printf("\n\nArray 3\n");
        for (int i = 0; i < array3.length; i++) {
            String[] inArray = array3[i];
            for (int j = 0; j < inArray.length; j++) {
                System.out.print(inArray[j] + " ");
            }
            System.out.println();
        }
    }
}
