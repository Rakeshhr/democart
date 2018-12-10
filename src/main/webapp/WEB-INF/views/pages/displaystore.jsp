<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
#customers {
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

#customers td, #customers th {
	border: 1px solid #ddd;
	padding: 8px;
}

#customers tr:nth-child(even) {
	background-color: #f2f2f2;
}

#customers tr:hover {
	background-color: #ddd;
}

#customers th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #4CAF50;
	color: white;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="header">
  
  <ol id="menu">
    <li ><a href="home.html" >Add Item</a>
    </li>
    
    <li><a href="addstore.html">Add Store</a>
    </li>
    <li><a href="addshoppinglist.html">Add Shopping List</a>
    </li>
    <li class="active_menu_item"><a href="displaystore.html" style="color:#FFF"> Display Stores</a></li>
  	<li><a href="displayitem.html">Display Items</a></li>
  </ol>
</div>
	<table>
		<thead>
			<tr>
				<th>StoreID</th>
				<th>StoreName</th>
				<th>Tel No</th>
				<th>Location</th>
				<th>Working Hour</th>
				<th>Weekly Holiday</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="s" items="${STORELIST}">
				<tr>
					<td><c:out value="${s.id}" /></td>
					<td><c:out value="${s.name}" /></td>
					<td><c:out value="${s.telno}" /></td>
					<td><c:out value="${s.location}" /></td>
					<td><c:out value="${s.workinghours}" /></td>
					<td><c:out value="${s.weeklyholiday}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>