package org.xworkz.jdbc.dao;

import org.xworkz.jdbc.dto.AddsDto;
import org.xworkz.jdbc.exception.IdNotFoundException;

import java.sql.*;

public class GuiceDaoImpl implements GuiceDao {
    private static final String url = "jdbc:mysql://localhost:3306/guice";
    private static final String username = "root";
    private static final String password = "Padma@9844437732";
    int id = 0;


    @Override
    public void insertGuice(AddsDto addsDto) {
        Connection connection = null;
        Statement statement = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

            try {
                connection = DriverManager.getConnection(url, username, password);
                String query = "insert into adds (id, name, quantity, price) values(?,?,?,?)";

                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1, addsDto.getId());
                preparedStatement.setString(2, addsDto.getName());
                preparedStatement.setInt(3, addsDto.getQuantity());
                preparedStatement.setDouble(4, addsDto.getPrice());
                preparedStatement.execute();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

           finally{
                if(connection != null) {
                    try {
                        connection.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
}
