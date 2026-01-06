/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jan06;

import java.util.*;


interface EmployeeService {
    void addEmployee(Employee e);
    Employee getEmployeeById(int id);
    Map<Integer, Employee> getAllEmployees();
}


class Employee {
    int id;
    String name;
    double salary;
    int age;

    Employee(int id, String name, double salary, int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + salary + " " + age;
    }
}


class EmployeeServiceImpl implements EmployeeService {

    Map<Integer, Employee> empMap = new HashMap<>();

    public void addEmployee(Employee e) {
        empMap.put(e.id, e);
    }

    public Employee getEmployeeById(int id) {
        return empMap.get(id);
    }

    public Map<Integer, Employee> getAllEmployees() {
        return empMap;
    }
}

 class EmployeeDemo {
    public static void main(String[] args) {

        EmployeeService service = new EmployeeServiceImpl();

        Employee e1 = new Employee(101, "Rahim", 40000, 25);
        Employee e2 = new Employee(102, "Karim", 30000, 30);
        Employee e3 = new Employee(103, "Kalam", 50000, 35);
        Employee e4 = new Employee(104, "Pony", 20000, 32);

        service.addEmployee(e1);
        service.addEmployee(e2);
        service.addEmployee(e3);
        service.addEmployee(e4);

        System.out.println("Single Employee:");
        System.out.println(service.getEmployeeById(1));

        System.out.println("\nAll Employees:");
        for (Employee e : service.getAllEmployees().values()) {
            System.out.println(e);
        }
    }
}


