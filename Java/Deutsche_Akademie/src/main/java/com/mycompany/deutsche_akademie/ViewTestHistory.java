/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.deutsche_akademie;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Huw
 * @author Michael
 */
public class ViewTestHistory extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ViewTestHistory</title>");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">");
            out.println("</head>");
            out.println("<body>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Connects to the database and prints out the contents of the results table
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/deutsche_akademie", "reolac", "thepassword")) {
                Statement stat = conn.createStatement();

                PrintWriter out = response.getWriter();
                String account_id = request.getParameter("account_id");
                ResultSet result;
                out.print("<div class=\"scoreContainer\">");
                out.print("<h1>Viewing test results</h1>");
                
                if (account_id.equalsIgnoreCase("1")) {
                    result = stat.executeQuery("SELECT * FROM test_history");
                    out.print("<table class=\"resultsTable\">");
                    out.print("<tr><th>Test score</th><th>Test time</th><th>Account ID</th></tr>");
                    while (result.next()) {
                        
                        String test_score = "<td>" + result.getString("test_score") + "/20</td>";
                        String test_time = "<td>" + result.getString("test_time") + "</td>";
                        String a_id = "<td>" + result.getString("account_id") + "</td>";
                        out.print("<tr>" + test_score + test_time + a_id + "</tr>");
                    }
                } else {
                    out.print("<table class=\"resultsTable1\">");
                    out.print("<tr><th>Test score</th><th>Test time</th></tr>");
                    result = stat.executeQuery("SELECT * FROM test_history WHERE account_id = " + account_id);
                    while (result.next()) {
                        String test_score = "<td>" + result.getString("test_score") + "/20</td>";
                        String test_time = "<td>" + result.getString("test_time") + "</td>";
                        out.print("<tr>" + test_score + test_time + "</tr>");
                    }
                }
                out.print("</table>");
                        
        out.print("<form action=\"StartTest\" method=\"post\">");
        out.print("<input type=\"hidden\" name=\"account_id\" value=\"" + request.getParameter("account_id") +"\"/>");
        out.print("<button class=\"navButton2\"><h1>Start Test</h1></button>");
        out.print("</form>");
        
        out.print("<form action=\"index.html\">");
        out.print("<input type=\"hidden\" name=\"account_id\" value=\"" + request.getParameter("account_id") +"\"/>");
        out.print("<button class=\"navButton2\"><h1>Logout</h1></button>");
        out.print("</form>");
        out.print("</div>");
            } catch (SQLException ex) {
                //Logger.getLogger(SqLTester.class.getName()).log(Level.SEVERE, null, ex);
            }

            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EditDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
