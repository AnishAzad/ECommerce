<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!--  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js"></script>-->
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script> 
<html>
<script>
  var cate = ${list};
  
  angular.module('showCategory',[]).controller('CategoryController', function($scope)
   {
          $scope.Category=cate;
       
   
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
  <form:form action="AddCategory" method="POST" commandName="Category"> 
<div class="span12" style="text-align: justify; font-size: large; color:silver;">
 <div ng-app="showCategory" ng-controller="CategoryController">
 <br/><br/>
Search:<input type=text placeholder="Search" ng-model="searchText"/>
<div id="heading"><strong> <h3 align="center">Category List </h3></strong></div>
<div align="center">
<table bgcolor="#00FF00" width=\"100%\" border=\"0\" id=\"tab\" >
<tr>         <th bgcolor="white" id=\"td1\">CATEGORY ID</th>
			 <th bgcolor="white" id=\"td2\">CATEGORY NAME</th>
             <th id=\"td3\" bgcolor="white">CATEGORY DESC</th>
             <th bgcolor="white" id=\"td4\">EDIT</th>
             <th bgcolor="white" id=\"td4\">DELETE</th>
             
            
            <!--  <th bgcolor="white" id=\"td6\">PRODUCT IMAGE</th>-->
             <!--  <th bgcolor="white" id=\"td10\">DELETE</th> -->
 </tr>
 <tr class="success" ng-repeat="cate in Category|filter:searchText">

 	<td bgcolor="white">{{cate.cid}}</td>
 	<td bgcolor="white">{{cate.cname}}</td>
 	<td bgcolor="white">{{cate.cdesc}}</td>
 	
    
 	<td bgcolor="white"><a href="EditCategory?cid={{cate.cid}}">Edit</a></td>
 	 <td bgcolor="white"><a href="DeleteCategory?id={{cid=cate.cid}}">Delete</a></td>
 
 </tr>
 </table>
 </div>
 </div>
 </div>
 </form:form>
 
</div>


</body>
</html>