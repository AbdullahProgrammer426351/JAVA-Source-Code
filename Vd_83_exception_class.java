import java.util.Scanner;

// making our own custom exception class
class MyException extends Exception {
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return "I am get message";
    }
}

public class Vd_83_exception_class {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        scanner.close();
        if (a < 9) {
            try {
                throw new MyException();
            } catch (Exception e) {
                // here we will see some methods that we can use with Exception class
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
            }
        }
    }
}
