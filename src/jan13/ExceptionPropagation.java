/*
 Write a method divide(int a, int b) that throws ArithmeticException. Handle it in main.
 */
package jan13;

/**
 *
 * @author TASRIF ZAMAN
 */
public class ExceptionPropagation {
    public static int divide(int a, int b) throws ArithmeticException{
           return a /b;
    }
    public static void main(String[] args) {
        try {
             int result = divide(10/0);
             System.out.println("Result : " + result);
        } catch (ArithmeticException e) {
            System.err.println("Cannot divided by zero");;
        } finally{
            System.err.println("Division attempt complete");
        }
    }

    private static int divide(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
