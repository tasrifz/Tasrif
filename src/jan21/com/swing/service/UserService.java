/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan21.com.swing.service;


import jan21.com.swing.model.User;
import jan21.com.swing.util.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Tasrif Zaman
 */
public class UserService {
    Connection con;
    Statement stmt;
    
    public int addUser(User u){
        try {
            con = DBConnection.getConnection();
            stmt = con.createStatement();
            String sql = "INSERT INTO users(username,password) VALUES('"+u.getUsername()+"','"+u.getPassword()+"')";
            return stmt.executeUpdate(sql);
        } catch (Exception e) {
            return 0;
        }
    }
    
    public int loginUser(User u){
        try {
            con = DBConnection.getConnection();
            stmt = con.createStatement();
            String sql = "SELECT * FROM users WHERE username ='"+u.getUsername()+"' ";
            ResultSet rs = stmt.executeQuery(sql);
            rs.absolute(1);
            if (u.getPassword().equals(rs.getString("password"))) {
                return 1;
            } else {
                return 0;
            }
        } catch (Exception e) {
        }    return 0;
    }
}
