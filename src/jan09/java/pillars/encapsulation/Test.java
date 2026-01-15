/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan09.java.pillars.encapsulation;

/**
 *
 * @author TASRIF ZAMAN
 */
class Student{
    private int id;
    private String name;
    private double age;

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

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student Details : { " + "Id= " + id + ", Name= " + name + ", Age= " + age + '}';
    }
}

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setId(101);
        s.setName("Tasrif");
        s.setAge(28);
        System.out.println(s);
    }
}
