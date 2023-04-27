<%--
  Created by IntelliJ IDEA.
  User: Vlad
  Date: 24.04.2023
  Time: 12:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
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
            <form action="/calc" method="post">
                <p><input type="number" name="num1" placeholder="Введите число"></p>
                <br>
                <p style="color: red">${num1}</p>
                <br>
                <p><input type="number" name="num2" placeholder="Введите число"></p>
                <br>
                <p style="color: red">${num2}</p>
                <br>
                <p>Выберите операцию
                    <select name="type">
                        <option>+</option>
                        <option>-</option>
                        <option>/</option>
                        <option>*</option>
                    </select></p>
                <p><button class="btn btn-outline-primary">Вычислить</button></p>
            </form>
            <p>${result}</p>
            <a href="/history"><p><button class="btn btn-outline-primary">История операций</button></p></a>
        </div>
    </div>

</div>








<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
        crossorigin="anonymous"></script>
</body>
</html>
