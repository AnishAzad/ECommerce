<%-- <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 <style>
  .modal-header, h4, .close {
      background-color: #d9534f;
      color:white !important;
      text-align: center;
      font-size: 30px;
  }
  .modal-footer {
      background-color: #f9f9f9;
  }
</style>

</head>
<body>

<div class="container">
<h1>LOGIN</h1>
 
<form:form action="perform_login" modelAttribute="Usercredential" method="POST">

 <div class="form-group">
<div class="col-lg-6">
      <label for="userid">USER ID</label>
      <form:input type="text" path="userid"/>
</div>
</div><div class="form-group">
<div class="col-lg-6">
      <label for="password">PASSWORD</label>
      <form:input type="text" path="password"/>
</div>
</div><div>
					<input type="submit" value="Login" /> <a href="#">Lost your
						password?</a> <a href="Register">Register</a>
				</div>
				


</form:form>
</div>
</body>
</html>



<!--<form action="Login" modelAttribute="Usercredential" commandName="perform_login" method="POST">-->

<!--<form action="perform_login" method="POST">-->
<form:form method="POST" modelAttribute="Usercredential"  commandName="perform_login" action="Login">

				<h1>Login Form</h1>
				<div>
					<input type="text" placeholder="Userid" required id="userid" path="userid" 
						pattern=".{1,10}" title="minimum length for userid is 1"/>
				</div>
				<div>
					<input type="password" placeholder="Password" required id="password" path="password" 
					title="Enter Valid credentials"/>
				</div>
				<div>
					<input type="submit" value="Log in" /> <a href="#">Lost your
						password?</a> <a href="Register">Register</a>
				</div>
				
			</form:form>
</body>
</html> --%>





<jsp:include page="CommonHeader.jsp"></jsp:include>
<br/>
<div align="center">
<img  src="resources/eleventh.jpg" class="img-responsive" width="500" height="200"/>
</div>
<div align="justify">
<div align="center">

<div class="container" style="margin-top:40px" ">
		<div class="row">
			<div class="col-sm-6 col-md-4 col-md-offset-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<strong> Sign in </strong>
					</div>
					<br/>
					
					<div class="panel-body">
						<form action="perform_login" method="post">
							
							<fieldset>
								<div class="row">
									<div class="center-block">
										
									</div>
								</div>
								<div class="row">
									<div class="col-sm-12 col-md-10  col-md-offset-1 ">
										<div class="form-group">
											<div class="input-group">
												<span class="input-group-addon">
													<i class="glyphicon glyphicon-user"></i>
												</span> 
												<input  class="form-control" placeholder="Userid" required id="userid" name="userid"  type="text" pattern=".{1,10}" title="minimum length for userid is 1" path="userid"/>
											</div>
										</div>
										<div class="form-group">
											<div class="input-group">
												<span class="input-group-addon">
													<i class="glyphicon glyphicon-lock"></i>
												</span>
												<input class="form-control" placeholder="Password" required name="password" type="password" title="Enter Valid credentials" path="password"/>
											</div>
										</div>
										<div class="form-group">
											<input style="background-color:#000000" type="submit" class="btn btn-lg btn-primary btn-block" value="Sign in">
										</div>
									</div>
								</div>
							</fieldset>
							
					</div>
					</div>
					
                </div>
			</div>
		</div>
	</div>
	</div>
	<jsp:include page="CommonFooter.jsp"></jsp:include>
