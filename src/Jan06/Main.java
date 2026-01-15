/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jan06;

import java.util.Map;

public class Main {

    public static void main(String[] args) {

        EmployeeServiceImpl service = new EmployeeServiceImpl();
        Map<Integer, Employee> employees = service.getEmployees();

        employees.forEach((id, emp) -> {
            System.out.println(
                "ID: " + id +
                ", Name: " + emp.getName() +
                ", Salary: " + emp.getSalary() +
                ", Age: " + emp.getAge()
            );
        });
    }
}