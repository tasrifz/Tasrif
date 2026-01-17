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
interface Animal{
    void sound();
}
class Dog implements Animal{

    @Override
    public void sound() {
        System.out.println("The Dog is Barking");//To change body of generated methods, choose Tools | Templates.
    }    
}
class Cat implements Animal{

    @Override
    public void sound() {
        System.out.println("The Cat is Meowing");//To change body of generated methods, choose Tools | Templates.
    }    
}
public class Q6 {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        
        System.out.println(":::::::");
        
        Animal a1 = new Cat();
        a1.sound();
    }
}
