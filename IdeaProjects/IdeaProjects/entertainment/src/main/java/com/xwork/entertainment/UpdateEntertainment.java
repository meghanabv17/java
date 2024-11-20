package com.xwork.entertainment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateEntertainment {
    public static void main(String[] args) {

        //update operation;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("load to database");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
                     //static  it contain url ps un
        String url="jdbc:mysql://localhost:3306/entertainments";
        String userName="root";
        String password="Padma@9844437732";
        try {
           Connection connection= DriverManager.getConnection(url,userName,password);
            System.out.println("connection to database is established");
            //statement is use for to write a multiple query
            
            Statement statement=connection.createStatement();
            String query4="INSERT INTO MOVIES VALUES(5,'RRR','Sanju','Kannada')";
            //set is a keyword,when we want to specify the table names use the set keyword
            String query="update movies set name='you' where id='3'";
            int result=statement.executeUpdate(query4);
            System.out.println(result);
            System.out.println("Update data into database");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
