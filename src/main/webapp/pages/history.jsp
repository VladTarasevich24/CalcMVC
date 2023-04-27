<%--
  Created by IntelliJ IDEA.
  User: Vlad
  Date: 24.04.2023
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="row align-items-center h-100">
        <div class="col-md-8 offset-md-5">
<c:forEach var="operation" items="${operation}">
    <p><h4>${operation}<a href="/calc/delete/${operation.id}"><button class="btn btn-outline-primary">Удалить</button></a></h4></p>
</c:forEach>
            <a href="/calc"><p><button class="btn btn-outline-primary">Назад</button></p></a>
        </div>
    </div>
</div>





<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
        crossorigin="anonymous"></script>
</body>
</html lang="en" xmlns:th="http//www.thymeleaf.org">
