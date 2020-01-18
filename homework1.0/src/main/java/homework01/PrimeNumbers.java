package homework01;

/**
 * Display all the prime numbers lower than a given number
 *
 * @author Loránd
 */

public class PrimeNumbers {

    /**
     * This application have three methods which display all the prime numbers lower than a given number
     *
     * @param n input data
     * @return the prime values
     */

    static boolean isPrime(int n) {
        // this method check if the number is prime or not
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        int n = 17; // input data
        {
            calculation(n);
        }
    }

    private static void calculation(int n) {
        // this method check the numbers from 2 to n, the input data
        for (int i = 2; i <= n; i++) {
            if (isPrime(i))
                System.out.println(i);
        }
    }
}