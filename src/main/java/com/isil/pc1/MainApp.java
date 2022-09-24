package com.isil.pc1;

import java.sql.*;


public class MainApp {
    public static  void main(String[] args) throws Exception{
 Class.forName("com.mysql.cj.jdbc.Driver");
 
 Connection con = DriverManager.getConnection(
         "jdbc:mysql://localhost:3306/hotelpc1",
         "root",
         "");

    //Statement Stmt= con.createStatement();

    //ResultSet result= Stmt.executeQuery("select * from clientes");

    //PreparedStatement preparedStatement =
    //            con.prepareStatement("select * from clientes where nombreCli=? and apellidoCli=? ");

    //preparedStatement.setString(1, "Guillermo");
    //preparedStatement.setString(2, "Tolentino");

        //3. Crear statement
        //3.1 Statement mantenimiento
        Statement stCreate = con.createStatement();
        //**Insertar**//
        //int filasAfectadas=
        //       stCreate.executeUpdate("insert into Clientes Values (7,'Italia','Milusca','Macuri','Roma','988766822')");
        //System.out.println("Filas afectadas:" + filasAfectadas);

        //**Actualizar**//
        //int filasAfectadas=
        //        stCreate.executeUpdate("update clientes set nombreCli='Lady' where idCli=7");
        //System.out.println("Filas afectadas:" + filasAfectadas);

        //**Eliminar**//
        int filasAfectadas=
                stCreate.executeUpdate("delete from clientes where idCli=7");
        System.out.println("Filas afectadas:" + filasAfectadas);

        // 3.2 Statement consulta
        PreparedStatement preparedStatement =
                con.prepareStatement("select * from clientes where idCli=? ");

        preparedStatement.setInt(1,7);

    ResultSet resultSet2 = preparedStatement.executeQuery();

    //while (result.next()){
    //    System.out.println(result.getString("idCli"));
    //    System.out.println(result.getString("paisCli"));
     //   System.out.println(result.getString("nombreCli"));
        //   System.out.println(result.getString("apellidoCli"));
     //   System.out.println(result.getString("direccionCli"));
        //  System.out.println(result.getString("telefonoCli"));
    //}

        while(resultSet2.next()){
            System.out.println(resultSet2.getString("idCli") + "\n"+
                    resultSet2.getString("paisCli") + "\n"+
                    resultSet2.getString("nombreCli") + "\n"+
                    resultSet2.getString("apellidoCli") + "\n"+
                    resultSet2.getString("direccionCli") + "\n"+
                    resultSet2.getString("telefonoCli"));
        }
        con.close();
    }

}
