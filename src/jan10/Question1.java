/*
 Question 1

Create two classes Employee and Manager.
Requirements:

Employee class will have a method work() that prints “Employee is working”.Manager class will inherit Employee and override the work() method to print
“Manager is managing”.
In main():

1.call parent method using parent object

2.call overridden method using parent reference and child object

3.Explain which type of polymorphism is demonstrated
 */
package jan10;

/**
 *
 * @author TASRIF ZAMAN
 */
class Employee{
    public void work(){
        System.out.println("Employee is Working");
    }
}
class Manager extends Employee{

    @Override
    public void work() {
        System.out.println("Manager is managing"); //To change body of generated methods, choose Tools | Templates.
    } 
}

public class Question1 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.work();
        
        System.out.println(":::::::");
        
        Employee e1 = new Manager();
        e1.work();
    }
}
