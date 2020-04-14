<%@page import="it.dstech.jpa.model.Persona"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <form method="POST" action="">
            Nome: <input type="text" name="nome" />
            Cognome: <input type="text" name="cognome" />
            <input type="submit" value="Add" />
        </form>

        <hr><ol> <%
            List<Persona> lista = (List<Persona>)request.getAttribute("lista");
            for (Persona persona : lista) { %>
                <li> <%= persona.getNome()%>  <%= persona.getCognome()%></li> <%
            } %>
        </ol><hr>
 

</body>
</html>