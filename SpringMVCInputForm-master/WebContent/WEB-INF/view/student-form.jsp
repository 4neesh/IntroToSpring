<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>
<title>The Student Form</title>
<head>

</head>
<body>

<form:form action="processForm" modelAttribute="student">

<!--  this will call the get methods -->
	First name: <form:input path="firstName"/>
	<br>
	<br>
	Last name: <form:input path="lastName"/>
	
	<br><br>
	Country: 
	<form:select path="country">
		<form:options items="${student.countryOptions}"/>
		</form:select><br><br>
		Select your favourite language:<br>
		Java<form:radiobutton path="favouriteLanguage" value="Java"/>
		<br>
		Python<form:radiobutton path="favouriteLanguage" value="Python"/>
		
		
		<br><br>
		Select operating systems you work on<br>
		
		Operating Systems:<br><br>
		
		Linux<form:checkbox path="operatingSystems" value="Linux"/>
		Windows<form:checkbox path="operatingSystems" value="Windows"/>
		Mac<form:checkbox path="operatingSystems" value="Mac"/>
		Ubuntu<form:checkbox path="operatingSystems" value="Ubuntu"/>
		
		<br><br>
		
		
	<!-- this will call the set methods -->
	<input type="submit" value="Submit"/>

</form:form>

</body>


</html>