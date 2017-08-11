<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js"></script>
<html>
<script>
  var supp = ${list};
  
  angular.module('showSupplier',[]).controller('SupplierController', function($scope)
   {
          $scope.Supplier=supp;
       
   
          $scope.sort = function(keyname)
          {
              $scope.sortKey = keyname;   //set the sortKey to the param passed
              $scope.reverse = !$scope.reverse; //if true make it false and vice versa
          }
              
    });
</script>
<body>
<jsp:include page="Admin.jsp"></jsp:include>
<!-- <body background=" resources/admin1.jpg">-->
  <div class="container">
  <form:form action="AddSupplier" method="POST" commandName="Supplier"> 
<div class="span12" style="text-align: justify; font-size: large; color:silver;">
 <div ng-app="showSupplier" ng-controller="SupplierController">
 <br/><br/>
Search:<input type=text placeholder="Search" ng-model="searchText"/>
<div id="heading"><strong> <h3 align="center">Supplier List </h3></strong></div>
<div align="center">
<table bgcolor="#00FF00" width=\"100%\" border=\"0\" id=\"tab\" >
<tr>         <th bgcolor="white" id=\"td1\">SUPPLIER ID</th>
			 <th bgcolor="white" id=\"td2\">SUPPLIER NAME</th>
             <th id=\"td3\" bgcolor="white">SUPPLIER DESC</th>
             <th bgcolor="white" id=\"td4\">EDIT</th>
             <th bgcolor="white" id=\"td4\">DELETE</th>
             
            
 </tr>
 <tr class="success" ng-repeat="supp in Supplier|filter:searchText">

 	<td bgcolor="white">{{supp.sid}}</td>
 	<td bgcolor="white">{{supp.sname}}</td>
 	<td bgcolor="white">{{supp.sdesc}}</td>
 	
    
 	<td bgcolor="white"><a href="EditSupplier?sid={{supp.sid}}">Edit</a></td>
 	 <td bgcolor="white"><a href="DeleteSupplier?id={{sid=supp.sid}}">Delete</a></td>
 
 </tr>
 </table>
 </div>
 </div>
 </div>
 </form:form>
 
</div>


</body>
</html>