package br.edu.utfpr.astronomic_events_alert.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "cadastroServlet", value = "/cadastro")
public class CadastroController extends HttpServlet {
    private String message;
    private final String HOME = "/home";
    private final String VIEW = "/WEB-INF/view/";

    public void init() {
        message = "Cadastro";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("message", message);
        request.getRequestDispatcher(VIEW + "home").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("message", message);
        request.getRequestDispatcher(HOME).forward(request, response);
    }

    public void destroy() {
    }
}