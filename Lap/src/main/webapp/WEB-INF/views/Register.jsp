<%-- 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
<h1>REGISTRATION</h1>
 
<form:form method="POST" modelAttribute="Register" action="Register">

 <div class="form-group">
<div class="col-lg-6">
      <label for="userid">USER ID</label>
      <form:input type="text" path="userid"/>
</div>
</div><div class="form-group">
<div class="col-lg-6">
      <label for="name">NAME</label>
      <form:input type="text" path="name"/>
</div>
</div>
 


    
    <div class="form-group">
<div class="col-lg-6">
      <label for="username">USER NAME</label>
      <form:input path="username"/>
      
</div>
</div>
 
  
<div class="form-group">
<div class="col-lg-6">
      <label for="password">PASSWORD</label>
      <form:input path="password"/>
</div>
</div>



<div class="form-group">
<div class="col-lg-6">
      <label for="mobno">mobile no</label>
      <form:input path="mobno"/>
</div>
</div>
  

<div class="form-group">
<div class="col-lg-6">
      <label for="email">email Id</label>
      <form:input path="email"/>
</div>
</div>
    

    
<div class="form-group">
<div class="col-lg-6">
    <label for="addrs">Address</label>
    <form:input path="addrs"/>
</div>
</div>    
  
    

<button type="submit" class="btn btn-default">register</button>

</form:form>
</div>

</body> 
</html> --%>






<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" type="text/css" href="assets/css/bootstrap.css">

		<!-- Website CSS style -->
		<link rel="stylesheet" type="text/css" href="assets/css/main.css">

		<!-- Website Font style -->
	    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">
		
		<!-- Google Fonts -->
		<link href='https://fonts.googleapis.com/css?family=Passion+One' rel='stylesheet' type='text/css'>
		<link href='https://fonts.googleapis.com/css?family=Oxygen' rel='stylesheet' type='text/css'>


<script type="text/javascript">
window.alert = function(){};
var defaultCSS = document.getElementById('bootstrap-css');
function changeCSS(css){
    if(css) $('head > link').filter(':first').replaceWith('<link rel="stylesheet" href="'+ css +'" type="text/css" />'); 
    else $('head > link').filter(':first').replaceWith(defaultCSS); 
}
$( document ).ready(function() {
  var iframe_height = parseInt($('html').height()); 
  window.parent.postMessage( iframe_height, 'http://bootsnipp.com');
});


    function validate()
    {
    	alert("welcome");
    	var pwd=document.getElementById("pwd");
    	var cpwd=document.getElementById("pwd");
    	if(pwd==cpwd)
    		{
    		return true;
    		}
    	else
    		{
    		alert("Password does not match");
    		    		return false;
    		}
    }
    </script>
		
		<title>Register Form</title>

    <meta charset="utf-8">
    <meta name="robots" content="noindex">

    <title>Register Page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <style type="text/css">
   
   <!--body-->
html{
     height: 100%;
 	background-repeat: no-repeat;
 	background-color: #d3d3d3;
 	font-family: 'Oxygen', sans-serif;
}

.main{
 	margin-top: 70px;
}



hr{
	width: 10%;
	color: #fff;
}

.form-group{
	margin-bottom: 15px;
}

label{
	margin-bottom: 15px;
}

input,
input::-webkit-input-placeholder {
    font-size: 11px;
    padding-top: 3px;
}

.main-login{
 	background-color: #fff;
    /* shadows and rounded borders */
    -moz-border-radius: 2px;
    -webkit-border-radius: 2px;
    border-radius: 2px;
    -moz-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
    -webkit-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
    box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);

}

.main-center{
 	margin-top: 30px;
 	margin: 0 auto;
 	max-width: 330px;
    padding: 40px 40px;

}

.login-button{
	margin-top: 5px;
}

.login-register{
	font-size: 11px;
	text-align: center;
}

    </style>
 
		<jsp:include page="CommonHeader.jsp"></jsp:include>
		<div class="container">
			<div class="row main">
				<div class="panel-heading">
	               <div class="panel-title text-center">
	               		<h3><u><font color="white">Register Here...Its Free!!!</font></u></h3>
	               		<hr />
	               	</div>
	            </div> 
				<div class="main-login main-center">
					<form:form action="Register" commandName="Register" method="POST" onsubmit="return validate">
						
						<div class="form-group">
							<label >Enter your Name</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
									<form:input type="text" class="form-control" name="name" id="name"  placeholder="Name" path="name" />
								</div>
							</div>
						</div>
							
							<div class="form-group">
							<label>Enter your Userid<label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
									<form:input type="text" class="form-control" name="userid" id="userid"  placeholder="User id" path="userid" min="1" max="10"/>
								</div>
							</div>
						</div>						

						<div class="form-group">
							<label >Enter your Email</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
									<form:input type="text" class="form-control" name="email" id="email"  placeholder="Email ID" path="email" />
								</div>
							</div>
						</div>
                           	<div class="form-group">
							<label >Enter Mobile Number</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
									<form:input type="text" class="form-control" name="mobno" id="mobno"  placeholder=" Mobile No" path="mobno"/>
								</div>
							</div>
						</div>
						

						<div class="form-group">
							<label >Enter Password</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
									<form:input type="password" class="form-control" name="password" id="password"  placeholder="Password" path="password"/>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label >Enter Confirm Password</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
									<input type="password" class="form-control" name="last_name" id="cpwd"  placeholder=" Confirm Password " path="password"/>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label >Contact Address</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
									<form:input type="textarea" class="form-control" name="last_name" id="lname"  placeholder="Contact Address	" path="addrs"/>
								</div>
							</div>
						</div>
						

						<div class="form-group ">
							<form:button style="background-color:#000000" type="submit" class="btn btn-primary btn-lg btn-block login-button">Register</form:button>
						</div>
						<div class="login-register">
				            <a href="Login.jsp">Login</a>
				         </div>
					</form:form>
				</div>
			</div>
		</div>
