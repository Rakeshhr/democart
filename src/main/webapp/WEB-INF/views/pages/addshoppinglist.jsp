<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
input[type=text], select {
  width: 50%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 50%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
</style>
<script type="text/javascript">
function send()
{
	alert("Shopping List Added Succesfully");
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="header">  
  <ol id="menu">
    <li ><a href="home.html">Add Item</a>
    </li>
    
    <li ><a href="addstore.html" >Add Store</a>
    </li>
    <li class="active_menu_item"><a href="addshoppinglist.html" style="color:#FFF">Add Shopping List</a>
    </li>
    <li><a href="displaystore.html">Display Stores</a></li>
    <li><a href="displayitem.html">Display Items</a></li>
  </ol>
</div>

<div>
  <form action="addshoppinglist.html" method="post" id="addshoppinglist">
  <h3>Enter the following Details</h3>
    <label>Store Name</label><br>
    <input type="text" id="storename" name="storename">
	
	</form>
	<br>
	 <form>
	<label>Select Item</label><br>
    <form:select path="addshoppinglist" name="iTEMLIST" id="iTEMLIST" onchange="store()">
		<form:option value="NONE" label="--- Select ---" />
		<form:options items="${ITEMLIST}" />
	</form:select>
	<br>
	<label>Select Store</label><br>
    <form:select path="addshoppinglist" name="sTORELIST" id="sTORELIST">
		<form:option value="NONE" label="--- Select ---" />
		<form:options items="${STORELIST}" />
	</form:select>
	<input type="hidden" id="hid1" name ="hid1">
	<input type="hidden" id="hid1" name ="hid2">
    
  </form>
  
  <input type="submit" value="Submit" onclick="send()">
</div>
</body>
</html>