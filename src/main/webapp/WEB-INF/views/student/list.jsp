<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<c:forEach items="${studentList}" var="student">
Name: ${student.name} <br>
Country: ${student.country} <br>
OS: <c:forEach items="${student.operatingSystem}" var="os">
----${os}<br>
</c:forEach>

<hr>
</c:forEach>