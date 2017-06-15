<%--
  Created by IntelliJ IDEA.
  User: danawacomputer
  Date: 2017-06-12
  Time: 오후 2:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
          crossorigin="anonymous">
</head>
<body>
<h3>전체 보기 페이지 입니다.</h3>

<c:forEach var="amigo" items="${list}">
    <ul>
        <li><a href="/amigo/${amigo.amigoName}">${amigo.amigoName}</a></li>
        <li>${amigo.amigoNumber}</li>
        <li>${amigo.amigoEmail}</li>
    </ul>
</c:forEach>

</body>
</html>
