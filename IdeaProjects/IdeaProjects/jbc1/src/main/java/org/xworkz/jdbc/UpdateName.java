package org.xworkz.jdbc;

import java.sql.*;

public class UpdateName {
    private static final String url = "jdbc:mysql://localhost:3306/guice";
    private static final String username = "root";
    private static final String password = "Padma@9844437732";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            Connection connection = DriverManager.getConnection(url,username,password);
            //Statement statement = connection.createStatement();
            String query = "update adds set name= 'Cherry' where id=20";
            //String query1 = "update adds set name= 'Bb' where id=3";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
           // String query = "delete from adds where id=2";
            int ref = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
