<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <title>Hello, world!</title>
    <style type="text/css">
    .result {
    	width: 100%;
    	border-collapse: collapse;
    	background-color: #f2f2f2;
    }

    .result td {
    	text-align: center;
    	height: 25px;
    	border: 1px solid black;
    }

    th {
    	text-align: center;
    	height: 50px;
    	border: 1px solid black;
    }

    input[type=submit] {
    	background-color: #1E90FF;
    	color: white;
    	padding: 12px 20px;
    	border: none;
    	border-radius: 4px;
    	cursor: pointer;
    }

    input[type=submit]:hover {
      background-color: #4169E1;
    }
    </style>
  </head>
  <body>

<div class="container">

<c:if test="${tshirts.size() != 0}">
			<header>
			<div>
			<a href="home.jsp">Home Page</a>
				<table width = "100%">
					<tr>
						<td>
							<h2>
								<c:out value="${tshirts.size()}"></c:out> Matching Tshirts Found!
							</h2>
						</td>
						<td align = "right">
							<form action="/logout" th:action="@{/logout}" method="post">
							<input type = "submit" value = "SignOut"/>
							</form>
						</td>
					</tr>
				</table>
			</div>
		</header>
			<table class = "result">
			<tr>
				<th> Id </th>
				<th> Name </th>
				<th> Colour </th>
				<th> Gender Recommendation </th>
				<th> Size </th>
				<th> Price </th>
				<th> Rating </th>
				<th> Availability </th>
			</tr>
			<c:forEach items = "${tshirts}" var = "tshirts">
				<tr>
                    <td>${tshirts.getId()}</td>
  					<td>${tshirts.getName()}</td>
  					<td>${tshirts.getColour()}</td>
  					<td>${tshirts.getGender_recommendation()}</td>
  					<td>${tshirts.getSize()}</td>
  					<td>${tshirts.getPrice()}</td>
  					<td>${tshirts.getRating()}</td>
  					<td>${tshirts.getAvailability()}</td>
				</tr>
  			</c:forEach>

		</table>
		</c:if>
		<br>
		<br>
		<c:if test="${tshirts.size() == 0}">
			<header>
			<div>
				<table width = "100%">
					<tr>
						<td>
							<h2>
								Sorry! No matching Tshirts found!
							</h2>
						</td>
						<td align = "right">
							<form action="#" th:action="@{/logout}" method="post">
							<input type = "submit" value = "SignOut"/>
							</form>
						</td>
					</tr>
				</table>
			</div>
		</header>
		</c:if>
		<br>
</div>


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
  </body>
</html>