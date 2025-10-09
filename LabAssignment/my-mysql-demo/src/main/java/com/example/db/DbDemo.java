package com.example.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbDemo {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://127.0.0.1:3306/demo?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
        String user = "sankalp";
        String pass = "bhuovio4";

        try (Connection c = DriverManager.getConnection(url, user, pass);
             Statement st = c.createStatement()) {

            st.executeUpdate("""
                        CREATE TABLE IF NOT EXISTS products(
                          id INT PRIMARY KEY AUTO_INCREMENT,
                          name VARCHAR(100) NOT NULL
                        )
                    """);

            st.executeUpdate("INSERT INTO products(name) VALUES('Laptop')");
            try (ResultSet rs = st.executeQuery("SELECT id, name FROM products")) {
                while (rs.next()) {
                    System.out.println(rs.getInt("id") + " -> " + rs.getString("name"));
                }
            }
        }
    }
}
