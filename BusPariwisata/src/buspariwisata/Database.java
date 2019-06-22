/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buspariwisata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author xatalie
 */
public class Database {
    public Connection conn;
    public Database(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost/buspariwisata","root","");
            Statement stm = conn.createStatement();
            System.out.println("Connection Success");
        }catch(Exception e){
            System.out.println("Connection Failed");
        }
    }
}
