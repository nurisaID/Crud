package connection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Write a description of class databaseConn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class databaseConn
{
    private static Connection conn;
    
    public static Connection getConnection(){
        if(conn==null){
            try{
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                
                
                conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/test", "root", "");
                
            } catch(SQLException ex) {
                Logger.getLogger(databaseConn.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return conn;
    }
}
