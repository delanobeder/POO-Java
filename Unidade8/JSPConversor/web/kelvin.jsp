<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%-- JSP que constrói uma tabela  de conversão de temperaturas (C -> K) --%>

<html>
    <head><title>Celsius-Fahrenheit</title></head>
    <body>

        <%-- Recuperando as variáveis de sessão inicial, final e var --%>
        <%-- Declarando a variável local kelvin --%>

        <%
            int iniValue = (Integer) session.getAttribute("inicial");
            int finValue = (Integer) session.getAttribute("final");
            int varValue = (Integer) session.getAttribute("var");;
            double kelvin;
        %>

        <table border = "1">
            <tr>
                <th> Celsius (<code>&deg;</code>C) </th>
                <th> Kelvin (<code>&deg;</code>K) </th>
            </tr>

            <%-- Definindo o comando for --%>


            <%
                for (int celsius = iniValue; celsius <= finValue; celsius += varValue) {
                    kelvin = celsius + 273.15;
            %>

            <tr>
                <th> <%= celsius %> </th>
                <th> <%= kelvin %> </th>
            </tr>

            <%-- Fechando o comando for --%>

            <%
                }
            %>
        </table>
    </body>
</html>