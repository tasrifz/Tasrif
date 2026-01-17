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
public class PrimeNumber {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.print("Enter number of terms : ");
           int n = sc.nextInt();
           boolean isPrime = true;
           if (n <= 1) {
              isPrime = false;
        } else {
               for (int i = 2; i <= n/2; i++) {
                   if (n % i == 0) {
                       isPrime = false;
                        break;
                   }
               }
        }
           if (isPrime) {
               System.out.println(n + " is a Prime Number");
        } else {
               System.out.println(n + " is not a Prime Number");

        }
    }
}
