<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1>Create New Item</h1>

<form:form method="POST" action="${pageContext.request.contextPath}/item/${item.id}/edit"
 modelAttribute="item">
<%--  <form:hidden path="id"/>  --%>

 Item Name: <form:input path="name"/> <br/>
 Item descr: <form:input path="desc"/> <br/>
 Item amount: <form:input path="amount"/> <br/>
 Item price: <form:input path="price"/> <br/>
 
 <input type="submit" value="Create Item">
 </form:form>

