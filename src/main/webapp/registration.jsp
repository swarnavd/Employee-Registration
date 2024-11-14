<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<main>
		<div class="form">
			<h1>Employee Registration Form</h1>
			<form action="Registration" method="post">
				<div class="box1">Employee Name:<input type="text" name="name"></div>
				<div class="box1">Employee User Name:<input type="text" name="uname"></div>
				<div class="box1">Employee Password:<input type="text" name="pass"></div>
				<div class="box1">Employee Address:<input type="text" name="add"></div>
				<div class="box1">Employee Contact:<input type="text" name="con"></div>
				<input type="submit" value="Submit">
			</form>
		</div>
	</main>

</body>
</html>