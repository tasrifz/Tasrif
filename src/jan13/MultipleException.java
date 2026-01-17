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
public class MultipleException {
    public static void main(String[] args) {
        int a =20;
        String str = "abc";
        try {
            int b = Integer.parseInt(str);
            int result = a/b;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divided by Zero");
        } catch (NumberFormatException e){
            System.out.println("Invalid number foramat");
        } finally{
            System.out.println("Handled");
        }
    }
}
