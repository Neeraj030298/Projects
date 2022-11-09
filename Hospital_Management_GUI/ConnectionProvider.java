/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 */
public class ConnectionProvider {
    public static  Connection getcon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagement", "root", "qwerty@123");
            return con;
        } 
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
           return null; 
        }
    }
}
