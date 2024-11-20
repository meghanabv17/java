package com.xworkz.jdbc;

import java.sql.*;

public class movies {
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
            String query = "select * from movie";
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String director = resultSet.getString("director");
                String language = resultSet.getString("language");
                System.out.println(id);
                System.out.println(name);
                System.out.println(director);
                System.out.println(language);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
