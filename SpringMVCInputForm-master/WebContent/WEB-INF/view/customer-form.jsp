<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML>
<html>

<head>
<title>Customer registration form</title>
<style>
	.error{color:red}
</style>
</head>

<i>Fill out the form, asterisk (*) means required.</i>

<body>

<form:form action="processForm" modelAttribute="customer">
First name: <form:input path="firstName" /><br>
Last name (*): <form:input path="lastName" />
<form:errors path="lastName" cssClass="error"/>
<br>
Age: <form:input path="age"/>
<form:errors path="age" cssClass="error"/>
<br>
Postal Code: <form:input path="postalCode"/>
<form:errors path="postalCode" cssClass="error"/>
<br>
Course Code: <form:input path="courseCode"/>
<form:errors path="courseCode" cssClass="error"/>

<input type="submit" value="Submit"/>

</form:form>



</body>


</html>