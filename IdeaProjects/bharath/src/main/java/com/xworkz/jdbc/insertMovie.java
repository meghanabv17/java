package com.xworkz.jdbc;

import java.sql.*;

public class insertMovie {
    private static final String url = "jdbc:mysql://localhost:3306/entertainments";
    private static final String userName = "root";
    private static final String password = "Padma@9844437732";
    public static void main(String[] args) {
        //load and register
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();
            String query = "insert into movie values (2,'Three', 'mnjk', 'telugu')";

            int ref = statement.executeUpdate(query);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
