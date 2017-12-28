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

<body>
<div class="container">
<div class="page-header">
<div  class="row">
<div class="caol-md-6">
<div class="panel with nav tabs panel-primary">
<div class="panel heading">
	<ul class="nav nav-tabs">
		<li class="active"><a href="#tab1" data-toggle="tab" >Category</a>
		<li><a href="#tab2" data-toggle="tab" >Supplier</a>
		<li><a href="#tab3" data-toggle="tab" >Product</a>
	</ul>
</div>

<div class="panel-body">
<div class="tab-content">

<div class="tab-pane fade in active" id="tab1">
<form method="post" action="<c:url value="/saveSupp"/>"class="form-signin">
<span id="reauth-email" value="reauth-email"></span>
<h4 class="input-title" >Supplier Id</h4><br>
<input class="form-control" type="number" name="sid" required>

<h4 class="input-title" >Supplier Name</h4><br>
<input class="form-control" type="text" name="sname" required>
</form>
</div>


<br>
<button class="btn btn-lg btn-primary" type="submit">Save</button>
<button class="btn btn-lg btn-warning" type="reset">Cancel</button>


<div class="tab-pane fade" id="tab2">
<form method="post" action="<c:url value="/saveCat"/>"class="form-signin">
<span id="reauth-email" value="reauth-email"></span>
<h4 class="input-title" >Category Id</h4><br>
<input class="form-control" type="number" name="cid" required>

<h4 class="input-title" >Category Name</h4><br>
<input class="form-control" type="text" name="cname" required>
</form>
</div>

<br>
<button class="btn btn-lg btn-primary" type="submit">Save</button>
<button class="btn btn-lg btn-warning" type="reset">Cancel</button>


<div class="tab-pane fade" id="tab3">
<form method="post" action="<c:url value="/saveProd"/>"class="form-signin" enctype="multipart/form-data">
<span id="reauth-email" value="reauth-email"></span>
<h4 class="input-title" >Product Name</h4><br>
<input class="form-control" type="text" name="pName" required>

<h4 class="input-title" >Product Description</h4><br>
<input class="form-control" type="text" name="pDescription" required>

<h4 class="input-title" >Product Price</h4><br>
<input class="form-control" type="number" name="price" required>
	<div class="form-group">
		<table>
		 <tr>
		    <td>Select Supplier</td>
		    <td>
			<select class="form-control" name="pSupplier" required></select>
			<option class="">--Select Supplier</option>
			<c:foreach items="${satlkist}" var="sat">
			<option value="${sat.sid}">sat.supplierName</option>	
			</c:foreach></td>
			</tr>
		</table>



	</div>

<h4 class="input-title" >Product Stock</h4><br>
<input class="form-control" type="number" name="pstock" required>


</form>
</div>


<br>
<button class="btn btn-lg btn-primary" type="submit">Save</button>
<button class="btn btn-lg btn-warning" type="reset">Cancel</button>



</div>
</div>


</div>
</div>
</div>
</div>
</div>
</body>
</html>