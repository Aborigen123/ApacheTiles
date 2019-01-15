<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<h1> List of Courses</h1>

<table border="1">
<tr>
<th>id </th>
<th>title </th>
<th>Description</th>
<th>Price</th>
<th>Edit</th>
</tr>
 
 <c:forEach items="${coursesList}" var = "course">
<tr>
 <td>${course.id} </td>
<td>${course.title}</td>
<td>${course.description}</td>
<td>${course.price}</td>
<td>${course.price}</td>
 <td>
 <a href="${pageContext.request.contextPath}/course/${course.id}/edit">Edit</a>
 </td>
 </tr>
  </c:forEach>
  
 </table>