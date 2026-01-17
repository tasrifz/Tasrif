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
class Bank{
    public void getInterest(){
        System.out.println("This bank interest is 5%");
    }
}
class DBBL extends Bank{

    @Override
    public void getInterest() {
        System.out.println("This bank interest is 6%"); //To change body of generated methods, choose Tools | Templates.
    }
}
class BracBank extends Bank{

    @Override
    public void getInterest() {
        System.out.println("This bank interest is 6.5%"); //To change body of generated methods, choose Tools | Templates.
    }
}

public class Q3 {
    public static void main(String[] args) {
        Bank b = new DBBL();
        b.getInterest();
        
        System.out.println("::::::::::");
        
        Bank b1 = new BracBank();
        b1.getInterest();
    }
}
