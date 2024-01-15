<%@page import="java.util.Map"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!--<link rel="stylesheet" href="Estilos/MiEstilo.css"/>-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    </head>
    <body>
        <h1>Votación</h1>
        <div>
            <form action="SvVotos" method="POST">
                <h1>Elija su voto: </h1>
                <div class="Luisina">
                    <input type="radio" name="partido" value="Todos somos Luisina">Todos somos Luisina
                </div>
                <div class="Nico">
                    <input type="radio" name="partido" value="Apuesta por Nico">Apuesta por Nico
                </div>
                <div class="German">
                    <input  type="radio" name="partido" value="Partido Germanista">Partido Germanista
                </div>
                <div>
                    <input class="votar" type="submit" value="Votar" name="Votar" />
                </div>
            </form>
        </div>

        <form action="SvVotos" method="GET">
            <button class="btn btn-success" type="submit">Mostrar Resultados</button>
        </form><br>
    </div>

    <div class="container mt-2">
        <% if (request.getAttribute("resultados") != null) {
                Map<String, Long> resultados = (Map<String, Long>) request.getAttribute("resultados");
        %>
        <table class="table table-striped table-bordered border-primary">
            <tr>
                <th scope="col">Nombre Partido</th>
                <th scope="col">Cantidad Votos</th>
            </tr>
            <% for (Map.Entry<String, Long> entry : resultados.entrySet()) {%>
            <tr>
                <td scope="row"><%= entry.getKey()%></td>
                <td scope="row"><%= entry.getValue()%></td>

            </tr>
            <% } %>
        </table>
        <% }%>
    </div>
</body>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</html>