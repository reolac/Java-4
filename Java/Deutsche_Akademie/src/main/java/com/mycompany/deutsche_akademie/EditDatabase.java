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
public class EditDatabase extends HttpServlet {

    /**
     * 
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
            out.println("<title>Servlet EditDatabase</title>");
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

    }

    /**
     * Connects to the database and prints out the selected table, giving you an option to edit the entries.
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
                String category = request.getParameter("category");
               
                out.print("<div class=\"dbTables\">");
                ResultSet result = stat.executeQuery("SELECT * FROM " + category
                + " ORDER BY `german_word`");
                out.print("<table>");
                out.print("<tr><th colspan=\"3\">Table: " + category + "</th></tr>" 
                            + "<tr><th>German word</th><th>Gender</th><th>English word</th></tr>");

                while (result.next()) {
                    String word_id = "<form action=\"UpdateDatabase\" method=\"post\"><input type=\"hidden\" name=\"word_id\" value=\"" + result.getString("word_id") + "\"/>";
                    String german_word = "<td><input type=\"text\" name=\"german_word\" value=\"" + result.getString("german_word") + "\"/></td>";
                    String german_word_type = "<td><input type=\"text\" name=\"german_word_type\" value=\"" + result.getString("german_word_type") + "\"/></td>";
                    String english_word = "<td><input type=\"text\" name=\"english_word\" value=\"" + result.getString("english_word") + "\"/></td>";
                    String change_button = "<td><input class=\"saveIcon\" type=\"submit\" value=\"Save\"/></td>";
                    String table = "<input type=\"hidden\" name=\"category\" value=\"" + category + "\"/></form>";
                    
                    out.print("<tr>" + word_id + german_word + german_word_type + english_word + change_button + table + "</tr>");
                }
                out.print("</table>");
                                out.print("<form action=\"admin_home.html\" method=\"post\">");
                out.print("<input type=\"hidden\" name=\"account_id\" value=\"" + request.getParameter("account_id") +"\"/>");
                out.print("<button class=\"navButton3\"><h1>Home</h1></button>");
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
