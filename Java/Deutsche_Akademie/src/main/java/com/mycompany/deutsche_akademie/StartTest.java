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
import java.util.Random;
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
public class StartTest extends HttpServlet {

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
            out.println("<title>Servlet StartTest</title>");    
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
     * Connects to the database, picks a random table and picks 20 random questions
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
                
                int cSelect = (int)(Math.random() * 6 + 1);
                String category = null;
                
                switch(cSelect){
                    case 1:
                        category = "area_a_home_and_abroad";
                    case 2:
                        category = "area_b_education_and_employment";
                    case 3:
                        category = "area_c_house_home_and_daily_routine";
                    case 4:
                        category = "area_d_the_modern_world";
                    case 5:
                        category = "area_e_social_activities_fitness_and_health";
                    case 6:
                        category = "non_topic_specific_vocabulary";
                }
                 
               
                ResultSet result = stat.executeQuery("SELECT * FROM " + category 
                        + " ORDER BY RAND() LIMIT 20");
                
                int qSelect;
                int i = 1;
                out.print("<div class=\"testContainer\">");
                
                out.print("<form action=\"SubmitAnswers\" method=\"post\">");
                out.print("<input type=\"hidden\" name=\"account_id\" value=\"" + request.getParameter("account_id") +"\"/>");
                while (result.next()) {
                    qSelect = (int)(Math.random() * 2 + 1);
                    
                    if (qSelect == 1){
                        out.print("<input type=\"hidden\" name=\"qType" + i + "\"  value=\"" + qSelect +"\"/>");
                        out.print("<input type=\"hidden\" name=\"g_word" + i + "\" value=\"" + result.getString("german_word") + "\"/>");
                        out.print("<input type=\"hidden\" name=\"g_word_type" + i + "\" value=\"" + result.getString("german_word_type") + "\"/>");
                        out.print("<input type=\"hidden\" name=\"e_word" + i + "\" value=\"" + result.getString("english_word") + "\"/>");
                        
                        out.print("<h3>" + i + ") What is the gender and meaning of the German word " + result.getString("german_word") + "?</h3>");
                        out.print("<input class=\"gender\" type=\"text\" name=\"g_word_type_ans"  + i + "\" placeholder=\"Gender\"/>");
                        out.print("<input type=\"text\" name=\"e_word_ans" + i + "\" placeholder=\"Meaning\"/><br/><br/>");
                    }
                    else{
                        out.print("<input type=\"hidden\" name=\"qType" + i + "\"  value=\"" + qSelect +"\"/>");
                        out.print("<input type=\"hidden\" name=\"g_word" + i + "\" value=\"" + result.getString("german_word") + "\"/>");
                        out.print("<input type=\"hidden\" name=\"g_word_type" + i + "\" value=\"" + result.getString("german_word_type") + "\"/>");
                        out.print("<input type=\"hidden\" name=\"e_word" + i + "\" value=\"" + result.getString("english_word") + "\"/>");
                        
                        out.print("<h3>" + i + ") What is the German word for  " + result.getString("english_word") + "?</h3>");
                        out.print("<input type=\"text\" name=\"g_word_ans" + i + "\" placeholder=\"Word\"/><br/><br/>");
                    }
                        
                    i++;
                   
                }
                out.print("<br/><br/><button><h1>Submit Answers</h1></button></form>");
                out.print("</div>");
                

            } catch (SQLException ex) {
                //Logger.getLogger(SqLTester.class.getName()).log(Level.SEVERE, null, ex);
            }
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
