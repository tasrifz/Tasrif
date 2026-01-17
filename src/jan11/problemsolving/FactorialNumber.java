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
public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Integer : ");
        int n = sc.nextInt();
         int fact = 1;
         
         for (int i = 2; i <= n; i++) {
             fact *= i;
        }
         System.out.println("Factorial Number of " + n + " is : " + fact);
    }
}
