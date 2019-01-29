<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%-- Boucle calculant le cube des entiers de 0 à 7 et les affichant dans un tableau HTML --%>
<table>
  <tr>
    <th>index</th>
    <th>Publication</th>
  </tr>

<c:forEach var="i" begin="0" end="${list.size() - 1}" step="1">
  <tr>
    <td><c:out value="${i}"/></td>
    <td>${list.get(i)}</td>
  </tr>
</c:forEach>

</table>

</body>
</html>