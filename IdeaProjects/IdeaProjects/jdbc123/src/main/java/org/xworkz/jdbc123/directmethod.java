package org.xworkz.jdbc123;

import java.sql.*;

public class directmethod {

    public static final String url = "jdbc:mysql://localhost:3306/Movie";
    public static final String username = "root";
    public static final String password = "Padma@9844437732";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            String query = "select * from Movie_details";
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String language = resultSet.getString("language");
                System.out.println(id);
                System.out.println(name);
                System.out.println(language);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
