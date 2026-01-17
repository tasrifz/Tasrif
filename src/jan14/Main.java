/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan14;

import java.util.Map;

/**
 *
 * @author TASRIF ZAMAN
 */
public class Main {
    public static void main(String[] args) {
        EmployeeServiceImpl esi = new EmployeeServiceImpl();
        Map<Integer, Employee> employees = esi.getEmployee();
        for (String arg : args) {
            
        }
    }
}
