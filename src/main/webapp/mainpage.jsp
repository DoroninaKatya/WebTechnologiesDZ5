<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h4>Список библиотек</h4>
    <table>
        <thead>
            <tr>
                <th>Название</th>
                <th>Адрес</th>
                <th>Регион</th>
                <th>Телефон</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="library" items="${libraries}">
                <tr>
                    <td>${library.getName()}</td>
                    <td>${library.getAddress()}</td>
                    <td>${library.getArea()}</td>
                    <td>${library.getPhone()}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <h4>Список театров</h4>
    <table>
        <thead>
        <tr>
            <th>Название</th>
            <th>Адрес</th>
            <th>Регион</th>
            <th>Телефон</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="theater" items="${theaters}">
            <tr>
                <td>${theater.getName()}</td>
                <td>${theater.getAddress()}</td>
                <td>${theater.getArea()}</td>
                <td>${theater.getPhone()}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</body>
</html>
