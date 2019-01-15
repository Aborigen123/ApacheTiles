<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 <form:form  modelAttribute = "studentModel" method="POST" action="${pageContext.request.contextPath}/student/add">
 
 String name: <form:input path="name"/> <br><br>
 Student Country: 
 <form:select path="country">
 <form:options items="${countryList}"/>
 <%-- <form:option value="USA">USA</form:option>
  <form:option value="Spain">Spain</form:option>
   <form:option value="France">France</form:option>
    <form:option value="Ukraine">Ukraine</form:option>--%>
    
 </form:select>
 <br><br>
 Student Favorite Language:
 <form:radiobuttons path="favoriteLanguage" items="${languageList}"/>  <%--path="favoriteLanguage" favoriteLanguage - we take from row entity--%>
  <%--<form:radiobutton path="favoriteLanguage" value="Java" label="Java"/>
  <form:radiobutton path="favoriteLanguage" value="C#" label="C#"/>
   <form:radiobutton path="favoriteLanguage" value="PHP" label="PHP"/>
    <form:radiobutton path="favoriteLanguage" value="JS" label="JS"/>
--%>

  <br><br>
  Student OS:
  <form:checkbox path="operatingSystem" value="MS Windows" label = "MS Windows"/>
    <form:checkbox path="operatingSystem" value="Mac OS" label = "Mac OS"/>
      <form:checkbox path="operatingSystem" value="Linux" label = "Linux"/>
  <br><br>
  
 Student Degree:
 <form:select path="degree">
 <form:options items="${studentDegrees}"/>
 </form:select>
 
  <br><br>
 
 <input type="submit" value="Send">
 </form:form>