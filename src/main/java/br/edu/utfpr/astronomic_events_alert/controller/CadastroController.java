package br.edu.utfpr.astronomic_events_alert.controller;

import br.edu.utfpr.astronomic_events_alert.model.domain.Usuario;
import com.sun.org.apache.xml.internal.utils.Constants;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "cadastroServlet", value = "/cadastro")
public class CadastroController extends HttpServlet {
    private String message;
    private final String HOME = "/home";
    private final String VIEW = "WEB-INF/view/";

    public void init() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        request.getRequestDispatcher(VIEW + "cadastro.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        Usuario usuario = new Usuario(nome, email);

        request.setAttribute("message", message);
        request.getRequestDispatcher(HOME).forward(request, response);

        int alertasTotais = (Integer) getServletContext().getAttribute("alertasTotais");
        if(alertasTotais > 1){
            getServletContext().setAttribute("alertasTotais", alertasTotais);
        }else{
            alertasTotais ++;
        }

        int usuariosTotais = (Integer) getServletContext().getAttribute("usuariosTotais");
        if(usuariosTotais > 1){
            getServletContext().setAttribute("usuarioTotais", usuariosTotais);
        }else{
            usuariosTotais ++;
        }

    }
    //TODO: Adaptar o metode de tratamento de salvamento em cookies
    public void process(){
        Cookie cookie = new Cookie("ContadorTeste", "TEste");

    }


    public void destroy() {
    }
}