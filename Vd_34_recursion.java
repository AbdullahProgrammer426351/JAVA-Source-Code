public class Vd_34_recursion {
    // factorial with recursion
    static int factorial(int n) {
        // factorial(n) == n*n-1....1;
        /*
         * Note : factorial for 0 is 1
         * factorial using technique
         * factorial(n) = n * factorial(n-1)
         */
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }

    // factorial with iteration(for loop)
    static int factorial_iterative(int n) {
        // factorial(n) == n*n-1....1;
        /*
         * Note : factorial for 0 is 1
         * factorial using technique
         * factorial(n) = n * factorial(n-1)
         */
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int product = 1;
            for (int i = 1; i <= n; i++) {// 1 to n
                product *= i;
            }
            return product;
        }

    }

    public static void main(String[] args) {
        int n = 4;
        // recursion is calling of function to itself
        System.out.println("The value for factorial " + n + " is : " + factorial(n));
        System.out.println("The value for factorial iterative " + n + " is : " + factorial_iterative(n));
    }
}
