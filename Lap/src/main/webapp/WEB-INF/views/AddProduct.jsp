<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<p>Enter the Product Details</p>


<div class="main-login main-center">
<form:form method="POST" action="AddProduct" modelAttribute="prdt" enctype="multipart/form-data">
						
				

<div class="form-group">
<div class="col-lg-6">
<label for="product id">Enter Product Id</label>
<form:input  path="pid" id="product id"/>
</div>
</div>
<div class="form-group">
<div class="col-lg-6">
<label for="product name">Enter Product name</label>
<form:input  path="pname" id="product name"/>
</div>
</div>
<div class="form-group">
<div class="col-lg-6">
<label for="product description">Enter Product Description</label>
<form:input  path="pdesc" id="product description"/>
</div>
</div>
<div class="form-group">
<div class="col-lg-6">
<label for="product price">Enter Product Price</label>
<form:input  path="pcost" id="product price"/>
</div>

</div>
<div class="form-group">
<div class="col-lg-6">
<label for="product quantity">Enter Product quantity</label>
<form:input  path="pquan" id="product quantity"/>
</div>
</div>
<div class="form-group">
							<label>Image Upload</label>

<div class="form-group">
<div class="col-lg-6">
    <label for="product image">Upload Image</label>
    <form:input path="pimage"  id="product image" type="file"/>
</div>
 </div>
 </div> 



 <button type="submit" class="btn btn-success">ADD-PRODUCT</button>
</form:form>
</div>
</div>
</body>
</html>


