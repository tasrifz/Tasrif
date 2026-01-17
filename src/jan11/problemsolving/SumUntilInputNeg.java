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
public class SumUntilInputNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer : ");
        int sum = 0;
        int num;
        while (true) {            
            num = sc.nextInt();
            if (num == -1) {
                break;
            }
            sum += num;
        }
        System.out.println("Sum of integer until input Negetive : " + sum);
    }
}
