package com.xworkz.jdbc;

import java.sql.*;

public class Entertainment {

    private static final String url = "jdbc:mysql://localhost:3306/entertainments";  // Updated database name
    private static final String userName = "root";
    private static final String password = "Padma@9844437732";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection(url, userName, password);
            statement = connection.createStatement();
            String query = "INSERT INTO movie (id, Name, director) VALUES (21, 'aye', 'nanu')";
            int rowsAffected = statement.executeUpdate(query);
            System.out.println("Rows inserted: " + rowsAffected);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
