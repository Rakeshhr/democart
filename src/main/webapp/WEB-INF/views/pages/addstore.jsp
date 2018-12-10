<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="header">
  
  <ol id="menu">
    <li ><a href="home.html">Add Item</a>
    </li>
    
    <li class="active_menu_item"><a href="addstore.html" style="color:#FFF">Add Store</a>
    </li>
    <li><a href="addshoppinglist.html">Add Shopping List</a>
    </li>
    <li><a href="displaystore.html">Display Stores</a></li>
    <li><a href="displayitem.html">Display Items</a></li>
  </ol>
</div>
	<div>
  <form action="addstore.html" method="post">
  <h3>Enter the following Details</h3>
    <label>Store Name</label><br>
    <input type="text" id="storename" name="storename">
	<br>
    <label>Tel No  </label><br>
    <input type="text" id="telno" name="telno" >
    <br>
    <label>Location</label><br>
    <input type="text" id="location" name="location">
    <br>
    <label>Working Hours</label><br>
    <input type="text" id="workinghours" name="workinghours">
    <br>
    <label>Weekly Holiday</label><br>
    <input type="text" id="weeklyholiday" name="weeklyholiday">

    <input type="submit" value="Submit">
  </form>
</div>

</body>
</html>