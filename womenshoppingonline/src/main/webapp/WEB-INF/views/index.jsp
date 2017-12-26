<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!doctype html>
<html lang="en">
<head>
<title>WomenShoppingOnline</title>
<meta name="viewport" content="width=device-width, intial-scale=1">


<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>

<body>
<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>


<div class= "Contianer">

<h2>Women Online Shopping</h2>


<div id ="myCarousel"  class="carousel slide"  Data-ride="Carousel">

	<ol class="Carousel-indicators">
		
		<li data-target= "#myCarousel" data-slide-to="0" class="active"></li>
		<li data-target= "#myCarousel" data-slide-to="1" class="active"></li>
		<li data-target= "#myCarousel" data-slide-to="2" class="active"></li>
		
		
		</ol>

<div class="carousel-inner">

<div class="item-active">
<img class="img-rounded" class="img-responsive centre block" src="<spring:url value="/resources/image1.jpg/"></spring:url><"style=width:100%>
</div>

<div class="item">
<img class="img-rounded" class="img-responsive centre block" src="<spring:url value="/resources/image2.jpg/"></spring:url><"style=width:100%>
</div>

<div class="item">
<img class="img-rounded" class="img-responsive centre block" src="<spring:url value="/resources/image3.jpg/"></spring:url><"style=width:100%>
</div>

</div>

<a class="left carousel-control" href="#mycarousel" data-slide="Prev">
<span class="glyphiocon glyphicon-chevron-left"></span>
<span class="sr-o nly">Previous </span>
</a>

<a class="right carousel-control" href="#mycarousel" data-slide="Next">
<span class="glyphiocon glyphicon-chevron-right"></span>
<span class="sr-only">Next</span>

</a>

</div>

</div>
</body>
</html>
