/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gui;
import java.sql.*;
import java.util.*;
public class InsertQuery {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        System.out.print("Enter Name:-");
        String nameValue = imp.nextLine();
        System.out.print("Enter Age:-");
        int ageValue = imp.nextInt();
        System.out.print("Enter Address:-");
        String addressValue = imp.nextLine();
        addressValue=imp.nextLine();
        try{
            System.out.println("Hello");
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Creating Connection
            //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db",user:"root",password:"");            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db","root","");
            String query = "Insert into tbl_mydb(name,age,address) values(?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1,nameValue);
            pst.setInt(2,ageValue);
            pst.setString(3,addressValue);
            System.out.println("Hello5");
            pst.executeUpdate();
            System.out.println("Hello4");
            System.out.println("Record is inserted sucessfully!!!!!!!!!");
            
        }
        catch(SQLException |ClassNotFoundException ce){
            
        }
    
  }
}
