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
class Student{
    private int id;
    private String name;
    private double marks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student details : {" + " Id= " + id + ", Name= " + name + ", Marks= " + marks + '}';
    }
    
}
public class Q1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setId(1292685);
        s1.setName("Tasrif");
        s1.setMarks(3.45);
        System.out.println(s1);
    }
}
