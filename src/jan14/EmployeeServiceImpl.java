/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan14;

import java.util.HashMap;
import java.util.Map;



/**
 *
 * @author TASRIF ZAMAN
 */
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public Map<Integer, Employee> getEmployee() {
        
     Map<Integer, Employee> employeeMap = new HashMap<>();
      
      employeeMap.put(101, new Employee(101, "Tasrif", 50000.00, 28) );
      employeeMap.put(101, new Employee(102, "Mahadi", 45000.00, 27) );
      employeeMap.put(101, new Employee(103, "Zayed", 40000.00, 26) );
      employeeMap.put(101, new Employee(104, "Raisul", 30000.00, 28) );
        
      return employeeMap;
    }
}
