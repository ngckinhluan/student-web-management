/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj301demo.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import prj301demo.Registration.RegistrationDAO;
import prj301demo.Registration.RegistrationErrors;
import prj301demo.Users.UserDAO;

/**
 *
 * @author LuanTNK
 */
public class SignUpController extends HttpServlet {

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
            throws ServletException, IOException, SQLException, NamingException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String action = request.getParameter("action");
            if (action != null && action.equals("signup")) {
                String username = request.getParameter("username");
                String password = request.getParameter("password");
                String fullname = request.getParameter("fullname");
                String confirm = request.getParameter("confirm");
                boolean errs = false;
                RegistrationErrors errObj = new RegistrationErrors();
                if (username.length() < 6 || username.length() > 20) {
                    errs = true;
                    errObj.setUsernameErrs("Username must be from 6 to 20 characters!");
                    request.setAttribute("errsusername", errObj);
                }

                if (password.length() < 5 || password.length() > 20) {
                    errs = true;
                    errObj.setPasswordErrs("Password must be from 5 to 20 characters");
                    request.setAttribute("errspassword", errObj);
                } else if (!confirm.equals(password)) {
                    errs = true;
                    errObj.setConfirmErrs("Confirm password does not match");
                    request.setAttribute("errsconfirmpassword", errObj);

                }
                if (fullname.length() < 2 || fullname.length() > 50) {
                    errs = true;
                    errObj.setLastnameErrs("Lastname must be from 2 to 50 characters");
                    request.setAttribute("errsfullname", errObj);
                }
                String url = "signup.jsp";
                if (!errs) {
                    RegistrationDAO dao = new RegistrationDAO();
                    boolean result = dao.createAccount(username, fullname, password);
                    if (result) {
                        url = "login.jsp";
                    } else {
                        errObj.setDuplicateUsername(username + " already exists!");
                        request.setAttribute("duplicated", errObj);
                    }
                }
                RequestDispatcher rd = request.getRequestDispatcher(url);
                rd.forward(request, response);
            }
        } finally {
            if (out != null) {
                out.close();
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
        try {
            processRequest(request, response);

        } catch (SQLException ex) {
            Logger.getLogger(SignUpController.class
                    .getName()).log(Level.SEVERE, null, ex);

        } catch (NamingException ex) {
            Logger.getLogger(SignUpController.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);

        } catch (SQLException ex) {
            Logger.getLogger(SignUpController.class
                    .getName()).log(Level.SEVERE, null, ex);

        } catch (NamingException ex) {
            Logger.getLogger(SignUpController.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
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
