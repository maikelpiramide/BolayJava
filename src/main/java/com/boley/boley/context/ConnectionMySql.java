package com.boley.boley.context;

import java.sql.Connection;

public class ConnectionMySql {
    private static Connection conection;
    private ConnectionMySql(){}

    public static Connection getInstance() {
        if(connection == null) {
            try {
                connection = DriverManager.getConnection(
                        "jdbc:mysql://database-boley.c54kcq6ein9a.us-east-1.rds.amazonaws.com:3306/boleybol",
                        "admin", "admin7038");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return connection;
    }



}
