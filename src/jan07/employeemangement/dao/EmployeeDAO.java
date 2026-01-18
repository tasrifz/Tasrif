/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan07.employeemangement.dao;

import jan07.employeemangement.ui.Employee;
import jan07.employeemangement.ui.EmployeeUI;
import jan07.employeemangement.util.DBConnection;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author TASRIF ZAMAN
 */
public class EmployeeDAO {

    public Employee insert(Employee e) {
        int id = e.getId();
        String fn = e.getFname();
        String ln = e.getLname();
        String desig = e.getDesig();
        String dept = e.getDept();
        double salary = e.getSalary();
        int age = e.getAge();
        String addr = e.getAddr();
        String sql = "INSERT INTO EMPLOYEE (id, fname, lname , designation, department, salary,age, address) VALUES ('"+id+"','"+fn+"','"+ln+"','"+desig+"','"+dept+"','"+salary+"','"+age+"','"+addr+"')";
        
         try {
            Connection con = DBConnection.getConnection();
            
            Statement stmt = con.createStatement();
            
            int Status = stmt.executeUpdate(sql);
               if (Status > 0) {
                   System.out.println("Inserted");
                   JOptionPane.showMessageDialog(new EmployeeUI(),"Inserted");
             
               } else {
                   System.out.println("Fail");
             }
        } catch (Exception exp) {
             System.out.println(exp);
        }
        return e;
    } 
}

    