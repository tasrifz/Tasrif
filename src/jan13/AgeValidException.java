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
public class AgeValidException {
    public static void main(String[] args) {
        int age = -5;
        try {
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negetive ");
            } else if(age >= 18){
                System.out.println("Elegible for vote");
            } else{
                System.out.println("Not elegible for vote");
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } finally{
            System.err.println("Age check completed");
        }
    }
}
