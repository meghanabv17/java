package org.xworkz.jdbc;

import com.mysql.cj.protocol.Resultset;

import java.sql.*;

public class GuiceName {
    private static final String url = "jdbc:mysql://localhost:3306/guice";
    private static final String username = "root";
    private static final String password = "Padma@9844437732";
    public static void main(String[] args) {
        //load and register;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
           Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            String query = "select * from adds";
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                System.out.println(id);
                String name = resultSet.getString("name");
                System.out.println(name);
                int quantity = resultSet.getInt("quantity");
                System.out.println(quantity);
                double price = resultSet.getDouble("price");
                System.out.println(price);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
