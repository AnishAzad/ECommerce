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
<center><p>Enter the Supplier Details</p>
<form:form method="POST" modelAttribute="Supplier" action="AddSupplier">

<div class="form-group">
<div class="col-lg-6">
<label for="supplier id">Enter Supplier Id</label>
<form:input type="text" path="sid" id="supplier id"/>
</div>

<div class="form-group">
<div class="col-lg-6">
<label for="supplier name">Enter Supplier name</label>
<form:input  path="sname" id="supplier name"/>
</div>

<div class="form-group">
<div class="col-lg-6">
<label for="supplier description">Enter Supplier Description</label>
<form:input  path="sdesc" id="supplier description"/>
</div>
 

 <button type="submit" class="btn btn-success">ADD-SUPPLIER</button>

</form:form>


</div>
</div>
</div>
</center>
</body>
</html>

