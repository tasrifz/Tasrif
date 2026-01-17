/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan11.problemsolving;

import java.util.Scanner;

/**
 *
 * @author Tasrif Zaman
 */
public class GradeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Marks : ");
        double marks = sc.nextDouble();
       if(marks >= 60 && marks < 70){
            System.out.println("You got B");
        }else if(marks >= 70 && marks < 80){
            System.out.println("You got A");
    } else if(marks >= 80 && marks <= 100){
            System.out.println("You got A+");
    } else {
           System.out.println("You Failed");
    }
    }
}
