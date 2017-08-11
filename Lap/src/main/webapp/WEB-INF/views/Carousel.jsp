<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <jsp:include page="/WEB-INF/views/CommonHeader.jsp"/> 
 <div class="container-fluid">
<div id="myCarousel" class="carousel slide" data-ride="carousel">
            
            <ol class="carousel-indicators">
                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                <li data-target="#myCarousel" data-slide-to="1"></li>
                <li data-target="#myCarousel" data-slide-to="2"></li>
                <li data-target="#myCarousel" data-slide-to="3"></li>
            </ol>
            <div class="carousel-inner" role="listbox">
                <div class="item active">
                    <img class="first-slide home-image" src="resources\image\img1.jpg" alt="first slide" width="1600" height="575" >
                    <div class="container">
                        <div class="carousel-caption">
                            <!-- <h1>WELCOME TO THE MOBILE STORE</h1>
                            <p>Here You Can Browse And Buy Mobiles.Order Now For Your Amazing New Arrivals</p> -->
                        </div>
                    </div>
                </div>
                <div class="item">
                    <img class="second-slide home-image" src="resources\image\sQ2rN979w.jpg" alt="Second slide" width="1600" height="575">
                    <div class="container">
                        <div class="carousel-caption">
                            <<!-- h1>The Mobile Store.</h1>
                            <p>online shopping can make your life more easier</p> -->
                        </div>
                    </div>
                </div>
                <div class="item">
                    <img class="third-slide home-image " src="resources\image\MT_Reach_2301_shaif_clp.jpg" alt="Third slide" width="1700" height="590">
                    <div class="container">
                        <div class="carousel-caption">
                            <!-- <h1>The Mobile You Love</h1> -->
          
                        </div>
                    </div>
                </div>
                 <div class="item">
                    <img class="forth-slide home-image " src="resources\image\windowlaptop_24.jpg" alt="forth slide" width="1700" height="590"> 
                    <div class="container">
                        <div class="carousel-caption">
                           
                           
                        </div>
                    </div>
                </div>
            </div>
            <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                <span class="glyphicon glyphicon-chevron-left"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right" ></span>
                <span class="sr-only">Next</span>
            </a>
        </div>

</div>
<%-- 	<jsp:include page="/WEB-INF/views/CommonFooter.jsp"/> --%>
</body>
</html>