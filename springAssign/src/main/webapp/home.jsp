<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <title>Home Search Page</title>

    <style type="text/css">
    		.container {
    	border-radius: 5px;
    	background-color: #f2f2f2;
    	padding: 20px;
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

    input[type=date], select {
       width: 100%;
      padding: 12px; /* Some padding */
      border: 1px solid #ccc; /* Gray border */
      border-radius: 4px; /* Rounded borders */
      margin-top: 3px; /* Add a top margin */
      margin-bottom: 3px; /* Bottom margin */
    }
    </style>

  </head>
  <body>
 <div class="container mt-2">
<c:if test="${email != null}">
		<header>
			<div>
				<table width="100%">
					<tr>
						<td>
							<h2>
								Welcome
								<c:out value="${email}" />
								! You can search your Tshirt here.
							</h2>
						</td>
						<a href="#">Login</a><br>
						<a href="tshirtresult.jsp">Results Page</a>
						<td align="right">
							<form action="/logout"  method="post">
								<input type="submit" value="SignOut" />
							</form>
						</td>
					</tr>
				</table>
			</div>
		</header>
		<div align="center" class="container">
			<form action="search" method="POST">
				<table>
					<tr>
						<td>Colour :</td>
						<td><input type="text" name="colour" required/></td>
					</tr>
					<tr>
						<td>Size :</td>
						<td><input type="text" name="size" required/></td>
					</tr>
					<tr>
                        <td>Gender :</td>
						<td><select name="gender_recommendation" required>
								<option value="M">Male</option>
								<option value="F">Female</option>
								<option value="U">Unisex</option>
						</select></td>
					</tr>
					<tr>
                         <td>Sort by :</td>
						<td><select name="sortingType" required>
								<option selected value="price">Price</option>
								<option value="rating">Rating</option>
						</select></td>
					</tr>
					<tr>
						<td></td>
						<td align="right"><input type="submit" value="Search" /></td>
					</tr>
				</table>
			</form>
		</div>
	</c:if>
	<c:if test="${email == null}">
		<c:redirect url="index.jsp" />
	</c:if>
 </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
  </body>
</html>