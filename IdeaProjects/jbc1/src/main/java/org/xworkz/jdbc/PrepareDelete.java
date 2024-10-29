package org.xworkz.jdbc;

import org.xworkz.jdbc.exception.IdNotFoundException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrepareDelete {
    private static final String url = "jdbc:mysql://localhost:3306/guice";
    private static final String username = "root";
    private static final String password = "Padma@9844437732";
    static int id = 0;

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            Connection connection = DriverManager.getConnection(url,username,password);
            String query = "Delete from adds where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,1);
            preparedStatement.execute();
            if(id == 0){
                IdNotFoundException exception = new IdNotFoundException("Id is not found");
                throw exception;
            }
        } catch (SQLException | IdNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
