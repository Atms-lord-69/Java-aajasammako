
package com.mycompany.gui;
import java.sql.*;
public class SelectQuery {
 public static void main(String[] args) {
        try{
            //Loading driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Creating Connection
            //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db",user:"root",password:"");            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db","root","");
//Create statment
            Statement st = con.createStatement();
            //Creating query
            String qry = "select *from tbl_mydb";
            //Executing Query
            ResultSet rs = st.executeQuery(qry);
            while(rs.next()){
                System.out.print(rs.getString("name")+" ");
                System.out.print(rs.getInt("age")+" ");
                System.out.print(rs.getString("address")+" ");
                
            }
            
        }
        catch(SQLException |ClassNotFoundException cs){
            
        }
    }   
}
