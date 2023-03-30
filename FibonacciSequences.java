import java.util.Scanner;

public class FibonacciSequences {

    static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    static int factorial(int n) {
        if (n == 1 || n == 0) {
            return n;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("The 0th fibonacci number is: " + fibonacci(0));
        System.out.println("The 7th fibonacci number is: " + fibonacci(7));
        System.out.println("The 12th fibonacci number is: " + fibonacci(12));

    }
}
