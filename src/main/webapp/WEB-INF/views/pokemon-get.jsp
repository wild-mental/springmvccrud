<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="sql" uri="jakarta.tags.sql" %>
<html>
<head>
    <title>Pokemon 데이터를 간단히 조회합니다</title>
</head>
<body>
    <sql:setDataSource var="dataSource" driver="com.mysql.cj.jdbc.Driver"
                       url="jdbc:mysql://127.0.0.1:3307/pokemon_game" user="root" password="12341234" />
    <sql:query dataSource="${dataSource}" var="result">
      select nickname from pokemon limit 10;
    </sql:query>
    <c:forEach var="row" items="${result.rows}">
      <p>Pokemon Name: <c:out value="${row.nickname}" /></p>
    </c:forEach>
</body>
</html>