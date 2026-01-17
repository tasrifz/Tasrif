/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan13;

/**
 *
 * @author TASRIF ZAMAN
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int a = 1, b = 0;
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception handled : " + e);
        }
        try {
            int [] arr = {2,3,4,7};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled " + e );
        }
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled " + e);
        }
        System.out.println("Program Execute normally");
    }
}
