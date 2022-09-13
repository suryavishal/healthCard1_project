<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	    <%@include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient Registration</title>
</head>
<body>
	<h2>Patient Registration</h2>
	<form action="saveCards" method="post">
		<table>
			<tr>
				<th>Aadhaar card</th>
				<td><input type="text" name="adharCard"></td>
			</tr>

			<tr>
				<th>Patient Name</th>
				<td><input type="text" name="name"></td>
			</tr>

			<tr>
				<th>Age</th>
				<td><input type="text" name="age"></td>
			</tr>

			<tr>
				<th>Gender</th>
				<td><input type="text" name="gender"></td>
			</tr>

			<tr>
				<th>Disease History</th>
				<td><input type="text" name="diseaseHistory"></td>
			</tr>

			<tr>
				<th>Duration of Illness</th>
				<td><input type="text" name="durationOfIllness"></td>
			</tr>

			<tr>
				<th>Doctor Name</th>
				<td><input type="text" name="doctorName"></td>
			</tr>



			<tr>
				<td><input type="submit" value="save" /></td>
			</tr>


		</table>
	</form>
	${message}
</body>
</html>