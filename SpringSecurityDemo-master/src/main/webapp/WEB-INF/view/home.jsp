<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE HTML>
<html>

<head>
<title>
The Company
</title>
</head>

<body>

<h2>Welcome to The Company</h2>
<hr>
<p>
This is the home page of The Company
</p>

<hr>

<!-- display user name and role -->

<p>

	User: <security:authentication property="principal.username" />
	<br><br>
	Role(s): <security:authentication property="principal.authorities"/>

</p>


<hr>

<security:authorize access="hasRole('ADMIN')">
<!-- Add a link to point to /leaders (for the managers) -->

<p>
<a href="${pageContext.request.contextPath}/leaders" >Admin meeting </a>
(Only for managerial members)


</p>


</security:authorize>

<security:authorize access="hasRole('MANAGER')">

<a href="${pageContext.request.contextPath }/managers">Managers meeting</a>
</security:authorize>



<hr>

<!-- Add log out button -->
<form:form action="${pageContext.request.contextPath}/logout" 
			method="POST">
<input type="submit" value="Logout"/>

</form:form>
</body>


</html>