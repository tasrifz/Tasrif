/*
 Write a program that divides two numbers and handles division by zero. Use hardcoded values.
 */
package jan13;

/**
 *
 * @author TASRIF ZAMAN
 */
public class DivideSafely {
    public static void main(String[] args) {
        int a = 1, b = 0;
        try {
            int result = a/b;
            System.err.println("Result : " + result);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            //System.out.println("Can't divided by zero");
        } finally{
            System.err.println("ArithmeticException handled");
        }
    }
}
