/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jan06;
import java.util.HashMap;
import java.util.Map;

public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public Map<Integer, Employee> getEmployees() {

        Map<Integer, Employee> employeeMap = new HashMap<>();

        employeeMap.put(101, new Employee(101, "Zayed", 50000, 25));
        employeeMap.put(102, new Employee(102, "Mahadi", 60000, 28));
        employeeMap.put(103, new Employee(103, "Tasrif", 55000, 26));
        employeeMap.put(104, new Employee(104, "Sefat", 65000, 30));

        return employeeMap;
    }
}