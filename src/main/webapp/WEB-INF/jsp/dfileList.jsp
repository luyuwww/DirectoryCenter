<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>DFILE_LIST</title>
    <link href="${pageContext.request.contextPath}/res/js/bootstrap-3.0.3-dist/css/bootstrap.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/res/js/bootstrap-3.0.3-dist/css/bootstrap-theme.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/res/js/self/theme.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/res/js/self/grid.css" rel="stylesheet">

</head>
<body>
<div class="container">
    <h2>测试列表</h2>
    <c:forEach var="test" items="${dfileList}" varStatus="count">
        <div class="row">
            <div class="col-lg-1">${count.index+1}</div>
            <div class="col-sm-5">${test.title}</div>
            <div class="col-md-2">${test.keyword}</div>
            <div class="col-md-3">${test.syscode}</div>
        </div>
    </c:forEach>
</div>
</body>
</html>
