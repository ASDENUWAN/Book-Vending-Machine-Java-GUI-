/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Sachii
 */
public class Connect {
    public static Connection getConnection() { 
        // SQLite connection string
        String url = "jdbc:sqlite:src/database/libraryDb.db"; 
        Connection conn = null; 
        try {
            conn = DriverManager.getConnection(url); 
            if(conn==null)
                System.out.println("database not Connected");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
        return conn;
    }

    
}
