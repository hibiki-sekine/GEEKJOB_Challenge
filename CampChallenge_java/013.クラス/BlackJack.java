/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack.mypackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.*;

import java.util.ArrayList;

/**
 *
 * @author hibikisekine
 */
public class BlackJack extends HttpServlet {

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
           
            Dealer dealer = new Dealer();
            User user = new User();
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet BlackJack</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>ブラックジャックスタート！</h1>");
            
            ArrayList<Integer> card1 = dealer.deal();
            ArrayList<Integer> card2 = dealer.deal();
            
            dealer.setCard(card1);
            user.setCard(card2);
            
            while(dealer.checkSum() || user.checkSum()){
                if(dealer.checkSum()){
                    ArrayList<Integer> hit1 = dealer.hit();
                    dealer.setCard(hit1);
                }
            
                if(user.checkSum()){
                    ArrayList<Integer> hit2 = dealer.hit();
                    user.setCard(hit2);
                }
            }
                       
            int sum1 = dealer.open();
            int sum2 = user.open();
            
            out.print("ディーラー:" + sum1 + " ユーザー:" + sum2 + "<br>");
            
            if(sum1 > 21) sum1 = 0;
            if(sum2 > 21) sum2 = 0;
            
            if(sum1 > sum2){
                out.print("ディーラーの勝ち！");
            }else if(sum2 > sum1){
                out.print("ユーザーの勝ち！");
            }else if(sum1 == sum2){
                out.print("引き分け");
            }
           
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
