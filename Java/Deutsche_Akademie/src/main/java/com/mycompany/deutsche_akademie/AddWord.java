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
 *
 * @author Michael
 * @author Huw
 */
public class AddWord extends HttpServlet {

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
            out.println("<title>Servlet AddWord</title>");
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
     * Runs the insert script inserting the words added into the fields then prints out the table.
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
                String g_word = request.getParameter("german_word");
                String g_word_type = request.getParameter("german_word_type");
                String e_word = request.getParameter("english_word");
                String w_id = request.getParameter("word_id");
                String category = request.getParameter("category");
                
                out.print("<div class=\"dbTables\">");
                
                
                ResultSet result = stat.executeQuery("SELECT * FROM " + category
                + " ORDER BY RAND() LIMIT 20");
                boolean exists = false;
                while (result.next()) {
                    String germanWord = result.getString("german_word");
                    String germanWordType = result.getString("german_word_type");
                    String englishWord = result.getString("english_word");
                    if (g_word.equalsIgnoreCase(germanWord) && g_word_type.equalsIgnoreCase(germanWordType) && e_word.equalsIgnoreCase(englishWord)){
                        exists = true;
                    }
                
                }

                if(!exists){
                String command = "INSERT INTO " + category + " (`german_word`, `german_word_type`, `english_word`)"
                        + " VALUES('" + g_word + "','" + g_word_type + "','" + e_word + "')";
                stat.execute(command);                
                out.println("<h1>ADDED : " + g_word + " " + g_word_type + " " + e_word + "</h1>");
                }
                else{
                    out.println("<h1>Those exact values already exist</h1>");
                }
                out.print("<table>");
                out.println("<form action=\"AddWord\" method=\"post\">");
                out.println("<tr><th colspan=\"3\">Add a new word:</th></tr>");
                out.println("<td><input type=\"text\" name=\"german_word\" id=\"username\" placeholder=\"german word\"/></td>");
                out.println("<td><input type=\"text\" name=\"german_word_type\" id=\"username\" placeholder=\"german word type\"/></td>");
                out.println("<td><input type=\"text\" name=\"english_word\" id=\"username\" placeholder=\"english word\"/></td>");
                out.println("<td><input type=\"hidden\" name=\"category\" value=\"" + category + "\"/></td>");
                out.println("<td><input type=\"submit\" value=\"add\" </td>");

                out.println("</form>");
                out.print("</table><br/>");
                
               

                result = stat.executeQuery("SELECT * FROM " + category
                + " ORDER BY `german_word`");
                                out.print("<table>");
                out.print("<tr><th colspan=\"3\">Table: " + category + "</th></tr>" 
                            + "<tr><th>German word</th><th>Gender</th><th>English word</th></tr>");

                while (result.next()) {
                    String word_id = "<form action=\"DeleteWord\" method=\"post\"><input type=\"hidden\" name=\"word_id\" value=\"" + result.getString("word_id") + "\"/>";
                    String german_word = "<td><input type=\"text\" name=\"german_word\" value=\"" + result.getString("german_word") + "\"/></td>";
                    String german_word_type = "<td><input type=\"text\" name=\"german_word_type\" value=\"" + result.getString("german_word_type") + "\"/></td>";
                    String english_word = "<td><input type=\"text\" name=\"english_word\" value=\"" + result.getString("english_word") + "\"/></td>";
                    String change_button = "<td><input class=\"saveIcon\" type=\"submit\" value=\"Delete\"/></td>";
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

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EditDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        processRequest(request, response);
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
