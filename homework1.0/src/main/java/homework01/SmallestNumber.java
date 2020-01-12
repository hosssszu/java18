package homework01;

/**
 * Display the smallest number from an array of number
 *
 * @author Loránd
 */

public class SmallestNumber {

    /**
     * The application have two methods which will display the smallest number from an array of number
     *
     * @param args - input data
     */

    public static void main(String[] args) {

        int x[] = {3, 5, 2, 8}; // input array

        int s = 9; //initializing the local variable
        s = calculation(x, s);

        System.out.println("The smallest number is: " + s + "."); // display the result
    }

    private static int calculation(int[] x, int s) {
        // the for loop to check all the numbers from the array
        for (int i = 0; i < x.length; i++) {
            s = Math.min(x[i], s);
        }
        return s;
    }
}