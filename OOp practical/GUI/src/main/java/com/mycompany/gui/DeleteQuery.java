/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gui;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
public class DeleteQuery {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int idValue= inp.nextInt();
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
            //Creating Connection
            //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db",user:"root",password:"");            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db","root","");
        String query = "delete from tbl_mydb where id="+idValue;
        PreparedStatement pst = con.prepareStatement(query);
        pst.executeUpdate();
        System.out.println("Record deleted sucessfully!!");
        
        
        
        
        }
        catch(SQLException |ClassNotFoundException ce){
            
        }
    }
    
}
