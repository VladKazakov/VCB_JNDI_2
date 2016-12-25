package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Создал Vlad Kazakov дата: 25.12.2016.
 */
public class ConnectionJdbc {

    public Connection connect;

    public ConnectionJdbc()  {
    }

    public void init(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/zayavkatest", "root", "123456");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void close(){
        try {
            connect.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnect() {
        return connect;
    }
}
