package com.isil.pc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class MainApp {
    public static  void main(String[] args) throws Exception{
 Class.forName("com.mysql.cj.jdbc.Driver");
 
 Connection con = DriverManager.getConnection(
         "jdbc:mysql://localhost:3306/hotelpc1",
         "root",
         "");

    Statement Stmt= con.createStatement();


    ResultSet result= Stmt.executeQuery("select * from clientes");


    while (result.next()){
        System.out.println(result.getString("idCli"));
        System.out.println(result.getString("paisCli"));
        System.out.println(result.getString("nombreCli"));
        System.out.println(result.getString("apellidoCli"));
        System.out.println(result.getString("direccionCli"));
        System.out.println(result.getString("telefonoCli"));
    }

    }

}
