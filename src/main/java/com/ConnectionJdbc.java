package com;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Создал Vlad Kazakov дата: 25.12.2016.
 */
public class ConnectionJdbc {

    private InitialContext ctx;

    public ConnectionJdbc()  {
        try {
            ctx = new InitialContext();
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }

    public Connection openDriver(){

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/zayavkatest", "root", "123456");
            return connect;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Connection openAcces(){
        try {
            Context context = (Context) ctx.lookup("java:comp/env");
            DataSource dataSource = (DataSource) context.lookup("jdbc/zayavkatest");
            return dataSource.getConnection();
        } catch (NamingException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
