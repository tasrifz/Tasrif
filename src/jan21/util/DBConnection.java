/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan21.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Tasrif Zaman
 */
public class DBConnection {
    private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
    public static final String DB_URL = "jdbc:mysql://localhost:3306/swing_login";
    public static final String DB_USERNAME = "jdbc:mysql://localhost:3306/swing_login";
    public static final String DB_PASSWORD = "jdbc:mysql://localhost:3306/swing_login";
  

    public static Connection getConnection() {
       
        try {
            Class.forName(DRIVER_CLASS);
            Connection con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            return con;
        } catch (Exception e) {
        return null;
      }
    }
}
