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
class Person{
    public void disply(){
        System.out.println("This is a Person");
    }
}
class Teacher extends Person{
    public void show() {
        System.out.println("This is a teacher"); 
    }  
}
public class Q2 {
    public static void main(String[] args) {
        Person p = new Person();
        p.disply();
        
        System.out.println(":::::::::");
        
        Teacher t = new Teacher();
        t.disply();
        t.show();
    }
}
