package weekFour;

public class CFTable {
    public static void main(String[] args) {
        System.out.println("Celsius     Fahrenheit");
        System.out.println("***************************");
        int celsius = 0;
        double fahrenheit;
        while (celsius <= 20) {
            fahrenheit = ((9.0 / 5.0) * celsius) + 32.0;
            System.out.println(celsius + "          " + fahrenheit);
            celsius++;
        }
    }
}
