package org.xworkz.jdbc;

import java.sql.*;

public class Malls {
    public static final String url = "jdbc:mysql://localhost:3306/Malls";
    public static final String username = "root";
    public static final String password = "Padma@9844437732";


    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM mall";
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println("Id : " + resultSet.getInt("id"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}