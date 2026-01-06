/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empmgt.model;

/**
 *
 * @author Tasrif Zaman
 */
public class Employee {
    private int id;
    private String fname;
    private String lname;
    private String deg;
    private String dpt;
    private String age;
    private String addr;

    public Employee(int id, String fname, String lname, String deg, String dpt, String age, String addr) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.deg = deg;
        this.dpt = dpt;
        this.age = age;
        this.addr = addr;
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

    public String getDeg() {
        return deg;
    }

    public void setDeg(String deg) {
        this.deg = deg;
    }

    public String getDpt() {
        return dpt;
    }

    public void setDpt(String dpt) {
        this.dpt = dpt;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
    
}
