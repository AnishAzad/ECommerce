<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>

<div class="container">
<center><p>Enter the Category Details</p>
<form:form method="POST" modelAttribute="Category" action="AddCategory">

<div class="form-group">
<div class="col-lg-6">
<label for="category id">Enter Category Id</label>
<form:input type="text" path="cid" id="category id"/>
</div>

<div class="form-group">
<div class="col-lg-6">
<label for="category name">Enter Category name</label>
<form:input  path="cname" id="category name"/>
</div>

<div class="form-group">
<div class="col-lg-6">
<label for="category description">Enter Category Description</label>
<form:input  path="cdesc" id="category description"/>
</div>


 <button type="submit" class="btn btn-success">ADD-CATEGORY</button>

</form:form>


</div>
</div>
</div>
</center>
</body>
</html>

