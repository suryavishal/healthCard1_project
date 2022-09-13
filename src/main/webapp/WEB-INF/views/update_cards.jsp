<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	    <%@include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient update</title>
</head>
<body>
	<h2>Patient update</h2>
	<form action="updatepatient" method="post">
		<table>
		
		    <tr>
				<td><input type="hidden" name="id" value ="${hcard.id}" ></td>
			</tr>
		
			<tr>
				<th>Aadhaar card</th>
				<td><input type="text" name="adharCard" value="${hcard.adharCard}"></td>
			</tr>

			<tr>
				<th>Patient Name</th>
				<td><input type="text" name="name" value="${hcard.name}"></td>
			</tr>

			<tr>
				<th>Age</th>
				<td><input type="text" name="age" value="${hcard.age}"></td>
			</tr>

			<tr>
				<th>Gender</th>
				<td><input type="text" name="gender" value="${hcard.gender}"></td>
			</tr>

			<tr>
				<th>Disease History</th>
				<td><input type="text" name="diseaseHistory" value="${hcard.diseaseHistory}"></td>
			</tr>

			<tr>
				<th>Duration of Illness</th>
				<td><input type="text" name="durationOfIllness" value="${hcard.durationOfIllness}"></td>
			</tr>

			<tr>
				<th>Doctor Name</th>
				<td><input type="text" name="doctorName" value="${hcard.doctorName}"></td>
			</tr>



			<tr>
				<td><input type="submit" value="update" /></td>
			</tr>


		</table>
	</form>
	${message}
</body>
</html>