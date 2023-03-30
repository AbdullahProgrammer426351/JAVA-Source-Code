public class Vd_80_try_catch {
    public static void main(String[] args) {
        int a = 6;
        // int b = 9;
        int b = 0;

        try {
            int c = a / b; // ---> this will give arithematic exception if we give 0 value to variable b
            // to handle it, we have to wrap following code in try catch
            System.out.println("the result is " + c);
        } catch (Exception e) {
            System.out.println("failed to divide reason " + e);
        }
    }
}
