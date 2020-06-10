<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>

<html>

<head>
<title>
Customer Confirmation Page</title>
</head>
<body>
The Customer's name is: ${customer.firstName} ${customer.lastName}
<br>
The Customer's age is: ${customer.age}
<br>
The Customer lives at: ${customer.postalCode}
<br>
The Course code is: ${customer.courseCode}
</body>

</html>