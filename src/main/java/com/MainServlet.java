package com;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Создал Vlad Kazakov дата: 25.12.2016.
 */
public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ConnectionJdbc connJdbc = new ConnectionJdbc();
        List<Zayavka> zayavkas = new ArrayList<Zayavka>();


        try(Connection conn = connJdbc.openAcces();
                PreparedStatement pstmn = conn.prepareStatement("SELECT * FROM zayavka");
                ResultSet rs = pstmn.executeQuery()){

                while (rs.next()){
                    Zayavka zayavka = new Zayavka();
                    zayavka.setId(rs.getInt("id"));
                    zayavka.setFullName(rs.getString("fullName"));
                    zayavkas.add(zayavka);
                    System.out.println(zayavka.getId() + " " + zayavka.getFullName());
                }
            }
         catch (SQLException e) {
            e.printStackTrace();
        }



        req.setAttribute("zayavkas", zayavkas);

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/list.jsp");
        dispatcher.forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
