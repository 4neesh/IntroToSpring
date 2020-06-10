<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<title>The Student Confirmation</title>
<head>

</head>
<body>
The Student is confirmed: ${student.firstName} ${student.lastName}
<br><br>
The student is from the country ${student.country}
<br><br>
The student's favourite language is: ${student.favouriteLanguage}
<br><br>

The student uses the following operating systems:
<ul>
	<c:forEach var="temp" items="${student.operatingSystems}">

		<li> ${temp} </li>

	</c:forEach>
</ul>
</body>


</html>