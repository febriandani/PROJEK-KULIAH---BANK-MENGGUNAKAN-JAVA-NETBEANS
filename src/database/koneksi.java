/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import com.mysql.jdbc.Connection;
import java.sql.*;

/**
 *
 * @author Dani
 */
public class koneksi {

   private static Connection koneksi;
   public static Connection getkoneksi(){
       if(koneksi == null){
           try{
               String url = "jdbc:mysql://localhost:3306/db_bank";
               String user = "root";
               String password = "";
               DriverManager.registerDriver(new com.mysql.jdbc.Driver());
               koneksi = (Connection) DriverManager.getConnection(url, user, password);
           }catch(SQLException e){
               System.out.println("Koneksi eror");
           }
       }
        return koneksi;
   }
  
}
