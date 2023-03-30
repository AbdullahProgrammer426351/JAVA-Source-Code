public class Vd_33_varargs {
    // method without var args
    static int sum(int a, int b) {
        return a + b;
    }

    // method with varargs (variable argument)
    static int sum(int... arr) {
        // above parameter will be available as: int[] arr;
        // we will sum them by using foreach loop
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    // // if you want that method must take one parameter then,
    // static int sum(int n, int... arr) {
    // // above parameter will be available as: int[] arr;
    // // we will sum them by using foreach loop
    // int result = n;
    // for (int a : arr) {
    // result += a;
    // }
    // return result;
    // }

    public static void main(String[] args) {
        System.out.println("Welcome to var args tutorials");
        System.out.println("The sum of 4 and 5 is : " + sum(4, 5));
        System.out.println("The sum of 4, 7 and 5 with varargs is : " + sum(4, 7, 5));

        // these methods can also be used with empty parameters like sum();
        /*
         * var args are used when we don't know how many parameters will be
         * passed thorugh a method.
         * For example,
         * ------------wihtout var args-------------------
         * if we have to sum two numbers, we have to make a function for it, but
         * when we have to sum 3 numbers, we have to make another method and
         * simmillarly for every count of parameters, we have to make another
         * separate method for it
         * --------------------with var args----------------
         * we have to make only one method and it will do work for all no of parameters.
         * like the method is described above the main method
         */
    }
}