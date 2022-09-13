<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of All Patient</title>
</head>
<body>

	<h2>List of All Patient</h2>

	<table border ='3'>
		<tr>
			<th>Aadhaar card</th>
			<th>Name</th>
			<th>Age</th>
			<th>Gender</th>
			<th>Patient History</th>
			<th>Duration of Illness</th>
			<th>Doctor Name</th>
			<th>Delete</th>
			<th>update</th>
		</tr>
		<c:forEach var="hcard" items="${hcard}">

			<tr>
				<td>${hcard.adharCard}</td>
				<td>${hcard.name}</td>
				<td>${hcard.age}</td>
				<td>${hcard.gender}</td>
				<td>${hcard.diseaseHistory}</td>
				<td>${hcard.durationOfIllness}</td>
				<td>${hcard.doctorName}</td>
				<td><a href ="delete?id=${hcard.id}">***</a></td>
				<td><a href ="update?id=${hcard.id}">^^^</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>