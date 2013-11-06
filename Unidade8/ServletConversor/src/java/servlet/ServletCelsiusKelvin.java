package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Classe ServletCelsiusKelvin -- Constrói uma tabela  de conversão 
 * de temperaturas (C -> K)
 * 
 * @author Delano Medeiros Beder
 */
public class ServletCelsiusKelvin extends ServletConversão {

    @Override
    protected void processRequest(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        int iniValue = (Integer) request.getSession().getAttribute("inicial");
        int finValue = (Integer) request.getSession().getAttribute("final");
        int varValue = (Integer) request.getSession().getAttribute("var");
        double kelvin;


        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Celsius-Kelvin</title>");
        out.println("</head>");
        out.println("<body>");

        out.println("<table border = \"1\">");
        out.println("<tr>");
        out.println("\t <th> Celsius (<code>&deg;</code>C) </th>");
        out.println("\t <th> Kelvin (<code>&deg;</code>K) </th>");
        out.println("</tr>");

        for (int celsius = iniValue; celsius <= finValue; celsius += varValue) {
            kelvin = celsius + 273.15;
            out.println("<tr>");
            out.println("\t <th> " + celsius + " </th>");
            out.println("\t <th> " + kelvin + " </th>");
            out.println("</tr>");
        }
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
