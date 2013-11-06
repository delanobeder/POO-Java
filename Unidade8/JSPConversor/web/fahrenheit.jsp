<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%-- JSP que constrói uma tabela  de conversão de temperaturas (C -> F) --%>

<html>
    <head><title>Celsius-Fahrenheit</title></head>
    <body>

        <%-- Recuperando as variáveis de sessão inicial, final e var --%>
        <%-- Declarando a variável local fahr --%>
        
        <%
            int iniValue = (Integer) session.getAttribute("inicial");
            int finValue = (Integer) session.getAttribute("final");
            int varValue = (Integer) session.getAttribute("var");;
            double fahr;
        %>

        <table border = "1">
            <tr>
                <th> Celsius (<code>&deg;</code>C) </th>
                <th> Fahrenheit (<code>&deg;</code>F) </th>
            </tr>

            <%-- Definindo o comando for --%>

            <%
                for (int celsius = iniValue; celsius <= finValue; celsius += varValue) {
                    fahr = 9 / 5.0 * celsius + 32;
            %>

            <tr>
                <th> <%= celsius%> </th>
                <th> <%= fahr%> </th>
            </tr>

            <%-- Fechando o comando for --%>

            <%
                }
            %>
        </table>
    </body>
</html>