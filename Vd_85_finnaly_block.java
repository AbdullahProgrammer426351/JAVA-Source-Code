public class Vd_85_finnaly_block {

    public static int greet() {
        try {
            int a = 5;
            int b = 0;
            int c = a / b;
            return c;
            // even if you use return statement, then even the function will not teminate
            // and will execute the lines of code in finally block.. it will ignore the
            // break and return statements.
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("this is the end of this function");
        }
        return 0;
    }

    public static void main(String[] args) {

    }
}
