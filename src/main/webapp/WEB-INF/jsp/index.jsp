<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>测试列表</title>
    <link href="${pageContext.request.contextPath}/res/js/bootstrap-3.0.3-dist/css/bootstrap.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/res/js/bootstrap-3.0.3-dist/css/bootstrap-theme.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/res/js/self/theme.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/res/js/self/grid.css" rel="stylesheet">

</head>
<body>
<div class="container">
    <h2>测试列表</h2>
    <c:forEach var="test" items="${testa}" varStatus="count">
        <div class="row">
            <div class="col-md-1">${count.index+1}</div>
            <div class="col-md-4">${test.name}</div>
            <div class="col-md-4">${test.bz}</div>
        </div>
    </c:forEach>
</div>
</body>
</html>
