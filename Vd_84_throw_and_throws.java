class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "radius cannot be negative!";
    }

    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return "radius cannot be negative!";
    }
}

public class Vd_84_throw_and_throws {
    public static double area(int r) throws NegativeRadiusException {
        // we will make custom exception for this, so that no one can insert negative
        // radius in this function . Because negative radius will give negative area
        // which is logically impossible.

        // check if radius is negative or not
        if (r < 0) {
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }

    public static int divide(int a, int b) throws ArithmeticException {
        // throws ArithmeticException : giving warning that this function can give
        // arithematic exception , so you should handle this in try catch
        // made by harry

        if (b == 0)
            throw new ArithmeticException();
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
        // shivam - uses divide function created by harry.
        // shivam and harry are not good in each other behaviourwise
        int c = divide(6, 4);

        // try {
        // double area = area(22);
        // } catch (NegativeRadiusException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }

        System.out.println(c);
    }
}
