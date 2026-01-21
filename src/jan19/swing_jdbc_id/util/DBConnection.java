package jan19.swing_jdbc_id.util;


import java.sql.*;
import java.util.Scanner;

public class DBConnection {

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "root";
        Connection con = null;
        try {
             
            con = DriverManager.getConnection(url, user, password);
     
            // ---------------- INSERT ----------------
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your user ID: ");
            int userId = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter your User Name: ");
            String userName = sc.nextLine();

            String insertSQL = "INSERT INTO m_test(user_id, user_name) VALUES (?, ?)";
            PreparedStatement psInsert = con.prepareStatement(insertSQL);
            psInsert.setInt(1, userId);
            psInsert.setString(2, userName);

            if (psInsert.executeUpdate() > 0) {
                System.out.println("Inserted Successfully");
            }

            // ---------------- UPDATE ----------------
            System.out.print("Enter user ID to update: ");
            int updateId = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter new User Name: ");
            String newName = sc.nextLine();

            String updateSQL = "UPDATE m_test SET user_name = ? WHERE user_id = ?";
            PreparedStatement psUpdate = con.prepareStatement(updateSQL);
            psUpdate.setString(1, newName);
            psUpdate.setInt(2, updateId);

            if (psUpdate.executeUpdate() > 0) {
                System.out.println("Updated Successfully");
            } else {
                System.out.println("User ID not found");
            }

            // ---------------- GET ----------------
            String selectSQL = "SELECT user_id, user_name FROM m_test";
            PreparedStatement psSelect = con.prepareStatement(selectSQL);
            ResultSet rs = psSelect.executeQuery();

            System.out.println("\nUserID | UserName");
            System.out.println("------------------");
            while (rs.next()) {
                System.out.println(rs.getInt("user_id") + " | " + rs.getString("user_name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
