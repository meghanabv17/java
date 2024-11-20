package com.xwork.entertainment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteEntertainment {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("load to database");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String url="jdbc:mysql://localhost:3306/entertainments";
        String userName="root";
        String  password="Padma@9844437732";
        try {
            Connection connection=DriverManager.getConnection(url,userName,password);
            System.out.println("connection is established");
            //createStatement is present in connection
            Statement statement=connection.createStatement();
            String query="delete from movies where id=4";
            int result=statement.executeUpdate(query);
            System.out.println(result);
            System.out.println("Update data into database");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
    }
}
