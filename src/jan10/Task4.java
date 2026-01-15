/*
(Inheritance with method overriding)
Create a class Vehicle and create a method name vehicleRun, create another class name Car and inherit the vehicle class,
Override the vehicleRun method in the Car class and print the both methods 

 */
package jan10;

/**
 *
 * @author TASRIF ZAMAN
 */
class Vehicle{
    public void vehicleRun(){
        System.out.println("The Viehicle Running");
    }
}
class Car extends Vehicle{

    @Override
    public void vehicleRun() {
        System.out.println("The car is running"); //To change body of generated methods, choose Tools | Templates.
    }
    
}
public class Task4 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.vehicleRun();
        
        System.out.println("::::::::::");
        
        Vehicle v1 = new Car();
        v1.vehicleRun();
    }
}
