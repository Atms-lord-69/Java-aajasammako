/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gui;
import java.sql.*;
import java.util.*;
public class UpdateQuery {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        System.out.print("Enter Id:-");
        int idValue= imp.nextInt();
        System.out.print("Enter Name:-");
        String nameValue = imp.nextLine();
        nameValue = imp.nextLine();
        System.out.print("Enter Age:-");
        int ageValue = imp.nextInt();
        System.out.print("Enter Address:-");
        String addressValue = imp.nextLine();
        addressValue = imp.nextLine();
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
            //Creating Connection
            //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db",user:"root",password:"");            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db","root","");
            String query ="Update tbl_mydb set name='"+nameValue+"',age='"+ageValue+"',address='"+addressValue+"' where id="+idValue;
            PreparedStatement pst = con.prepareStatement(query);
            pst.executeUpdate();
            System.out.println("Record Updated sucessfully!!!!!");
            
        }
        catch(SQLException |ClassNotFoundException ce){
            
        }
    }
}
