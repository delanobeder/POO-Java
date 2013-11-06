package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Classe ServletCelsiusFahrenheit -- Constrói uma tabela  de conversão 
 * de temperaturas (C -> F)
 * 
 * @author Delano Medeiros Beder
 */
public class ServletCelsiusFahrenheit extends ServletConversão {

    @Override
    protected void processRequest(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        int iniValue = (Integer)request.getSession().getAttribute("inicial");
        int finValue = (Integer)request.getSession().getAttribute("final");
        int varValue = (Integer)request.getSession().getAttribute("var");
        double fahr;

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Celsius-Fahrenheit</title>");
        out.println("</head>");
        out.println("<body>");
        
        out.println("<table border = \"1\">");
        out.println("<tr>");
        out.println("\t <th> Celsius (<code>&deg;</code>C) </th>");
        out.println("\t <th> Fahrenheit (<code>&deg;</code>F) </th>");
        out.println("</tr>");

        for (int celsius = iniValue; celsius <= finValue; celsius += varValue) {
            fahr = 9.0 / 5.0 * celsius + 32;
            out.println("<tr>");
            out.println("\t <th>" + celsius + "</th>");
            out.println("\t <th>" + fahr + "</th>");
            out.println("</tr>");
        }
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
