<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js"></script>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<script>
	var prod = ${list1};
	angular.module('addtocart', []).controller('ProductController',function($scope) 
		{
				$scope.Product = prod;
				$scope.sort = function(keyname) 
				{
					$scope.sortKey = keyname; //set the sortKey to the param passed
					$scope.reverse = !$scope.reverse; //if true make it false and vice versa
				}

		});
</script>


<jsp:include page="CommonHeader.jsp"></jsp:include>
<br/><br/><br/><br/>
<!-- <body background=" resources/admin1.jpg">-->
<div class="bg-content" bgcolor="#ffffff">
	<form:form commandName="Product">
	
		<div ng-app="addtocart" ng-controller="ProductController">
		<table width="100%" bgcolor="#ffffff">
		<tr>
			<td align="center">
			 	<img src="resources/image/{{Product.pid}}.jpg" style="width: 200px; height: 220px" alt="error" height="300" width="300"/>
			</td>
			<td>
				<h2 align="center""color:black"><B><font color="#ffffff">Product Description</font></B></h2>
				<br/>
				<p class="caption"><p><font color="#ffffff">Product Name:{{Product.pname}}</font></p></p>
				<p class="caption"><p><font color="#ffffff">Product Available:{{Product.pquan}}</font></p></p>
				<p class="caption"><p><font color="#ffffff">Price:Rs.{{Product.pcost}}/-</font></p></p>
				<p class="caption"><p><font color="#ffffff">Product Description:{{Product.pdesc}}</font></p></p>
			</td>
		</tr>
	
			<tr>
		<tr></tr>
			<td>
			</br>
			</br>
			<a align="center" href="addcart?adpid={{Product.pid}}"><img height="40" width="150" src="resources/image/addtocart.jpg"/></a>
			</td>
			<td>
			</br>
			</br>
			<!-- <a align="center" href="Login"><img height="40" width="150" src="resources/buynow.png"/></a>-->
			</td>
			</tr>
		
		</table>
	</div>
	</form:form>	
</div>




 <jsp:include page="CommonFooter.jsp"></jsp:include>
 