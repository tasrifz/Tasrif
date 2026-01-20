/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan11.problemsolving;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author TASRIF ZAMAN
 */
public class SortedReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + "array is ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); 
        }
        System.out.println("Original array is : " + Arrays.toString(arr)); 
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Reverse sorted array is : " + Arrays.toString(arr));
    }
}
