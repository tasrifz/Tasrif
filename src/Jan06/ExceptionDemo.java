/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jan06;

/**
 *
 * @author Tasrif Zaman
 */
public class ExceptionDemo {
    public static void main(String[] args) {

        try {
            int a = 10, b = 0;
            int result = a / b;   
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception handled: " + e);
        }

        try {
            int arr[] = {10, 20, 30};
            System.out.println(arr[5]);   
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception handled: " + e);
        }

        try {
            String str = null;
            System.out.println(str.length());  
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception handled: " + e);
        }

        System.out.println("Program executed normally");
    }
}

