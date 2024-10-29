package org.xworkz.jdbc;

import java.sql.*;

public class GuicePreparedFetch {
    private static final String url = "jdbc:mysql://localhost:3306/guice";
    private static final String username = "root";
    private static final String password = "Padma@9844437732";

    public static void main(String[] args) {
       /* try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }*/
        try {
            Connection connection = DriverManager.getConnection(url,username,password);
            String query = "Select * from adds where name = ? and id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "guava");
            preparedStatement.setInt(2,5);
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println(resultSet);
            if(resultSet.next()){
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString(3));
                System.out.println(resultSet.getInt(4));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
