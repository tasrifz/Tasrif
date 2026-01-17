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
public class MaxMinNumber {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Integer : ");
        
        System.out.print("Enter Integer 1 : ");
        int first = sc.nextInt();
        int max = first;
        int min = first;
        
         for (int i = 2; i <= 3; i++) {
             System.out.print("Enter Integer " + i + " : ");
             int num = sc.nextInt();
             if (num > max) {
                 max = num;
             } if (num < min) {
                 min = num;
             }
       }
         System.out.println("Maximum Number is : " + max);
         System.out.println("Minimum Number is : " + min);
     }
 }
