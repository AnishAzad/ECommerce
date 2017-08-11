<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<jsp:include page="Admin.jsp"></jsp:include>
<div class="bg-content">
  <div class="container">
     <div align="Center">
<h3>Edit a Supplier</h3>
</br><br/>
<form:form action="EditSupplier1" method="POST" commandName="Supplier">

  <fieldset>
      
      <p>
      	<label>Supplier Id:</label>
         <form:input type="text" path="sid" readonly="true"/>
      </p>
      <p>
      <label>Supplier Name:</label>
         <form:input type="text" path="sname" readonly="true"/>
      </p>
       <p><label >Supplier Description</label>
         <form:input type="text" path="sdesc"/>
      </p>

      <p><input type="submit" value="Update Supplier"/></p>
    </fieldset>
  </form:form>  
  </div>
  </div>
  </div>    
</div>
<jsp:include page="CommonFooter.jsp"></jsp:include>
