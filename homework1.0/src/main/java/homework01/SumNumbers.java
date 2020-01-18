package homework01;

/**
 * Calculate the sum of the first 100 numbers higher than 0
 *
 * @author Loránd
 */

public class SumNumbers {

    /**
     * The application have two methods which will calculate the sum of the first 100 numbers higher than 0
     *
     * @param args - input data
     */

    public static void main(String[] args) {

        int s = 1; // first number from the amount of numbers
        int z = 100; // how many numbers we want to sum
        int f = s + z; // the last number
        int g = 0; // counter

        g = calculation(s, f, g);

        System.out.println("Sum: " + g + "."); // display the result
    }

    private static int calculation(int s, int f, int g) {
        for (int i = s; i < f; i++) {
            System.out.println(i); // printing the numbers
            g = g + i;
        }
        return g;
    }
}