package jan13;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TASRIF ZAMAN
 */
abstract class Shape{
   abstract void area();
}
class Circle extends Shape{

    @Override
     void area(){
        System.out.println("Circle"); 
    }    
}
class Rectangle extends Shape{

    @Override
     void area(){
        System.out.println("Rectangle");
    }   
}
public class Q1 {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.area();
        Shape s1 = new Rectangle();
        s1.area();   
    }
}
