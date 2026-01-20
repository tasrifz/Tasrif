/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan19.swing_jdbc_id.util;

import static jan07.employeemangement.util.DBConnection.getConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Tasrif Zaman
 */
public class DBConnection {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your user ID: ");
        int userId = sc.nextInt();
        System.out.print("Enter your  User Name : ");
        String userName = sc.next();
        String sql = "INSERT INTO m_test(user_id, user_name) VALUES('"+userId+"','"+userName+"')";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/test";
            String user = "root";
            String password = "root";
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            
            int Status = stmt.executeUpdate(sql);
               if (Status > 0) {
                   System.out.println("Inserted");
             
               } else {
                   System.out.println("Fail");
             }
            
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception ex) {
            System.out.println(ex);
           
        } 
        
        // -----------------UPDATE-----------------
        System.out.print("Enter your user ID to update: ");
         int userId1 = sc.nextInt();
         sc.nextLine(); 

         System.out.print("Enter your new User Name: ");
         String userName1 = sc.nextLine();

         String sqlUpdate = "UPDATE m_test SET user_name = ? WHERE user_id = ?";

         try (Connection con = getConnection();
          PreparedStatement ps = con.prepareStatement(sqlUpdate)) {
            
            ps.setString(1, userName1); 
            ps.setInt(2, userId1);     

           int status = ps.executeUpdate();

           if (status > 0) {
               System.out.println("Updated Successfully");
           } else {
               System.out.println("User ID not found");
        }

         }catch (SQLException ex) {
              System.out.println(ex);;
        } catch (Exception e) {
              System.out.println(e);;
        }

    }
}
