/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan09.java.pillars.inheritance;

/**
 *
 * @author TASRIF ZAMAN
 */

class Car{
    public void carEngine(){
        System.out.println("Car Engine is well");
    }
}
class BMW extends Car{
    @Override
    public void carEngine() {
        System.out.println("BMW engine is well"); //To change body of generated methods, choose Tools | Templates.
    }
    
}
public class Test {
    public static void main(String[] args) {
      Car c = new Car();
      c.carEngine();
      
        System.out.println("::::::::::::::::");
        
      Car car = new BMW();
      car.carEngine();
      
        System.out.println(":::::::::::::::::");
      
      BMW b = new BMW();
      b.carEngine();
    }
}
