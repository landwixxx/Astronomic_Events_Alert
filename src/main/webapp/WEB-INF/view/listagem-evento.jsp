<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>AEA - Astronomic Events Alert</title>
</head>
<body>
<h1>
    Listagem de evento
</h1>
<br/>
<c:if test="${not empty eventos}">
    <ul class="events-card-list">
        <c:forEach var="eventos" items="${eventos}">
            <li>
                <div class="card-event">${evento.titulo}</div>
            </li>
        </c:forEach>
    </ul>
</c:if>
<c:if test="${empty eventos}">
    Não há eventos cadastrados!
</c:if>

</body>
</html>