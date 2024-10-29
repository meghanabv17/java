package com.xwork.entertainment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Entertainment {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Load the Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/entertainments","root","9353579405");
            System.out.println("connection to database is established");
            Statement statement=connection.createStatement();
            String query="INSERT INTO MOVIES VALUES(1,'KGF','lavanya','Kannada')";
            statement.execute(query);
             } catch (SQLException e) {
            throw new RuntimeException(e);
        }




    }
}
