package travel.management.system;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conn {
    Connection c;
    Statement s;

    public Conn() {
        try {
            // Load JDBC driver (for MySQL)
            Class.forName("com.mysql.cj.jdbc.Driver");
            
         c = DriverManager.getConnection("jdbc:mysql:///travelmanagementsystem","root","PROJECTSEM2");
         s =c.createStatement();
        
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "JDBC Driver not found:\n" + e.getMessage(), "Driver Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database connection failed:\n" + e.getMessage(), "Connection Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}