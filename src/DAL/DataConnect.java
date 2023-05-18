/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author NGUYEN THI KIM DUNG
 */
public class DataConnect {
    public static String dbURL = "jdbc:oracle:thin:@localhost:1521:orcl";
    public static String username;
    public static String password;
    public static Connection Connect = null;
    
    public static Connection getConnectionString()
    {
        try{
            //load the driver class  
            Class.forName("oracle.jdbc.driver.OracleDriver");  
            if(username.equals("sys"))
                username += " as sysdba"; 
            return DriverManager.getConnection(dbURL, username, password);   
        }
        catch(Exception err)
        {
            return null;
        } 
    }
}
