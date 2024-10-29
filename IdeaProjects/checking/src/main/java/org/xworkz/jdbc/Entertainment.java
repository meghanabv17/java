package org.xworkz.jdbc;

import static java.lang.Class.forName;

public class Entertainment {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Loaded and Registered driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
