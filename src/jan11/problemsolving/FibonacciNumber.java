/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan11.problemsolving;

import java.util.Scanner;

/**
 *
 * @author TASRIF ZAMAN
 */
public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of temrs : ");
        int n = sc.nextInt();
         int a = 0;
         int b = 1;
         System.out.print("Fibonacci series of " + n  + " is : ");
         
         for (int i = 1; i <= n; i++) {
             System.out.print( a + " ");
             int next = a + b;
             a = b;
             b = next;   
        }
         System.out.println(" ");
    }
}
