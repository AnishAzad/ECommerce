<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<jsp:include page="Admin.jsp"></jsp:include>
<div class="bg-content">
  <div class="container">
     <div align="Center">
<h3>Edit a Product</h3>
</br><br/>
<form:form action="EditProduct1" method="POST" commandName="Product">

  <fieldset>
      
      <p>
      	<label>Product Id:</label>
         <form:input type="text" path="pid" readonly="true"/>
      </p>

       <p><label >Product Quantity</label>
         <form:input type="text" path="pquan"/>
      </p>
       <p><label >Product Price</label>
         <form:input type="text" path="pcost"/>
      </p>

      <p><input type="submit" value="Update Product"/></p>
    </fieldset>
  </form:form>  
  </div>
  </div>
  </div>    
</div>
<jsp:include page="CommonFooter.jsp"></jsp:include>
