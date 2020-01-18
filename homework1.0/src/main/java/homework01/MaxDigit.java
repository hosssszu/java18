package homework01;

/**
 * Display the max digit from a number.
 *
 * @author Loránd
 */

public class MaxDigit {

    /**
     * The application have two methods which will display the max digit from a number
     *
     * @param args - input data
     */

    public static void main(String[] args) {
        int n = 5346; // input data

        {
            int smallest = 9; //initializing the local variable
            smallest = calculation(n, smallest);
            System.out.println("The smallest digit in the number is: " + smallest + "."); //display the result
        }
    }

    private static int calculation(int n, int smallest) {
        // the while loop to check all the digit from a number
        while (n > 0) {
            int r = n % 10;
            smallest = Math.min(r, smallest);
            n = n / 10;
        }
        return smallest;
    }
}