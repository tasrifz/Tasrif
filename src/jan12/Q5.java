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
class Vehicle{
    public void run(){
        System.out.println("Vehicle is running");
    }
}
class Car extends Vehicle{
    @Override
    public void run(){
        System.out.println("Car is running");
    }
}

public class Q5 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.run();
        System.out.println(":::::::");
        
        Vehicle v1 = new Car();
        v1.run();
    }
}
