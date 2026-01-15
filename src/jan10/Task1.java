/*
 Task 1

Create a Shape superclass with a method area().
Create two subclasses Circle and Rectangle.
Use polymorphism in main() so that a Shape reference can call the correct area() implementation for each object.

Requirements:

*use method overriding

*show input and output clearly

*calculate real areas
 */
package jan10;

import java.util.Scanner;

/**
 *
 * @author TASRIF ZAMAN
 */
class Shape{
    double area(){
        return 0.0;
    };
}
class Circle extends Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    Circle() {
         //To change body of generated methods, choose Tools | Templates.
    }
    
   

    

    
    @Override
    double area() {
        return Math.PI * radius * radius; //To change body of generated methods, choose Tools | Templates.
    }
}
   class Rectangle extends Shape{
      double length,width;
      Rectangle (double length,double width){
        this.length = length;
        this.width = width;
    }

    Rectangle() {
        //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    double area() {
        return length * width; //To change body of generated methods, choose Tools | Templates.
   
  }
}
   public class Task1 {
       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter radius of the Circle");
           double r = sc.nextDouble();
           
           Shape s1 = new Circle();
           
           System.out.println("Enter length of rectangle");
           double l = sc.nextDouble();
           
           System.out.println("Enter width of the rectangle");
           double w = sc.nextDouble();
           Shape s2 = new Rectangle(l,w);
           
           System.out.println("Area of the Circle : " + s1.area());
           System.out.println("Area of the Rectangle : " + s2.area());
       }
}
  
