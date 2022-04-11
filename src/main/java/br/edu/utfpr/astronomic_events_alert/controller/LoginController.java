package br.edu.utfpr.astronomic_events_alert.controller;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "loginServlet", value = "/login")
public class LoginController extends HttpServlet {
    private String message;
    private final String HOME = "/home";
    private final String VIEW = "/WEB-INF/view/";

    public void init() {
        message = "Login";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        request.setAttribute("message", message);
        request.getRequestDispatcher(VIEW + "home").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String pass = request.getParameter("password");

        request.getRequestDispatcher(HOME).forward(request, response);
    }
    public void destroy() {
    }
}