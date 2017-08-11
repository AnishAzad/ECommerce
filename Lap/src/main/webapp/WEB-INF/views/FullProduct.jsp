<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js"></script>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<jsp:include page="CommonHeader.jsp"></jsp:include>
<script>
	var prod = ${list};
	angular.module('ViewProduct', []).controller('ProductController',function($scope) 
		{
				$scope.Product = prod;
				$scope.sort = function(keyname) 
				{
					$scope.sortKey = keyname; //set the sortKey to the param passed
					$scope.reverse = !$scope.reverse; //if true make it false and vice versa
				}

		});
</script>
</br></br>
<body>
<div class="bg-content">
<form:form commandName="Product">
	

	<div class="container">
	<div class="row">
    <div class="col-lg-12">
    <div ng-app="ViewProduct" ng-controller="ProductController">
	<div  class ng-repeat="prod in Product">
	<div class="col-lg-3 col-md-4 col-xs-6 thumb">
      <a class="thumbnail"  href="ProductDescription?id={{prod.pid}}">
        <p>{{prod.pname}}</p> 
  <img class="img-responsive" src="resources/image/{{prod.pid}}.jpg" style="width: 150px; height: 170px"/>
  <p >Rs.{{prod.pcost}}</p>
      </a>
      </div>
      </div>
      </div>
   </div>
   </div>
   </div>
   
   	
   </form:form>
   </div>    
		
		</body>
		</html>
