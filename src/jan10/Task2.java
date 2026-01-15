/*
Create a class with a method that prints “This is parent class” and its subclass with another method that prints “This is child class”. Now, create an object for each of the class and call
1.	Method of parent class by object of parent class
2.	Method of child class by object of child class
3.	Method of parent class by object of child class

 */
package jan10;

class Parent{
    
    public void parentMethod(){
        System.out.println("This is a Parent Class");
    }
}
class Child extends Parent{

    public void childMethod(){
        System.out.println("This is a Child Class");  
    }
    
}

public class Task2 {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.parentMethod();
        
        Child c = new Child();
        c.childMethod();
        
        Parent p1 = new Child();
        p1.parentMethod();
        
    }
}
