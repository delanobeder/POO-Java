<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%-- JSP chamado pelo index.html => roteador para (C -> F) ou (C -> K) --%>

<html>
    <head>
    </head>
    <body>
        <%
            try {
                String iniValue = request.getParameter("inicial");
                session.setAttribute("inicial", Integer.parseInt(iniValue));

                String finValue = request.getParameter("final");
                session.setAttribute("final", Integer.parseInt(finValue));

                String varValue = request.getParameter("var");
                session.setAttribute("var", Integer.parseInt(varValue));

                int tipo = Integer.parseInt(request.getParameter("tipo"));

                switch (tipo) {
                    case 0: {
                        response.sendRedirect("fahrenheit.jsp");
                        break;
                    }
                    case 1: {
                        response.sendRedirect("kelvin.jsp");
                        break;
                    }
                }
            } catch (NumberFormatException exc) {
                response.sendRedirect("erro.html");
            }
        %>
    </body>
</html>
