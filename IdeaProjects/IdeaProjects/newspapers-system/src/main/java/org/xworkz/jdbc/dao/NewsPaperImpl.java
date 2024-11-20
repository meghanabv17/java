package org.xworkz.jdbc.dao;

import org.xworkz.jdbc.exception.*;
import java.sql.*;

public class NewsPaperImpl implements NewsPaper {

    private static final String url = "jdbc:mysql://localhost:3306/newsPaper";
    private static final String username = "root";
    private static final String password = "Padma@9844437732";
    private static Connection connection;
    PreparedStatement preparedStatement;

@Override
    public NewsPaper[] getAllNewsPaper() {
        // Establish the connection
        try {
            connection = DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM paper";
            preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println("Id : "+resultSet.getInt("id"));
                System.out.println("Paper Name : "+ resultSet.getString("paperName"));
                System.out.println("Editor Name :"+ resultSet.getString("editorName"));
                System.out.println("Price of the paper: "+resultSet.getDouble("price"));
                System.out.println("Date :"+resultSet.getString("date"));
                System.out.println("Number of Articles :"+resultSet.getString("noOfArticle"));
                System.out.println("Number of pages: "+resultSet.getInt("noOfPages"));
                System.out.println("Language of the paper: "+resultSet.getString("language"));
            }

            // Print all newspapers for verification
            System.out.println("Get all the information successfully");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                   connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

//get all the details by using collection;
    /*@Override
    public NewsPaper[] getAllNewsPaper() {
        List<NewspaperDto> newspaperDtos = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //load and register
        try {
            connection = DriverManager.getConnection(url,username,password);
            String query = "select * from paper";
            preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                NewspaperDto newspaperDto = new NewspaperDto(
                resultSet.getInt("id"),
                resultSet.getString("paperName"),
                resultSet.getInt("noOfPages"),
                resultSet.getString("language"),
                resultSet.getDouble("price"),
                resultSet.getString("editorName"),
                resultSet.getString("date"),
                resultSet.getInt("noOfArticle"));

                newspaperDtos.add(newspaperDto);
            }
            newspaperDtos.forEach(System.out::println);

            System.out.println(resultSet);
            System.out.println("Get all the information successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return new NewsPaper[0];
    }*/

    @Override
    public NewsPaper addpapers() {
        try {
            connection = DriverManager.getConnection(url, username, password);
            String query = "insert into paper values(?,?,?,?,?,?,?,?)";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,9);
            preparedStatement.setString(2,"Udayavani");
            preparedStatement.setInt(3,12);
            preparedStatement.setString(4,"kannada");
            preparedStatement.setDouble(5,6.0);
            preparedStatement.setString(6,"Uday");
            preparedStatement.setString(7,"30/08/2024");
            preparedStatement.setInt(8,59);
            preparedStatement.execute();
            System.out.println("Insert succesfully...!!!");
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    //getNewsPaperByDate
    public NewsPaper getNewsPaperByDate(String date) {
        try {
            connection = DriverManager.getConnection(url, username, password);
            String query = "select paperName from paper where date = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, date);
            ResultSet resultSet = preparedStatement.executeQuery();

            //Date not found exception;
            if (!resultSet.next()) {
                DateNotFoundException dateNotFoundException = new DateNotFoundException("Date not found");
                throw  dateNotFoundException;
            }
            System.out.println("Newspaper Name: " + resultSet.getString("paperName"));
            System.out.println("Get newspaper name successfully");
        } catch (SQLException | DateNotFoundException e) {
            e.printStackTrace();
        }
            return null;
    }


    @Override
    //getNewsPaperByLang
    public NewsPaper getNewsPaperByLang(String language) {
        try {
            connection = DriverManager.getConnection(url, username, password);
            String query = "select papername from paper where language = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,language);
            ResultSet resultSet = preparedStatement.executeQuery();

            //PaperNameNotFoundException
            if(!resultSet.next()){
                PaperNameNotFoundException paperNameNotFoundException = new PaperNameNotFoundException("Name not found");
                throw paperNameNotFoundException;
            }
            System.out.println("Newspaper Name: " + resultSet.getString("paperName"));
            System.out.println("Get newspaper name successfully");
        }catch (SQLException |PaperNameNotFoundException e){
            e.printStackTrace();
        }
            return null;
    }

    @Override
    public NewsPaper getNewsPaperById(int id) {
        try {
            connection = DriverManager.getConnection(url,username,password);
            String query = "select paperName from paper where id = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();

            //Papername not found exception;
            if(!resultSet.next()){
                PaperNameNotFoundException paperNameNotFoundException = new PaperNameNotFoundException("Name not found");
                        throw paperNameNotFoundException;
            }
            System.out.println("Newspaper Name: " + resultSet.getString("paperName"));
            System.out.println("Get newspaper name successfully");

        } catch (SQLException | PaperNameNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public NewsPaper getPaperNofPagesByLanguage(String language) {
        try {
            connection = DriverManager.getConnection(url,username,password);
            String query = "select noOfPages from paper where language = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,language);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(!resultSet.next()){
                NoOfPagesNotFoundException noOfPagesNotFoundException = new NoOfPagesNotFoundException("Entered language is not found");
                throw noOfPagesNotFoundException;
            }
            System.out.println("No of pages of the given language is: "+ resultSet.getInt("noOfPages"));
            System.out.println("Get paper language successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public NewsPaper getNoOfArticlesById(int id) {
        try{
            connection = DriverManager.getConnection(url,username,password);
            String query = "select noofArticle from paper where id= ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(!resultSet.next()){
                IdNotFoundException idNotFoundException = new IdNotFoundException("Entered id is not found");
                throw idNotFoundException;
            }
            System.out.println("Number of article of given id is: "+resultSet.getInt("noOfArticle"));
            System.out.println("Get number of article successfully");
        }catch (SQLException |IdNotFoundException e ){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public NewsPaper getDateById(int id) {
        try{
            connection = DriverManager.getConnection(url,username,password);
            String query = "select date from paper where id = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(!resultSet.next()){
                IdNotFoundException idNotFoundException = new IdNotFoundException("Entered id is not available");
                throw idNotFoundException;
            }
            System.out.println("The date of the given id is: "+resultSet.getString("date"));
            System.out.println("Getting a date successfully");
        }catch(SQLException | IdNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public NewsPaper UpdateNoOfArticlesByDate(String date,int noOfArticle) {
        try{
            connection = DriverManager.getConnection(url,username,password);
            String query = "update paper set noOfArticle =? where date = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,noOfArticle);
            preparedStatement.setString(2,date);
            int resultSet = preparedStatement.executeUpdate();
            System.out.println("Updated successfully...!!!");
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public NewsPaper deleteNewsPaperById(int id) {
        try{
            connection = DriverManager.getConnection(url,username,password);
            String query = "delete from paper where id = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,id);
            int resultSet = preparedStatement.executeUpdate();
            System.out.println("Deleted sucessfully");
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}
