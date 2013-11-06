package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Classe ServletConversão -- Servlet invocado pelo index.html. 
 * Roteador para (C -> F) ou (C -> K)
 * 
 * @author Delano Medeiros Beder
 */
public class ServletConversão extends HttpServlet {

    protected void processRequest(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        try {
            HttpSession session = request.getSession();
            String iniValue = request.getParameter("inicial");
            session.setAttribute("inicial", Integer.parseInt(iniValue));

            String finValue = request.getParameter("final");
            session.setAttribute("final", Integer.parseInt(finValue));

            String varValue = request.getParameter("var");
            session.setAttribute("var", Integer.parseInt(varValue));

            int tipo = Integer.parseInt(request.getParameter("tipo"));

            switch (tipo) {
                case 0: {
                    response.sendRedirect("fahrenheit");
                    break;
                }
                case 1: {
                    response.sendRedirect("kelvin");
                    break;
                }
            }
        } catch (NumberFormatException exc) {
            response.sendRedirect("erro.html");
        }
    }

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
