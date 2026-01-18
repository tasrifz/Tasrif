/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan07.employeemangement.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author TASRIF ZAMAN
 */
public class DBConnection {
       static Connection con;
    public static Connection getConnection() {
         try {
             Class.forName("com.mysql.jdbc.Driver");
             String url = "jdbc:mysql://localhost:3306/employee_mgt";
             String user = "root";
             String password = "root";
             con = DriverManager.getConnection(url, user, password);
            
        } catch (Exception exp) {
             System.out.println(exp);
        }
        return con;
    }
    
}
