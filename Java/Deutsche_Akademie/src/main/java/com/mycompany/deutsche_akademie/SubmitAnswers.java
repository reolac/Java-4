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
public class SubmitAnswers extends HttpServlet {

    /**
     * Calculates the user input against the correct answer and accumulates a score out of 20
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
            out.println("<title>Servlet SubmitAnswers</title>");
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
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        
        double score = 0;

        for (int i = 1; i <= 20; i++) {  
            int qSelect = Integer.parseInt(request.getParameter("qType" + i));
            String g_word = request.getParameter("g_word" + i);
            String g_word_type = request.getParameter("g_word_type" + i);
            String e_word = request.getParameter("e_word" + i);
            String g_word_ans = (request.getParameter("g_word_ans" + i));
            String g_word_type_ans = (request.getParameter("g_word_type_ans" + i));
            String e_word_ans = (request.getParameter("e_word_ans" + i));

            if (qSelect == 1) {
                if (g_word_type_ans.equalsIgnoreCase(g_word_type) || 
                   (g_word_type_ans.isEmpty() && g_word_type.equalsIgnoreCase("null"))) {
                    score += 0.25;
                }
                if (e_word_ans.equalsIgnoreCase(e_word)) {
                    score += 0.75;
                }
            } else {
                if (g_word_ans.equalsIgnoreCase(g_word)) {
                    score += 1;
                }
            }
        }
        out.print("<div class=\"scoreContainer\">");
        
        out.print("<h1>You scored : " + score + "</h1>");
        out.print("<form action=\"StartTest\" method=\"post\">");
        out.print("<input type=\"hidden\" name=\"account_id\" value=\"" + request.getParameter("account_id") +"\"/>");
        out.print("<button class=\"homeButton\"><h1>Try again?</h1></button>");
        out.print("</form>");
        
        out.print("<form action=\"ViewTestHistory\" method=\"post\">");
        out.print("<input type=\"hidden\" name=\"account_id\" value=\"" + request.getParameter("account_id") +"\"/>");
        out.print("<button class=\"homeButton\"><h1>View test results</h1></button>");
        out.print("</form>");
        
        
        out.print("</div>");
        
        
        try {

            Class.forName("com.mysql.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/deutsche_akademie", "reolac", "thepassword")) {
                Statement stat = conn.createStatement();


                String account_id = request.getParameter("account_id");
               
                String command = "INSERT INTO test_history (`test_score`, `account_id`)"
                               + " VALUES('" + score + "','" + account_id + "')";
                
                stat.execute(command);

   
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
