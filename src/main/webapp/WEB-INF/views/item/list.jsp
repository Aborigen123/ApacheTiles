<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<h1> List ofItems</h1>

<ul>
<c:forEach items="${itemList}" var="item">
<li>${item.id} | ${item.name} | ${item.desc} | ${item.price}
 | <a href="${pageContext.request.contextPath}/item/${item.id}/edit">Edit</a>
  | <a href="${pageContext.request.contextPath}/item/${item.id}/delete">Delete</a>
 </li>
</c:forEach>
</ul>