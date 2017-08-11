<%-- <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="CommonHeader.jsp"/>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js"></script>
<!-- <script>
var prod = ${cart};
  angular.module('repeatSample', []).controller('SellerController', function($scope)
   {
                 $scope.Sellers=prod;
                 $scope.value=1; 
                 $scope.change=function(value)
                 {
                     $scope.products.qty=Number($scope.value);
                  };           
    });
 </script> -->

 <div class="container">
<c:choose>
<c:when test="${empty count}">
List is empty
</c:when>
<c:otherwise>
  <form:form class="form-horizontal" method="get" action="updateqty"> 
 
<table id="cart" border="1" bordercolor="#ffffff" >
    				<thead>
						<tr  style="font-size: medium; color: white;">
							<th style="width:50%">Product</th>
							<th style="width:10%">Price</th>
							<th style="width:8%">Quantity</th>
							<th style="width:22%" class="text-center">Subtotal</th>
							<th style="width:10%"></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${cartitm}" var="ci">
						<form action="updateqty" method="get">
						<tr>
						
							<td data-th="Product" style="font-size: medium; color: white;">
								<div class="row center">
								</br>
								<div align="center">
									<img src="resources/${ci.pid}.jpg" alt="..." height="100" width="100" class="img-responsive"/>
									
									<h4>${ci.pname}</h4>
									</div>										
								</div>
							</td>
							<td data-th="Price"  style="font-size: medium; color: white;">${ci.price}</td>
							<td data-th="Quantity"  style="font-size: medium; color: black;">
								<input type="text" name="qty" value="${ci.qty}" />
							
							
							<input type="hidden" name="pid" value="${ci.pid}"/> <input type="submit" value="update"></td>
							<td data-th="Subtotal" class="text-center"  style="font-size: medium; color: white;">${ci.qty*ci.price}</td>
							<td class="actions" data-th="">
							
								<a class="btn btn-danger btn-sm"  href="removeitem?pid=${ci.pid}"><i class="fa fa-trash-o"></i></a>
													
							</td>
							<td>
							</td>
							</tr>
						</form>	
	
						
						</c:forEach>
						
					
					
					<tfoot>
						<tr class="visible-xs">
							<td class="text-center"  style="font-size: medium;"><font color="#ffffff"><strong>Total: </strong></font></td>
						</tr>
						<tr>
							<td><a align="center" href="FullProduct"><img height="40" width="150" src="resources/continue.png"/></a></td>
							<td colspan="2" class="hidden-xs"></td>
							<td class="hidden-xs text-center"><font color="#ffffff"><strong>Total:${sessionScope.gtotal}</strong></font></td>
							<td><a align="center" href="billingAddress"><img height="40" width="150" src="resources/checkout.gif"/></a></td>
						</tr>
					</tfoot>
				</table>
				</form:form>
			
				
				
</div>
	
	<jsp:include page="CommonFooter.jsp"/> --%>
















 <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js"></script>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="CommonHeader.jsp"></jsp:include>
	<script>
	var prod = ${list1};
	angular.module('addtocart', []).controller('ProductController',function($scope) 
		{
				$scope.Product = prod;
				$scope.value=1; 
                $scope.change=function(value)
                {
                    $scope.products.qty=Number($scope.value);
                     };  
		});

</script>

<head>
<style type="text/css">
.table>tbody>tr>td, .table>tfoot>tr>td{
    vertical-align: middle;
}
@media screen and (max-width: 600px) {
    table#cart tbody td .form-control{
		width:20%;
		display: inline !important;
	}
	.actions .btn{
		width:36%;
		margin:1.5em 0;
	}
	
	.actions .btn-info{
		float:left;
	}
	.actions .btn-danger{
		float:right;
	}
		
	
	table#cart thead { display: none; }
	table#cart tbody td { display: block; padding: .6rem; min-width:320px;}
	table#cart tbody tr td:first-child { background: #333; color: #fff; }
	table#cart tbody td:before {
		content: attr(data-th); font-weight: bold;
		display: inline-block; width: 8rem;
	}
	
</style>
</head>
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
<div class="container">
<form:form commandName="Product">
		<!-- <h1 class="page-header">Products</h1>-->
		<div ng-app="addtocart" ng-controller="ProductController">
	<table id="cart" class="table table-hover table-condensed" border="1" border-color="black" bgcolor="#dfdfdf" >
    				<thead>
						<tr>
							<th style="width:50%">Product</th>
							<th style="width:10%">Price</th>
							<th style="width:8%">Quantity</th>
							<th style="width:22%" class="text-center">Subtotal</th>
							<th style="width:10%"></th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td data-th="Product">
								<div class="row">
									<div class="col-sm-2 hidden-xs"><img src="resources/image/{{prod.pid}}.jpg" alt="..." class="img-responsive" height="150" width="150"/></div>
									<div class="col-sm-10">
										<p class="nomargin">{{prod.pname}}</p>
										<p>{{prod.pdesc}}</p>
									</div>
								</div>
							</td>
							<td data-th="Price">{{prod.pcost}}</td></h3>
							<td data-th="Quantity">
								<input type="number" class="form-control text-center" ng-model="value"  ng-change="change

(value)" min="1">
							</td>
							<td data-th="Subtotal" class="text-center"  style="font-size: medium; color: white;">

{{value*ci.price}}</td>
							<td class="actions" data-th="">
								<!-- <button class="btn btn-info btn-sm"><i class="fa fa-refresh"></i></button>-->
								<button class="btn btn-danger btn-sm" href="removeitem?pid={{ci.pid}}"><i class="fa fa-trash-o"></i></button>								
							</td>
						</tr>
					</tbody>
					<tfoot>
					<tr class="visible-xs">
							<td class="text-center"  style="font-size: medium; color: white;" ng-model="total"><strong>Total: 

</strong></td>
						</tr>
						<tr>
							<td><a href="FullProduct"><img height="50" width="200" src="resources/image/continue.jpg"/></a></i> </a></td>
								<td colspan="2" class="hidden-xs">
							<td class="hidden-xs text-center"><strong>Total</strong></td>
							<!--  <td><a href="checkout"><img height="50" width="200" src="resources/checkout.gif"/></a> <i class="fa fa-angle-right"></i></td>-->        
						</tr>
					</tfoot>
				</table>
				</div>
				</form:form>
</div>




 <jsp:include page="CommonFooter.jsp"></jsp:include>
  