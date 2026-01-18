/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan07.employeemangement.ui;

/**
 *
 * @author TASRIF ZAMAN
 */
public class Employee {
    private int id;
    private String fname;
    private String lname;
    private String desig;
    private String dept;
    private double salary;
    private int age;
    private String addr;

    public Employee(int id, String fname, String lname, String desig, String dept, double salary, int age, String addr) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.desig = desig;
        this.dept = dept;
        this.salary = salary;
        this.age = age;
        this.addr = addr;
    }

    public Employee() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

   
}
