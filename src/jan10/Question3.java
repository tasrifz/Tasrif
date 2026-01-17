/*
Requirements:

Create a class Calculator.

Implement a method add() in three different ways (overloading):

add(int a, int b) → returns sum of two integers

add(double a, double b) → returns sum of two doubles

add(int a, int b, int c) → returns sum of three integers

In main() method:

Call all three versions of add() with appropriate parameters.
Explain why this is called Compile-Time Polymorphism.

*/
package jan10;

/**
 *
 * @author TASRIF ZAMAN
 */
class Calculator {
    public int toAdd(int a, int b){
        return a + b;
    }
     public double toAdd(double a, double b){
        return a + b;
    }
     public int toAdd(int a, int b, int c){
        return a + b + c;
    }
     
}

public class Question3 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Sum of 2 integers: " + c.toAdd(2 , 5));
        System.out.println("Sum of 2 integers: " + c.toAdd(4.0, 5.5));
        System.out.println("Sum of 2 integers: " + c.toAdd(2, 5, 7));
        
    }
}
