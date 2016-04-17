package com.common;


import java.sql.*;
 
/**
 * Clase que permite conectar con la base de datos
 * @author Alfredo Guerrero Gomez
 *
 */
public class DbConnection {
	
   /**Parametros de conexion*/
   static String bd = "PToH";
   static String login = "PToH";
   static String password = "123456";
   static String url = "jdbc:mysql://54.186.132.178/"+bd;
 
   Connection connection = null;
 
   /** Constructor de DbConnection */
   public DbConnection() {
      try{
         //obtenemos el driver de para mysql
         Class.forName("com.mysql.jdbc.Driver");
         //obtenemos la conexión
         connection = DriverManager.getConnection(url,login,password);
 
         if (connection!=null){
            System.out.println("Conexión a base de datos "+bd+" OK\n");
         }
      }
      catch(SQLException e){
         System.out.println(e);
      }catch(ClassNotFoundException e){
         System.out.println(e);
      }catch(Exception e){
         System.out.println(e);
      }
   }
   
   /**Permite retornar la conexión*/
   public Connection getConnection(){
      return connection;
   }
 
   public void desconectar(){
      connection = null;
   }
}