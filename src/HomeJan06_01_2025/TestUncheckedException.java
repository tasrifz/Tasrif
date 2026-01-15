/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeJan06_01_2025;

/**
 *
 * @author TASRIF ZAMAN
 */
public class TestUncheckedException {
    static class InvalidAgeException extends Exception{

        public InvalidAgeException(String message) {
            super(message);
        }

        private InvalidAgeException() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
     static void checkAge (int age) throws InvalidAgeException{  // method declaration // not handle exception
         if (age < 18) {
             throw new InvalidAgeException("Not valid"); // create object or expession // inside the body
         } 
    }
    
    public static void main(String[] args) {
        
        try {
            checkAge(16);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
