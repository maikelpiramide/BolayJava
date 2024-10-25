package com.boley.boley.context;

import java.sql.Connection;

public class ConnectionMySql {
    private static Connection conection;
    private ConnectionMySql(){}

    public static Connection getInstance() {
        if(connection == null) {
            try {
                connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/manager",
                        "root", "root");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return connection;
    }



}
