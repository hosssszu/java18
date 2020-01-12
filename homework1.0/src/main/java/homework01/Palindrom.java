package homework01;

/**
 * Check if a number is palindrom
 *
 * @author Loránd
 */

public class Palindrom {

    /**
     * The application have two methods which will check if a number is palindrom
     *
     * @param args input data
     */

    public static void main(String[] args) {
        int n = 12321; // input data
        int p = n;
        int rev = 0; //initializing the local variable

        rev = calculation(n, rev);

        //if statement is for display the result
        if (p == rev) {
            System.out.println("The number is palindrom.");
        } else {
            System.out.println("The number is NOT palindrom.");
        }
    }

    private static int calculation(int n, int rev) {
        // the while loop to check the number
        while (n > 0) {
            int dig = n % 10;
            rev = rev * 10 + dig;
            n = n / 10;
        }
        return rev;
    }
}