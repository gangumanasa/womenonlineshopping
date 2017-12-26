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

<div class="contianer">

<h2> Registration Form</h2>

<div class="col-lg-8">

<div class="row">

<form:form modelAttribute="user" action="saveRegister" method="post">

<div class="form-group">
<lable>Name:</lable><br>
<form:input path="Name" class="formcontrol" placeholder="Enter Name"/>
</div>

<div class="form-group">
<lable>Email:</lable><br>
<form:input path="Email" class="formcontrol" placeholder="Enter Email"/>
</div>

<div class="form-group">
<lable>Password:</lable><br>
<form:input path="Password" class="formcontrol" placeholder="Enter Password"/>
</div>

<div class="form-group">
<lable>Address:</lable><br>
<form:input path="Address" class="formcontrol" placeholder="Enter Address"/>
</div>

<div class="form-group">
<lable>Phone:</lable><br>
<form:input path="Phone" class="formcontrol" placeholder="Enter Phone"/>
</div>

<br><br>
<button type="submit"  class="btn btn-lg btn-info">SUBMIT</button>

<button type="reset"  class="btn btn-lg btn-info">CANCEL</button>

<br><br><br>
</form:form>


</div>
</div>
</div>


</body>
</html>