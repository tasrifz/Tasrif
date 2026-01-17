/*
Question 2 – Bank Interest (Runtime Polymorphism)
Create a class Bank with a method getInterest() that prints "Bank interest is 5%".
Create subclasses DBBL and BracBank, and override getInterest() to print "DBBL interest is 6%" and "BracBank interest is 6.5%" respectively.

In main():
Create object of DBBL using Bank reference
Create object of BracBank using Bank reference
Call getInterest() for both objects
Explain why Bank ref = new DBBL(); is used instead of DBBL ref = new DBBL();.
 */
package jan10;

/**
 *
 * @author TASRIF ZAMAN
 */
class  Bank {
    public double getInterest(){
        return 5.0;
    }
}
class DBBL extends Bank{

    @Override
    public double getInterest() {
        return 6.0; //To change body of generated methods, choose Tools | Templates.
    }  
}
class BracBank extends Bank{

    @Override
    public double getInterest() {
        return 6.5; //To change body of generated methods, choose Tools | Templates.
    }  
}
public class Question2 {
    public static void main(String[] args) {
        Bank b1 = new DBBL();
        Bank b2 = new BracBank();
        //b1.getInterest();
        //b2.getInterest();
        System.out.println("DBBL Interest Rate : " + b1.getInterest());
        System.out.println("Brac Bank Interest Rate : " + b2.getInterest());
   }
}
