/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan07.employeemangement.Controller;


import jan07.employeemangement.model.Employee;
import jan07.employeemangement.services.EmployeeServices;

/**
 *
 * @author TASRIF ZAMAN
 */
public class EmployeeController {

    public Employee create(Employee e) {
        EmployeeServices ec = new EmployeeServices();
        Employee emp = ec.save(e);
                return emp;
    }
}
