    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan12;

/**
 *
 * @author TASRIF ZAMAN
 */
class Calculator{
    public int add(int a, int b){
        return a + b;
    }
    public double add(double a, double b){
        return a + b;
    }
    public int add(int a, int b,int c){
        return a + b+ c;
    }
}
public class Q4 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of two Integer :"+ calc.add(3, 2));
        System.out.println("Sum of Double :"+calc.add(3.5, 2.5));
        System.out.println("Sum of three Integer :"+calc.add(3, 2,4));
    }
}
