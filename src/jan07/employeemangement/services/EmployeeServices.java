/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan07.employeemangement.services;


import jan07.employeemangement.dao.EmployeeDAO;
import jan07.employeemangement.model.Employee;

/**
 *
 * @author TASRIF ZAMAN
 */
public class EmployeeServices {

    public Employee save(Employee e) {
        EmployeeDAO edao = new EmployeeDAO();
        return edao.insert(e);
    }
}
